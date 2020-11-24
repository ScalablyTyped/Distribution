package typings.microsoftGraph.mod.CallRecords

import typings.microsoftGraph.mod.IdentitySet
import typings.microsoftGraph.mod.NullableOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParticipantEndpoint extends Endpoint {
  
  // The feedback provided by the user of this endpoint about the quality of the session.
  var feedback: js.UndefOr[NullableOption[UserFeedback]] = js.native
  
  // Identity associated with the endpoint.
  var identity: js.UndefOr[NullableOption[IdentitySet]] = js.native
}
object ParticipantEndpoint {
  
  @scala.inline
  def apply(): ParticipantEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParticipantEndpoint]
  }
  
  @scala.inline
  implicit class ParticipantEndpointOps[Self <: ParticipantEndpoint] (val x: Self) extends AnyVal {
    
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
    def setFeedback(value: NullableOption[UserFeedback]): Self = this.set("feedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeedback: Self = this.set("feedback", js.undefined)
    
    @scala.inline
    def setFeedbackNull: Self = this.set("feedback", null)
    
    @scala.inline
    def setIdentity(value: NullableOption[IdentitySet]): Self = this.set("identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentity: Self = this.set("identity", js.undefined)
    
    @scala.inline
    def setIdentityNull: Self = this.set("identity", null)
  }
}
