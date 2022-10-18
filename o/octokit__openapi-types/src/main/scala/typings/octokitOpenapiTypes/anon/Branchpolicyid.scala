package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Branchpolicyid extends StObject {
  
  /** The unique identifier of the branch policy. */
  var branch_policy_id: Double
  
  /** The name of the environment. */
  var environment_name: String
  
  /** The account owner of the repository. The name is not case sensitive. */
  var owner: String
  
  /** The name of the repository. The name is not case sensitive. */
  var repo: String
}
object Branchpolicyid {
  
  inline def apply(branch_policy_id: Double, environment_name: String, owner: String, repo: String): Branchpolicyid = {
    val __obj = js.Dynamic.literal(branch_policy_id = branch_policy_id.asInstanceOf[js.Any], environment_name = environment_name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Branchpolicyid]
  }
  
  extension [Self <: Branchpolicyid](x: Self) {
    
    inline def setBranch_policy_id(value: Double): Self = StObject.set(x, "branch_policy_id", value.asInstanceOf[js.Any])
    
    inline def setEnvironment_name(value: String): Self = StObject.set(x, "environment_name", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
