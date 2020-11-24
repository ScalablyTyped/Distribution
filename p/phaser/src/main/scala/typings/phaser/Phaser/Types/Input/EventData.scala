package typings.phaser.Phaser.Types.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Phaser Input Event Data object.
  * 
  * This object is passed to the registered event listeners and allows you to stop any further propagation.
  */
@js.native
trait EventData extends js.Object {
  
  /**
    * The cancelled state of this Event.
    */
  var cancelled: js.UndefOr[Boolean] = js.native
  
  /**
    * Call this method to stop this event from passing any further down the event chain.
    */
  var stopPropagation: js.Function = js.native
}
object EventData {
  
  @scala.inline
  def apply(stopPropagation: js.Function): EventData = {
    val __obj = js.Dynamic.literal(stopPropagation = stopPropagation.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
  
  @scala.inline
  implicit class EventDataOps[Self <: EventData] (val x: Self) extends AnyVal {
    
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
    def setStopPropagation(value: js.Function): Self = this.set("stopPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelled(value: Boolean): Self = this.set("cancelled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelled: Self = this.set("cancelled", js.undefined)
  }
}
