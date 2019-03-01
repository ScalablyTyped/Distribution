package typings
package motorDashHatLib.motorDashHatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepSyncResult extends js.Object {
  /**
    * Direction of steps performed
    */
  var dir: Direction
  /**
    * Time in ms taken to perform the steps
    */
  var duration: scala.Double
  /**
    * Performed steps
    */
  var steps: scala.Double
}

object StepSyncResult {
  @scala.inline
  def apply(dir: Direction, duration: scala.Double, steps: scala.Double): StepSyncResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dir")(dir)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("steps")(steps)
    __obj.asInstanceOf[StepSyncResult]
  }
}

