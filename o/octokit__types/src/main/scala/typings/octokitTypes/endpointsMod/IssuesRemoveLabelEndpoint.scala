package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuesRemoveLabelEndpoint extends StObject {
  
  var issue_number: Double
  
  var name: String
  
  var owner: String
  
  var repo: String
}
object IssuesRemoveLabelEndpoint {
  
  @scala.inline
  def apply(issue_number: Double, name: String, owner: String, repo: String): IssuesRemoveLabelEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesRemoveLabelEndpoint]
  }
  
  @scala.inline
  implicit class IssuesRemoveLabelEndpointMutableBuilder[Self <: IssuesRemoveLabelEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIssue_number(value: Double): Self = StObject.set(x, "issue_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
