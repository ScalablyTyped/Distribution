package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncomingContext extends js.Object {
  
  // The ID of the participant that is under observation. Read-only.
  var observedParticipantId: js.UndefOr[NullableOption[String]] = js.native
  
  // The identity that the call is happening on behalf of.
  var onBehalfOf: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  // The ID of the participant that triggered the incoming call. Read-only.
  var sourceParticipantId: js.UndefOr[NullableOption[String]] = js.native
  
  // The identity that transferred the call.
  var transferor: js.UndefOr[NullableOption[IdentitySet]] = js.native
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
    def setObservedParticipantId(value: NullableOption[String]): Self = this.set("observedParticipantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObservedParticipantId: Self = this.set("observedParticipantId", js.undefined)
    
    @scala.inline
    def setObservedParticipantIdNull: Self = this.set("observedParticipantId", null)
    
    @scala.inline
    def setOnBehalfOf(value: NullableOption[IdentitySet]): Self = this.set("onBehalfOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBehalfOf: Self = this.set("onBehalfOf", js.undefined)
    
    @scala.inline
    def setOnBehalfOfNull: Self = this.set("onBehalfOf", null)
    
    @scala.inline
    def setSourceParticipantId(value: NullableOption[String]): Self = this.set("sourceParticipantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceParticipantId: Self = this.set("sourceParticipantId", js.undefined)
    
    @scala.inline
    def setSourceParticipantIdNull: Self = this.set("sourceParticipantId", null)
    
    @scala.inline
    def setTransferor(value: NullableOption[IdentitySet]): Self = this.set("transferor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransferor: Self = this.set("transferor", js.undefined)
    
    @scala.inline
    def setTransferorNull: Self = this.set("transferor", null)
  }
}
