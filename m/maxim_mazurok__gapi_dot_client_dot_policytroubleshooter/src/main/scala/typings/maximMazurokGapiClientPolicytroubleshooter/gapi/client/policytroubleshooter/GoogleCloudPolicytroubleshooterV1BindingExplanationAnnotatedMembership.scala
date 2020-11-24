package typings.maximMazurokGapiClientPolicytroubleshooter.gapi.client.policytroubleshooter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudPolicytroubleshooterV1BindingExplanationAnnotatedMembership extends js.Object {
  
  /** Indicates whether the binding includes the member. */
  var membership: js.UndefOr[String] = js.native
  
  /** The relevance of the member's status to the overall determination for the binding. */
  var relevance: js.UndefOr[String] = js.native
}
object GoogleCloudPolicytroubleshooterV1BindingExplanationAnnotatedMembership {
  
  @scala.inline
  def apply(): GoogleCloudPolicytroubleshooterV1BindingExplanationAnnotatedMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudPolicytroubleshooterV1BindingExplanationAnnotatedMembership]
  }
  
  @scala.inline
  implicit class GoogleCloudPolicytroubleshooterV1BindingExplanationAnnotatedMembershipOps[Self <: GoogleCloudPolicytroubleshooterV1BindingExplanationAnnotatedMembership] (val x: Self) extends AnyVal {
    
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
    def setMembership(value: String): Self = this.set("membership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembership: Self = this.set("membership", js.undefined)
    
    @scala.inline
    def setRelevance(value: String): Self = this.set("relevance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelevance: Self = this.set("relevance", js.undefined)
  }
}
