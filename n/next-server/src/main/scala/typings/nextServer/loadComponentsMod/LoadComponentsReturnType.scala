package typings.nextServer.loadComponentsMod

import typings.nextServer.typesMod.PageConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadComponentsReturnType extends js.Object {
  
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
  implicit class LoadComponentsReturnTypeOps[Self <: LoadComponentsReturnType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComponent(value: js.Any): Self = this.set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageConfig(value: PageConfig): Self = this.set("pageConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApp(value: js.Any): Self = this.set("App", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApp: Self = this.set("App", js.undefined)
    
    @scala.inline
    def setDocument(value: js.Any): Self = this.set("Document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocument: Self = this.set("Document", js.undefined)
    
    @scala.inline
    def setDocumentMiddleware(value: js.Any): Self = this.set("DocumentMiddleware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentMiddleware: Self = this.set("DocumentMiddleware", js.undefined)
    
    @scala.inline
    def setBuildManifest(value: js.Any): Self = this.set("buildManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildManifest: Self = this.set("buildManifest", js.undefined)
    
    @scala.inline
    def setReactLoadableManifest(value: js.Any): Self = this.set("reactLoadableManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReactLoadableManifest: Self = this.set("reactLoadableManifest", js.undefined)
  }
}
