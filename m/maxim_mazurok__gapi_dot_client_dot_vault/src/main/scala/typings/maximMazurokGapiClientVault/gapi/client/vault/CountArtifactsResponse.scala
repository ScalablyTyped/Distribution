package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountArtifactsResponse extends StObject {
  
  /** Count metrics for Groups. */
  var groupsCountResult: js.UndefOr[GroupsCountResult] = js.undefined
  
  /** Count metrics for Gmail and classic Hangouts. */
  var mailCountResult: js.UndefOr[MailCountResult] = js.undefined
  
  /** Total count of messages. */
  var totalCount: js.UndefOr[String] = js.undefined
}
object CountArtifactsResponse {
  
  inline def apply(): CountArtifactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountArtifactsResponse]
  }
  
  extension [Self <: CountArtifactsResponse](x: Self) {
    
    inline def setGroupsCountResult(value: GroupsCountResult): Self = StObject.set(x, "groupsCountResult", value.asInstanceOf[js.Any])
    
    inline def setGroupsCountResultUndefined: Self = StObject.set(x, "groupsCountResult", js.undefined)
    
    inline def setMailCountResult(value: MailCountResult): Self = StObject.set(x, "mailCountResult", value.asInstanceOf[js.Any])
    
    inline def setMailCountResultUndefined: Self = StObject.set(x, "mailCountResult", js.undefined)
    
    inline def setTotalCount(value: String): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
