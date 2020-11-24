package typings.maximMazurokGapiClientRun.gapi.client.run

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRunV1Condition extends js.Object {
  
  /** Optional. Last time the condition transitioned from one status to another. */
  var lastTransitionTime: js.UndefOr[String] = js.native
  
  /** Optional. Human readable message indicating details about the current status. */
  var message: js.UndefOr[String] = js.native
  
  /** Optional. One-word CamelCase reason for the condition's last transition. */
  var reason: js.UndefOr[String] = js.native
  
  /** Optional. How to interpret failures of this condition, one of Error, Warning, Info */
  var severity: js.UndefOr[String] = js.native
  
  /** Status of the condition, one of True, False, Unknown. */
  var status: js.UndefOr[String] = js.native
  
  /**
    * type is used to communicate the status of the reconciliation process. See also: https://github.com/knative/serving/blob/master/docs/spec/errors.md#error-conditions-and-reporting
    * Types common to all resources include: * "Ready": True when the Resource is ready.
    */
  var `type`: js.UndefOr[String] = js.native
}
object GoogleCloudRunV1Condition {
  
  @scala.inline
  def apply(): GoogleCloudRunV1Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV1Condition]
  }
  
  @scala.inline
  implicit class GoogleCloudRunV1ConditionOps[Self <: GoogleCloudRunV1Condition] (val x: Self) extends AnyVal {
    
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
    def setLastTransitionTime(value: String): Self = this.set("lastTransitionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastTransitionTime: Self = this.set("lastTransitionTime", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
