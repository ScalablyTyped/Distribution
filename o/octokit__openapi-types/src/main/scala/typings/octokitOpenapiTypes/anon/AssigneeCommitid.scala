package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssigneeCommitid extends StObject {
  
  var actor: Avatarurl
  
  var assignee: Avatarurl
  
  var commit_id: String | Null
  
  var commit_url: String | Null
  
  var created_at: String
  
  var event: String
  
  var id: Double
  
  var node_id: String
  
  var performed_via_github_app: Externalurl | Null
  
  var url: String
}
object AssigneeCommitid {
  
  inline def apply(
    actor: Avatarurl,
    assignee: Avatarurl,
    created_at: String,
    event: String,
    id: Double,
    node_id: String,
    url: String
  ): AssigneeCommitid = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any], assignee = assignee.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], commit_id = null, commit_url = null, performed_via_github_app = null)
    __obj.asInstanceOf[AssigneeCommitid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssigneeCommitid] (val x: Self) extends AnyVal {
    
    inline def setActor(value: Avatarurl): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setAssignee(value: Avatarurl): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
    
    inline def setCommit_id(value: String): Self = StObject.set(x, "commit_id", value.asInstanceOf[js.Any])
    
    inline def setCommit_idNull: Self = StObject.set(x, "commit_id", null)
    
    inline def setCommit_url(value: String): Self = StObject.set(x, "commit_url", value.asInstanceOf[js.Any])
    
    inline def setCommit_urlNull: Self = StObject.set(x, "commit_url", null)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPerformed_via_github_app(value: Externalurl): Self = StObject.set(x, "performed_via_github_app", value.asInstanceOf[js.Any])
    
    inline def setPerformed_via_github_appNull: Self = StObject.set(x, "performed_via_github_app", null)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
