package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Activelockreason
import typings.octokitTypes.anon.Avatarurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IssuesGetEventResponseData extends StObject {
  
  var actor: Avatarurl = js.native
  
  var commit_id: String = js.native
  
  var commit_url: String = js.native
  
  var created_at: String = js.native
  
  var event: String = js.native
  
  var id: Double = js.native
  
  var issue: Activelockreason = js.native
  
  var node_id: String = js.native
  
  var url: String = js.native
}
object IssuesGetEventResponseData {
  
  @scala.inline
  def apply(
    actor: Avatarurl,
    commit_id: String,
    commit_url: String,
    created_at: String,
    event: String,
    id: Double,
    issue: Activelockreason,
    node_id: String,
    url: String
  ): IssuesGetEventResponseData = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], commit_url = commit_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesGetEventResponseData]
  }
  
  @scala.inline
  implicit class IssuesGetEventResponseDataMutableBuilder[Self <: IssuesGetEventResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActor(value: Avatarurl): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit_id(value: String): Self = StObject.set(x, "commit_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit_url(value: String): Self = StObject.set(x, "commit_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssue(value: Activelockreason): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
