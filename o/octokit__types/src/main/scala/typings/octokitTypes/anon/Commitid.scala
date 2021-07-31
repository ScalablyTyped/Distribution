package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commitid extends StObject {
  
  var actor: Avatarurl
  
  var commit_id: String
  
  var commit_url: String
  
  var created_at: String
  
  var event: String
  
  var id: Double
  
  var issue: Activelockreason
  
  var node_id: String
  
  var url: String
}
object Commitid {
  
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
  ): Commitid = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], commit_url = commit_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commitid]
  }
  
  @scala.inline
  implicit class CommitidMutableBuilder[Self <: Commitid] (val x: Self) extends AnyVal {
    
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
