package typings.maximMazurokGapiClientSourcerepo.gapi.client.sourcerepo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncRepoMetadata extends js.Object {
  
  /** The name of the repo being synchronized. Values are of the form `projects//repos/`. */
  var name: js.UndefOr[String] = js.native
  
  /** The time this operation is started. */
  var startTime: js.UndefOr[String] = js.native
  
  /** The latest status message on syncing the repository. */
  var statusMessage: js.UndefOr[String] = js.native
  
  /** The time this operation's status message is updated. */
  var updateTime: js.UndefOr[String] = js.native
}
object SyncRepoMetadata {
  
  @scala.inline
  def apply(): SyncRepoMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncRepoMetadata]
  }
  
  @scala.inline
  implicit class SyncRepoMetadataOps[Self <: SyncRepoMetadata] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
