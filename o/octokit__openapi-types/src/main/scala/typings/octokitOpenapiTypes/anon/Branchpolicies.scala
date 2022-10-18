package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Branchpolicies extends StObject {
  
  var branch_policies: js.Array[NameNodeid]
  
  /**
    * @description The number of deployment branch policies for the environment.
    * @example 2
    */
  var total_count: Double
}
object Branchpolicies {
  
  inline def apply(branch_policies: js.Array[NameNodeid], total_count: Double): Branchpolicies = {
    val __obj = js.Dynamic.literal(branch_policies = branch_policies.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Branchpolicies]
  }
  
  extension [Self <: Branchpolicies](x: Self) {
    
    inline def setBranch_policies(value: js.Array[NameNodeid]): Self = StObject.set(x, "branch_policies", value.asInstanceOf[js.Any])
    
    inline def setBranch_policiesVarargs(value: NameNodeid*): Self = StObject.set(x, "branch_policies", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
