package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BranchpolicyidEnvironmentname extends StObject {
  
  var branch_policy_id: Double
  
  var environment_name: String
  
  var owner: String
  
  var repo: String
}
object BranchpolicyidEnvironmentname {
  
  inline def apply(branch_policy_id: Double, environment_name: String, owner: String, repo: String): BranchpolicyidEnvironmentname = {
    val __obj = js.Dynamic.literal(branch_policy_id = branch_policy_id.asInstanceOf[js.Any], environment_name = environment_name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchpolicyidEnvironmentname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BranchpolicyidEnvironmentname] (val x: Self) extends AnyVal {
    
    inline def setBranch_policy_id(value: Double): Self = StObject.set(x, "branch_policy_id", value.asInstanceOf[js.Any])
    
    inline def setEnvironment_name(value: String): Self = StObject.set(x, "environment_name", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
