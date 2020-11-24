package typings.maximMazurokGapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LintPolicyRequest extends js.Object {
  
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
  implicit class LintPolicyRequestOps[Self <: LintPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCondition(value: Expr): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setFullResourceName(value: String): Self = this.set("fullResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullResourceName: Self = this.set("fullResourceName", js.undefined)
  }
}
