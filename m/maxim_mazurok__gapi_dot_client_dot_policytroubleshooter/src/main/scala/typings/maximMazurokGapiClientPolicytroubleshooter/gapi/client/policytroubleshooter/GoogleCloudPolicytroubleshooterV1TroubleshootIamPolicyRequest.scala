package typings.maximMazurokGapiClientPolicytroubleshooter.gapi.client.policytroubleshooter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyRequest extends js.Object {
  
  /** The information to use for checking whether a member has a permission for a resource. */
  var accessTuple: js.UndefOr[GoogleCloudPolicytroubleshooterV1AccessTuple] = js.native
}
object GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyRequest {
  
  @scala.inline
  def apply(): GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyRequestOps[Self <: GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyRequest] (val x: Self) extends AnyVal {
    
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
    def setAccessTuple(value: GoogleCloudPolicytroubleshooterV1AccessTuple): Self = this.set("accessTuple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessTuple: Self = this.set("accessTuple", js.undefined)
  }
}
