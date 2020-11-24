package typings.openfin.eventsApplicationMod

import typings.openfin.openfinStrings.`abnormal-termination`
import typings.openfin.openfinStrings.`launch-failed`
import typings.openfin.openfinStrings.`normal-termination`
import typings.openfin.openfinStrings.`out-of-memory`
import typings.openfin.openfinStrings.`still-running`
import typings.openfin.openfinStrings.crashed
import typings.openfin.openfinStrings.killed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrashedEvent extends js.Object {
  
  var reason: `normal-termination` | `abnormal-termination` | killed | crashed | `still-running` | `launch-failed` | `out-of-memory` = js.native
}
object CrashedEvent {
  
  @scala.inline
  def apply(
    reason: `normal-termination` | `abnormal-termination` | killed | crashed | `still-running` | `launch-failed` | `out-of-memory`
  ): CrashedEvent = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrashedEvent]
  }
  
  @scala.inline
  implicit class CrashedEventOps[Self <: CrashedEvent] (val x: Self) extends AnyVal {
    
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
    def setReason(
      value: `normal-termination` | `abnormal-termination` | killed | crashed | `still-running` | `launch-failed` | `out-of-memory`
    ): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
}
