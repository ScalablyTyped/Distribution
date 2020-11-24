package typings.maximMazurokGapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnexpectedExitStatusEvent extends js.Object {
  
  /** The numeric ID of the action that started the container. */
  var actionId: js.UndefOr[Double] = js.native
  
  /** The exit status of the container. */
  var exitStatus: js.UndefOr[Double] = js.native
}
object UnexpectedExitStatusEvent {
  
  @scala.inline
  def apply(): UnexpectedExitStatusEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnexpectedExitStatusEvent]
  }
  
  @scala.inline
  implicit class UnexpectedExitStatusEventOps[Self <: UnexpectedExitStatusEvent] (val x: Self) extends AnyVal {
    
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
    def setActionId(value: Double): Self = this.set("actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionId: Self = this.set("actionId", js.undefined)
    
    @scala.inline
    def setExitStatus(value: Double): Self = this.set("exitStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitStatus: Self = this.set("exitStatus", js.undefined)
  }
}
