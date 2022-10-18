package typings.next.anon

import typings.next.nextStrings.blocking
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppConfig extends StObject {
  
  var appConfig: js.UndefOr[typings.next.distBuildUtilsMod.AppConfig] = js.undefined
  
  var encodedPrerenderRoutes: js.UndefOr[js.Array[String]] = js.undefined
  
  var hasServerProps: js.UndefOr[Boolean] = js.undefined
  
  var hasStaticProps: js.UndefOr[Boolean] = js.undefined
  
  var isAmpOnly: js.UndefOr[Boolean] = js.undefined
  
  var isHybridAmp: js.UndefOr[Boolean] = js.undefined
  
  var isNextImageImported: js.UndefOr[Boolean] = js.undefined
  
  var isStatic: js.UndefOr[Boolean] = js.undefined
  
  var prerenderFallback: js.UndefOr[Boolean | blocking] = js.undefined
  
  var prerenderRoutes: js.UndefOr[js.Array[String]] = js.undefined
  
  var traceExcludes: js.UndefOr[js.Array[String]] = js.undefined
  
  var traceIncludes: js.UndefOr[js.Array[String]] = js.undefined
}
object AppConfig {
  
  inline def apply(): AppConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppConfig]
  }
  
  extension [Self <: AppConfig](x: Self) {
    
    inline def setAppConfig(value: typings.next.distBuildUtilsMod.AppConfig): Self = StObject.set(x, "appConfig", value.asInstanceOf[js.Any])
    
    inline def setAppConfigUndefined: Self = StObject.set(x, "appConfig", js.undefined)
    
    inline def setEncodedPrerenderRoutes(value: js.Array[String]): Self = StObject.set(x, "encodedPrerenderRoutes", value.asInstanceOf[js.Any])
    
    inline def setEncodedPrerenderRoutesUndefined: Self = StObject.set(x, "encodedPrerenderRoutes", js.undefined)
    
    inline def setEncodedPrerenderRoutesVarargs(value: String*): Self = StObject.set(x, "encodedPrerenderRoutes", js.Array(value*))
    
    inline def setHasServerProps(value: Boolean): Self = StObject.set(x, "hasServerProps", value.asInstanceOf[js.Any])
    
    inline def setHasServerPropsUndefined: Self = StObject.set(x, "hasServerProps", js.undefined)
    
    inline def setHasStaticProps(value: Boolean): Self = StObject.set(x, "hasStaticProps", value.asInstanceOf[js.Any])
    
    inline def setHasStaticPropsUndefined: Self = StObject.set(x, "hasStaticProps", js.undefined)
    
    inline def setIsAmpOnly(value: Boolean): Self = StObject.set(x, "isAmpOnly", value.asInstanceOf[js.Any])
    
    inline def setIsAmpOnlyUndefined: Self = StObject.set(x, "isAmpOnly", js.undefined)
    
    inline def setIsHybridAmp(value: Boolean): Self = StObject.set(x, "isHybridAmp", value.asInstanceOf[js.Any])
    
    inline def setIsHybridAmpUndefined: Self = StObject.set(x, "isHybridAmp", js.undefined)
    
    inline def setIsNextImageImported(value: Boolean): Self = StObject.set(x, "isNextImageImported", value.asInstanceOf[js.Any])
    
    inline def setIsNextImageImportedUndefined: Self = StObject.set(x, "isNextImageImported", js.undefined)
    
    inline def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
    
    inline def setIsStaticUndefined: Self = StObject.set(x, "isStatic", js.undefined)
    
    inline def setPrerenderFallback(value: Boolean | blocking): Self = StObject.set(x, "prerenderFallback", value.asInstanceOf[js.Any])
    
    inline def setPrerenderFallbackUndefined: Self = StObject.set(x, "prerenderFallback", js.undefined)
    
    inline def setPrerenderRoutes(value: js.Array[String]): Self = StObject.set(x, "prerenderRoutes", value.asInstanceOf[js.Any])
    
    inline def setPrerenderRoutesUndefined: Self = StObject.set(x, "prerenderRoutes", js.undefined)
    
    inline def setPrerenderRoutesVarargs(value: String*): Self = StObject.set(x, "prerenderRoutes", js.Array(value*))
    
    inline def setTraceExcludes(value: js.Array[String]): Self = StObject.set(x, "traceExcludes", value.asInstanceOf[js.Any])
    
    inline def setTraceExcludesUndefined: Self = StObject.set(x, "traceExcludes", js.undefined)
    
    inline def setTraceExcludesVarargs(value: String*): Self = StObject.set(x, "traceExcludes", js.Array(value*))
    
    inline def setTraceIncludes(value: js.Array[String]): Self = StObject.set(x, "traceIncludes", value.asInstanceOf[js.Any])
    
    inline def setTraceIncludesUndefined: Self = StObject.set(x, "traceIncludes", js.undefined)
    
    inline def setTraceIncludesVarargs(value: String*): Self = StObject.set(x, "traceIncludes", js.Array(value*))
  }
}
