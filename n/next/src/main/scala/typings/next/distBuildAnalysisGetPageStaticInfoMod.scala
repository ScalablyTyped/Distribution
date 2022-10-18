package typings.next

import typings.next.anon.IsDev
import typings.next.anon.PartialMiddlewareConfig
import typings.next.anon.Ssg
import typings.next.distLibLoadCustomRoutesMod.RouteHas
import typings.next.nextBooleans.`false`
import typings.next.typesMod.ServerRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildAnalysisGetPageStaticInfoMod {
  
  @JSImport("next/dist/build/analysis/get-page-static-info", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkExports(swcAST: Any): Ssg = ^.asInstanceOf[js.Dynamic].applyDynamic("checkExports")(swcAST.asInstanceOf[js.Any]).asInstanceOf[Ssg]
  
  inline def getPageStaticInfo(params: IsDev): js.Promise[PageStaticInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPageStaticInfo")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PageStaticInfo]]
  
  inline def getRSCModuleType(source: String): RSCModuleType = ^.asInstanceOf[js.Dynamic].applyDynamic("getRSCModuleType")(source.asInstanceOf[js.Any]).asInstanceOf[RSCModuleType]
  
  trait MiddlewareConfig extends StObject {
    
    var matchers: js.Array[MiddlewareMatcher]
    
    var unstable_allowDynamicGlobs: js.Array[String]
  }
  object MiddlewareConfig {
    
    inline def apply(matchers: js.Array[MiddlewareMatcher], unstable_allowDynamicGlobs: js.Array[String]): MiddlewareConfig = {
      val __obj = js.Dynamic.literal(matchers = matchers.asInstanceOf[js.Any], unstable_allowDynamicGlobs = unstable_allowDynamicGlobs.asInstanceOf[js.Any])
      __obj.asInstanceOf[MiddlewareConfig]
    }
    
    extension [Self <: MiddlewareConfig](x: Self) {
      
      inline def setMatchers(value: js.Array[MiddlewareMatcher]): Self = StObject.set(x, "matchers", value.asInstanceOf[js.Any])
      
      inline def setMatchersVarargs(value: MiddlewareMatcher*): Self = StObject.set(x, "matchers", js.Array(value*))
      
      inline def setUnstable_allowDynamicGlobs(value: js.Array[String]): Self = StObject.set(x, "unstable_allowDynamicGlobs", value.asInstanceOf[js.Any])
      
      inline def setUnstable_allowDynamicGlobsVarargs(value: String*): Self = StObject.set(x, "unstable_allowDynamicGlobs", js.Array(value*))
    }
  }
  
  trait MiddlewareMatcher extends StObject {
    
    var has: js.UndefOr[js.Array[RouteHas]] = js.undefined
    
    var locale: js.UndefOr[`false`] = js.undefined
    
    var regexp: String
  }
  object MiddlewareMatcher {
    
    inline def apply(regexp: String): MiddlewareMatcher = {
      val __obj = js.Dynamic.literal(regexp = regexp.asInstanceOf[js.Any])
      __obj.asInstanceOf[MiddlewareMatcher]
    }
    
    extension [Self <: MiddlewareMatcher](x: Self) {
      
      inline def setHas(value: js.Array[RouteHas]): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
      
      inline def setHasUndefined: Self = StObject.set(x, "has", js.undefined)
      
      inline def setHasVarargs(value: RouteHas*): Self = StObject.set(x, "has", js.Array(value*))
      
      inline def setLocale(value: `false`): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setRegexp(value: String): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    }
  }
  
  trait PageStaticInfo extends StObject {
    
    var middleware: js.UndefOr[PartialMiddlewareConfig] = js.undefined
    
    var rsc: js.UndefOr[RSCModuleType] = js.undefined
    
    var runtime: js.UndefOr[ServerRuntime] = js.undefined
    
    var ssg: js.UndefOr[Boolean] = js.undefined
    
    var ssr: js.UndefOr[Boolean] = js.undefined
  }
  object PageStaticInfo {
    
    inline def apply(): PageStaticInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageStaticInfo]
    }
    
    extension [Self <: PageStaticInfo](x: Self) {
      
      inline def setMiddleware(value: PartialMiddlewareConfig): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
      
      inline def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
      
      inline def setRsc(value: RSCModuleType): Self = StObject.set(x, "rsc", value.asInstanceOf[js.Any])
      
      inline def setRscUndefined: Self = StObject.set(x, "rsc", js.undefined)
      
      inline def setRuntime(value: ServerRuntime): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
      
      inline def setSsg(value: Boolean): Self = StObject.set(x, "ssg", value.asInstanceOf[js.Any])
      
      inline def setSsgUndefined: Self = StObject.set(x, "ssg", js.undefined)
      
      inline def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
      
      inline def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.nextStrings.server
    - typings.next.nextStrings.client
  */
  trait RSCModuleType extends StObject
  object RSCModuleType {
    
    inline def client: typings.next.nextStrings.client = "client".asInstanceOf[typings.next.nextStrings.client]
    
    inline def server: typings.next.nextStrings.server = "server".asInstanceOf[typings.next.nextStrings.server]
  }
}
