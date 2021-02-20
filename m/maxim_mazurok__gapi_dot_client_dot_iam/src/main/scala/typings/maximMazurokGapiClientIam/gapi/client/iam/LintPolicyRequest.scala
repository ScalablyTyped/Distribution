package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LintPolicyRequest extends StObject {
  
  /** google.iam.v1.Binding.condition object to be linted. */
  var condition: js.UndefOr[Expr] = js.native
  
  /**
    * The full resource name of the policy this lint request is about. The name follows the Google Cloud Platform (GCP) resource format. For example, a GCP project with ID `my-project`
    * will be named `//cloudresourcemanager.googleapis.com/projects/my-project`. The resource name is not used to read the policy instance from the Cloud IAM database. The candidate
    * policy for lint has to be provided in the same request object.
    */
  var fullResourceName: js.UndefOr[String] = js.native
}
object LintPolicyRequest {
  
  @scala.inline
  def apply(): LintPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LintPolicyRequest]
  }
  
  @scala.inline
  implicit class LintPolicyRequestMutableBuilder[Self <: LintPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: Expr): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setFullResourceName(value: String): Self = StObject.set(x, "fullResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullResourceNameUndefined: Self = StObject.set(x, "fullResourceName", js.undefined)
  }
}
