package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullsUpdateReviewCommentEndpoint extends StObject {
  
  /**
    * The text of the reply to the review comment.
    */
  var body: String
  
  var comment_id: Double
  
  var owner: String
  
  var repo: String
}
object PullsUpdateReviewCommentEndpoint {
  
  @scala.inline
  def apply(body: String, comment_id: Double, owner: String, repo: String): PullsUpdateReviewCommentEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comment_id = comment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsUpdateReviewCommentEndpoint]
  }
  
  @scala.inline
  implicit class PullsUpdateReviewCommentEndpointMutableBuilder[Self <: PullsUpdateReviewCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_id(value: Double): Self = StObject.set(x, "comment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
