package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuesCheckUserCanBeAssignedEndpoint extends StObject {
  
  var assignee: String
  
  var owner: String
  
  var repo: String
}
object IssuesCheckUserCanBeAssignedEndpoint {
  
  inline def apply(assignee: String, owner: String, repo: String): IssuesCheckUserCanBeAssignedEndpoint = {
    val __obj = js.Dynamic.literal(assignee = assignee.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesCheckUserCanBeAssignedEndpoint]
  }
  
  extension [Self <: IssuesCheckUserCanBeAssignedEndpoint](x: Self) {
    
    inline def setAssignee(value: String): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
