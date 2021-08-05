package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposRemoveUserAccessRestrictionsEndpoint extends StObject {
  
  var branch: String
  
  var owner: String
  
  var repo: String
  
  /**
    * users parameter
    */
  var users: js.Array[String]
}
object ReposRemoveUserAccessRestrictionsEndpoint {
  
  inline def apply(branch: String, owner: String, repo: String, users: js.Array[String]): ReposRemoveUserAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposRemoveUserAccessRestrictionsEndpoint]
  }
  
  extension [Self <: ReposRemoveUserAccessRestrictionsEndpoint](x: Self) {
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setUsers(value: js.Array[String]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersVarargs(value: String*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
