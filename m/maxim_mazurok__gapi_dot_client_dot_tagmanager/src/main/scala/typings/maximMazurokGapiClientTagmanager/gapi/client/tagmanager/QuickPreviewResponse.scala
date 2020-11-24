package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuickPreviewResponse extends js.Object {
  
  /** Were there compiler errors or not. */
  var compilerError: js.UndefOr[Boolean] = js.native
  
  /** The quick previewed container version. */
  var containerVersion: js.UndefOr[ContainerVersion] = js.native
  
  /** Whether quick previewing failed when syncing the workspace to the latest container version. */
  var syncStatus: js.UndefOr[SyncStatus] = js.native
}
object QuickPreviewResponse {
  
  @scala.inline
  def apply(): QuickPreviewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuickPreviewResponse]
  }
  
  @scala.inline
  implicit class QuickPreviewResponseOps[Self <: QuickPreviewResponse] (val x: Self) extends AnyVal {
    
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
    def setCompilerError(value: Boolean): Self = this.set("compilerError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompilerError: Self = this.set("compilerError", js.undefined)
    
    @scala.inline
    def setContainerVersion(value: ContainerVersion): Self = this.set("containerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerVersion: Self = this.set("containerVersion", js.undefined)
    
    @scala.inline
    def setSyncStatus(value: SyncStatus): Self = this.set("syncStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncStatus: Self = this.set("syncStatus", js.undefined)
  }
}
