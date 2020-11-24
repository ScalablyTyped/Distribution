package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchJobInstanceDetails extends js.Object {
  
  /** The number of times the agent that the agent attempts to apply the patch. */
  var attemptCount: js.UndefOr[String] = js.native
  
  /** If the patch fails, this field provides the reason. */
  var failureReason: js.UndefOr[String] = js.native
  
  /** The unique identifier for the instance. This identifier is defined by the server. */
  var instanceSystemId: js.UndefOr[String] = js.native
  
  /** The instance name in the form `projects/∗/zones/∗/instances/ *` */
  var name: js.UndefOr[String] = js.native
  
  /** Current state of instance patch. */
  var state: js.UndefOr[String] = js.native
}
object PatchJobInstanceDetails {
  
  @scala.inline
  def apply(): PatchJobInstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchJobInstanceDetails]
  }
  
  @scala.inline
  implicit class PatchJobInstanceDetailsOps[Self <: PatchJobInstanceDetails] (val x: Self) extends AnyVal {
    
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
    def setAttemptCount(value: String): Self = this.set("attemptCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttemptCount: Self = this.set("attemptCount", js.undefined)
    
    @scala.inline
    def setFailureReason(value: String): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
    
    @scala.inline
    def setInstanceSystemId(value: String): Self = this.set("instanceSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceSystemId: Self = this.set("instanceSystemId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
