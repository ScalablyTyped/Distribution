package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuesCreateCommentEndpoint extends StObject {
  
  /**
    * The contents of the comment.
    */
  var body: String
  
  var issue_number: Double
  
  var owner: String
  
  var repo: String
}
object IssuesCreateCommentEndpoint {
  
  @scala.inline
  def apply(body: String, issue_number: Double, owner: String, repo: String): IssuesCreateCommentEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], issue_number = issue_number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesCreateCommentEndpoint]
  }
  
  @scala.inline
  implicit class IssuesCreateCommentEndpointMutableBuilder[Self <: IssuesCreateCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssue_number(value: Double): Self = StObject.set(x, "issue_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
