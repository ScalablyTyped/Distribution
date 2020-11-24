package typings.maximMazurokGapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountArtifactsResponse extends js.Object {
  
  /** Count metrics of Groups. */
  var groupsCountResult: js.UndefOr[GroupsCountResult] = js.native
  
  /** Count metrics of Mail. */
  var mailCountResult: js.UndefOr[MailCountResult] = js.native
  
  /** Total count of artifacts. For mail and groups, artifacts refers to messages. */
  var totalCount: js.UndefOr[String] = js.native
}
object CountArtifactsResponse {
  
  @scala.inline
  def apply(): CountArtifactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountArtifactsResponse]
  }
  
  @scala.inline
  implicit class CountArtifactsResponseOps[Self <: CountArtifactsResponse] (val x: Self) extends AnyVal {
    
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
    def setGroupsCountResult(value: GroupsCountResult): Self = this.set("groupsCountResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupsCountResult: Self = this.set("groupsCountResult", js.undefined)
    
    @scala.inline
    def setMailCountResult(value: MailCountResult): Self = this.set("mailCountResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMailCountResult: Self = this.set("mailCountResult", js.undefined)
    
    @scala.inline
    def setTotalCount(value: String): Self = this.set("totalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalCount: Self = this.set("totalCount", js.undefined)
  }
}
