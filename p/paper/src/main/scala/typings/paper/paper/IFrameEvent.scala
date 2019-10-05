package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFrameEvent extends js.Object {
  /**
    * the number of times the frame event was fired.
    */
  var count: Double
  /**
    *
    */
  var delta: Double
  /**
    * the total amount of time passed since the first
    */
  var time: Double
}

object IFrameEvent {
  @scala.inline
  def apply(count: Double, delta: Double, time: Double): IFrameEvent = {
    val __obj = js.Dynamic.literal(count = count, delta = delta, time = time)
  
    __obj.asInstanceOf[IFrameEvent]
  }
}

