package typings.next

import typings.next.anon.ImportLocByPath
import typings.next.distBuildAnalysisGetPageStaticInfoMod.MiddlewareMatcher
import typings.next.distBuildAnalysisGetPageStaticInfoMod.RSCModuleType
import typings.next.distCompiledWebpackWebpackMod.webpack.Module
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackLoadersGetModuleBuildInfoMod {
  
  @JSImport("next/dist/build/webpack/loaders/get-module-build-info", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getModuleBuildInfo(webpackModule: Module): ImportLocByPath = ^.asInstanceOf[js.Dynamic].applyDynamic("getModuleBuildInfo")(webpackModule.asInstanceOf[js.Any]).asInstanceOf[ImportLocByPath]
  
  trait AssetBinding extends StObject {
    
    var filePath: String
    
    var name: String
  }
  object AssetBinding {
    
    inline def apply(filePath: String, name: String): AssetBinding = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssetBinding]
    }
    
    extension [Self <: AssetBinding](x: Self) {
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait EdgeMiddlewareMeta extends StObject {
    
    var matchers: js.UndefOr[js.Array[MiddlewareMatcher]] = js.undefined
    
    var page: String
  }
  object EdgeMiddlewareMeta {
    
    inline def apply(page: String): EdgeMiddlewareMeta = {
      val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
      __obj.asInstanceOf[EdgeMiddlewareMeta]
    }
    
    extension [Self <: EdgeMiddlewareMeta](x: Self) {
      
      inline def setMatchers(value: js.Array[MiddlewareMatcher]): Self = StObject.set(x, "matchers", value.asInstanceOf[js.Any])
      
      inline def setMatchersUndefined: Self = StObject.set(x, "matchers", js.undefined)
      
      inline def setMatchersVarargs(value: MiddlewareMatcher*): Self = StObject.set(x, "matchers", js.Array(value*))
      
      inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    }
  }
  
  trait EdgeSSRMeta extends StObject {
    
    var isAppDir: js.UndefOr[Boolean] = js.undefined
    
    var isServerComponent: Boolean
    
    var page: String
  }
  object EdgeSSRMeta {
    
    inline def apply(isServerComponent: Boolean, page: String): EdgeSSRMeta = {
      val __obj = js.Dynamic.literal(isServerComponent = isServerComponent.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
      __obj.asInstanceOf[EdgeSSRMeta]
    }
    
    extension [Self <: EdgeSSRMeta](x: Self) {
      
      inline def setIsAppDir(value: Boolean): Self = StObject.set(x, "isAppDir", value.asInstanceOf[js.Any])
      
      inline def setIsAppDirUndefined: Self = StObject.set(x, "isAppDir", js.undefined)
      
      inline def setIsServerComponent(value: Boolean): Self = StObject.set(x, "isServerComponent", value.asInstanceOf[js.Any])
      
      inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    }
  }
  
  trait RSCMeta extends StObject {
    
    var requests: js.UndefOr[js.Array[String]] = js.undefined
    
    var `type`: js.UndefOr[RSCModuleType] = js.undefined
  }
  object RSCMeta {
    
    inline def apply(): RSCMeta = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RSCMeta]
    }
    
    extension [Self <: RSCMeta](x: Self) {
      
      inline def setRequests(value: js.Array[String]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
      
      inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
      
      inline def setRequestsVarargs(value: String*): Self = StObject.set(x, "requests", js.Array(value*))
      
      inline def setType(value: RSCModuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RouteMeta extends StObject {
    
    var absolutePagePath: String
    
    var page: String
  }
  object RouteMeta {
    
    inline def apply(absolutePagePath: String, page: String): RouteMeta = {
      val __obj = js.Dynamic.literal(absolutePagePath = absolutePagePath.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteMeta]
    }
    
    extension [Self <: RouteMeta](x: Self) {
      
      inline def setAbsolutePagePath(value: String): Self = StObject.set(x, "absolutePagePath", value.asInstanceOf[js.Any])
      
      inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    }
  }
}
