package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuesRemoveAllLabelsEndpoint extends StObject {
  
  var issue_number: Double
  
  var owner: String
  
  var repo: String
}
object IssuesRemoveAllLabelsEndpoint {
  
  @scala.inline
  def apply(issue_number: Double, owner: String, repo: String): IssuesRemoveAllLabelsEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesRemoveAllLabelsEndpoint]
  }
  
  @scala.inline
  implicit class IssuesRemoveAllLabelsEndpointMutableBuilder[Self <: IssuesRemoveAllLabelsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIssue_number(value: Double): Self = StObject.set(x, "issue_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
