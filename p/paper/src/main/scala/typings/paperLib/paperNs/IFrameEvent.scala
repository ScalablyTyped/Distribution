package typings
package paperLib.paperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFrameEvent extends js.Object {
  /**
    * the number of times the frame event was fired.
    */
  var count: scala.Double
  /**
    *
    */
  var delta: scala.Double
  /**
    * the total amount of time passed since the first
    */
  var time: scala.Double
}

object IFrameEvent {
  @scala.inline
  def apply(count: scala.Double, delta: scala.Double, time: scala.Double): IFrameEvent = {
    val __obj = js.Dynamic.literal(count = count, delta = delta, time = time)
  
    __obj.asInstanceOf[IFrameEvent]
  }
}

