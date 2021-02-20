package typings.nextServer

import typings.nextServer.typesMod.PageConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadComponentsMod {
  
  @JSImport("next-server/dist/server/load-components", "interopDefault")
  @js.native
  def interopDefault(mod: js.Any): js.Any = js.native
  
  @JSImport("next-server/dist/server/load-components", "loadComponents")
  @js.native
  def loadComponents(distDir: String, buildId: String, pathname: String, serverless: Boolean): js.Promise[LoadComponentsReturnType] = js.native
  
  @js.native
  trait LoadComponentsReturnType extends StObject {
    
    var App: js.UndefOr[js.Any] = js.native
    
    var Component: js.Any = js.native
    
    var Document: js.UndefOr[js.Any] = js.native
    
    var DocumentMiddleware: js.UndefOr[js.Any] = js.native
    
    var buildManifest: js.UndefOr[js.Any] = js.native
    
    var pageConfig: PageConfig = js.native
    
    var reactLoadableManifest: js.UndefOr[js.Any] = js.native
  }
  object LoadComponentsReturnType {
    
    @scala.inline
    def apply(Component: js.Any, pageConfig: PageConfig): LoadComponentsReturnType = {
      val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], pageConfig = pageConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadComponentsReturnType]
    }
    
    @scala.inline
    implicit class LoadComponentsReturnTypeMutableBuilder[Self <: LoadComponentsReturnType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp(value: js.Any): Self = StObject.set(x, "App", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppUndefined: Self = StObject.set(x, "App", js.undefined)
      
      @scala.inline
      def setBuildManifest(value: js.Any): Self = StObject.set(x, "buildManifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuildManifestUndefined: Self = StObject.set(x, "buildManifest", js.undefined)
      
      @scala.inline
      def setComponent(value: js.Any): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocument(value: js.Any): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentMiddleware(value: js.Any): Self = StObject.set(x, "DocumentMiddleware", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentMiddlewareUndefined: Self = StObject.set(x, "DocumentMiddleware", js.undefined)
      
      @scala.inline
      def setDocumentUndefined: Self = StObject.set(x, "Document", js.undefined)
      
      @scala.inline
      def setPageConfig(value: PageConfig): Self = StObject.set(x, "pageConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReactLoadableManifest(value: js.Any): Self = StObject.set(x, "reactLoadableManifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReactLoadableManifestUndefined: Self = StObject.set(x, "reactLoadableManifest", js.undefined)
    }
  }
}
