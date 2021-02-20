package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountArtifactsResponse extends StObject {
  
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
  implicit class CountArtifactsResponseMutableBuilder[Self <: CountArtifactsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupsCountResult(value: GroupsCountResult): Self = StObject.set(x, "groupsCountResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsCountResultUndefined: Self = StObject.set(x, "groupsCountResult", js.undefined)
    
    @scala.inline
    def setMailCountResult(value: MailCountResult): Self = StObject.set(x, "mailCountResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailCountResultUndefined: Self = StObject.set(x, "mailCountResult", js.undefined)
    
    @scala.inline
    def setTotalCount(value: String): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
