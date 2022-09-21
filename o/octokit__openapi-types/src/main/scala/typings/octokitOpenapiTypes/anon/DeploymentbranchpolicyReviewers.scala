package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentbranchpolicyReviewers extends StObject {
  
  var deployment_branch_policy: js.UndefOr[Custombranchpolicies | Null] = js.undefined
  
  /** @description The people or teams that may review jobs that reference the environment. You can list up to six users or teams as reviewers. The reviewers must have at least read access to the repository. Only one of the required reviewers needs to approve the job for it to proceed. */
  var reviewers: js.UndefOr[js.Array[IdType] | Null] = js.undefined
  
  var wait_timer: js.UndefOr[Double] = js.undefined
}
object DeploymentbranchpolicyReviewers {
  
  inline def apply(): DeploymentbranchpolicyReviewers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentbranchpolicyReviewers]
  }
  
  extension [Self <: DeploymentbranchpolicyReviewers](x: Self) {
    
    inline def setDeployment_branch_policy(value: Custombranchpolicies): Self = StObject.set(x, "deployment_branch_policy", value.asInstanceOf[js.Any])
    
    inline def setDeployment_branch_policyNull: Self = StObject.set(x, "deployment_branch_policy", null)
    
    inline def setDeployment_branch_policyUndefined: Self = StObject.set(x, "deployment_branch_policy", js.undefined)
    
    inline def setReviewers(value: js.Array[IdType]): Self = StObject.set(x, "reviewers", value.asInstanceOf[js.Any])
    
    inline def setReviewersNull: Self = StObject.set(x, "reviewers", null)
    
    inline def setReviewersUndefined: Self = StObject.set(x, "reviewers", js.undefined)
    
    inline def setReviewersVarargs(value: IdType*): Self = StObject.set(x, "reviewers", js.Array(value*))
    
    inline def setWait_timer(value: Double): Self = StObject.set(x, "wait_timer", value.asInstanceOf[js.Any])
    
    inline def setWait_timerUndefined: Self = StObject.set(x, "wait_timer", js.undefined)
  }
}
