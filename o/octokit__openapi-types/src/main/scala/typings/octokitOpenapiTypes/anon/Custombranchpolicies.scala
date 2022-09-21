package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Custombranchpolicies extends StObject {
  
  /** @description Whether only branches that match the specified name patterns can deploy to this environment.  If `custom_branch_policies` is `true`, `protected_branches` must be `false`; if `custom_branch_policies` is `false`, `protected_branches` must be `true`. */
  var custom_branch_policies: Boolean
  
  /** @description Whether only branches with branch protection rules can deploy to this environment. If `protected_branches` is `true`, `custom_branch_policies` must be `false`; if `protected_branches` is `false`, `custom_branch_policies` must be `true`. */
  var protected_branches: Boolean
}
object Custombranchpolicies {
  
  inline def apply(custom_branch_policies: Boolean, protected_branches: Boolean): Custombranchpolicies = {
    val __obj = js.Dynamic.literal(custom_branch_policies = custom_branch_policies.asInstanceOf[js.Any], protected_branches = protected_branches.asInstanceOf[js.Any])
    __obj.asInstanceOf[Custombranchpolicies]
  }
  
  extension [Self <: Custombranchpolicies](x: Self) {
    
    inline def setCustom_branch_policies(value: Boolean): Self = StObject.set(x, "custom_branch_policies", value.asInstanceOf[js.Any])
    
    inline def setProtected_branches(value: Boolean): Self = StObject.set(x, "protected_branches", value.asInstanceOf[js.Any])
  }
}
