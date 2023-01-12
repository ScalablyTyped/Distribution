package typings.nextServer

import typings.nextServer.typesMod.PageConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerLoadComponentsMod {
  
  @JSImport("next-server/dist/server/load-components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def interopDefault(mod: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("interopDefault")(mod.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def loadComponents(distDir: String, buildId: String, pathname: String, serverless: Boolean): js.Promise[LoadComponentsReturnType] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadComponents")(distDir.asInstanceOf[js.Any], buildId.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any], serverless.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LoadComponentsReturnType]]
  
  trait LoadComponentsReturnType extends StObject {
    
    var App: js.UndefOr[Any] = js.undefined
    
    var Component: Any
    
    var Document: js.UndefOr[Any] = js.undefined
    
    var DocumentMiddleware: js.UndefOr[Any] = js.undefined
    
    var buildManifest: js.UndefOr[Any] = js.undefined
    
    var pageConfig: PageConfig
    
    var reactLoadableManifest: js.UndefOr[Any] = js.undefined
  }
  object LoadComponentsReturnType {
    
    inline def apply(Component: Any, pageConfig: PageConfig): LoadComponentsReturnType = {
      val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], pageConfig = pageConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadComponentsReturnType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadComponentsReturnType] (val x: Self) extends AnyVal {
      
      inline def setApp(value: Any): Self = StObject.set(x, "App", value.asInstanceOf[js.Any])
      
      inline def setAppUndefined: Self = StObject.set(x, "App", js.undefined)
      
      inline def setBuildManifest(value: Any): Self = StObject.set(x, "buildManifest", value.asInstanceOf[js.Any])
      
      inline def setBuildManifestUndefined: Self = StObject.set(x, "buildManifest", js.undefined)
      
      inline def setComponent(value: Any): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      inline def setDocument(value: Any): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
      
      inline def setDocumentMiddleware(value: Any): Self = StObject.set(x, "DocumentMiddleware", value.asInstanceOf[js.Any])
      
      inline def setDocumentMiddlewareUndefined: Self = StObject.set(x, "DocumentMiddleware", js.undefined)
      
      inline def setDocumentUndefined: Self = StObject.set(x, "Document", js.undefined)
      
      inline def setPageConfig(value: PageConfig): Self = StObject.set(x, "pageConfig", value.asInstanceOf[js.Any])
      
      inline def setReactLoadableManifest(value: Any): Self = StObject.set(x, "reactLoadableManifest", value.asInstanceOf[js.Any])
      
      inline def setReactLoadableManifestUndefined: Self = StObject.set(x, "reactLoadableManifest", js.undefined)
    }
  }
}
