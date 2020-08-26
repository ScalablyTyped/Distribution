package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncomingContext extends js.Object {
  // The ID of the participant that is under observation. Read-only.
  var observedParticipantId: js.UndefOr[String] = js.native
  // The identity that the call is happening on behalf of.
  var onBehalfOf: js.UndefOr[IdentitySet] = js.native
  // The ID of the participant that triggered the incoming call. Read-only.
  var sourceParticipantId: js.UndefOr[String] = js.native
  // The identity that transferred the call.
  var transferor: js.UndefOr[IdentitySet] = js.native
}

object IncomingContext {
  @scala.inline
  def apply(): IncomingContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncomingContext]
  }
  @scala.inline
  implicit class IncomingContextOps[Self <: IncomingContext] (val x: Self) extends AnyVal {
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
    def setObservedParticipantId(value: String): Self = this.set("observedParticipantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObservedParticipantId: Self = this.set("observedParticipantId", js.undefined)
    @scala.inline
    def setOnBehalfOf(value: IdentitySet): Self = this.set("onBehalfOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBehalfOf: Self = this.set("onBehalfOf", js.undefined)
    @scala.inline
    def setSourceParticipantId(value: String): Self = this.set("sourceParticipantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceParticipantId: Self = this.set("sourceParticipantId", js.undefined)
    @scala.inline
    def setTransferor(value: IdentitySet): Self = this.set("transferor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferor: Self = this.set("transferor", js.undefined)
  }
  
}

