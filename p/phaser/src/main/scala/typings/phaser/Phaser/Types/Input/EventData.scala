package typings.phaser.Phaser.Types.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Phaser Input Event Data object.
  * 
  * This object is passed to the registered event listeners and allows you to stop any further propagation.
  */
trait EventData extends js.Object {
  /**
    * The cancelled state of this Event.
    */
  var cancelled: js.UndefOr[Boolean] = js.undefined
  /**
    * Call this method to stop this event from passing any further down the event chain.
    */
  var stopPropagation: js.Function
}

object EventData {
  @scala.inline
  def apply(stopPropagation: js.Function, cancelled: js.UndefOr[Boolean] = js.undefined): EventData = {
    val __obj = js.Dynamic.literal(stopPropagation = stopPropagation.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelled)) __obj.updateDynamic("cancelled")(cancelled.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
}

