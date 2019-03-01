package typings
package motorDashHatLib.motorDashHatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepResult extends js.Object {
  /**
    * Direction of steps performed
    */
  var dir: Direction
  /**
    * Time in ms taken to perform the steps
    */
  var duration: scala.Double
  /**
    * Number of steps retried
    */
  var retried: scala.Double
  /**
    * Performed steps
    */
  var steps: scala.Double
}

object StepResult {
  @scala.inline
  def apply(dir: Direction, duration: scala.Double, retried: scala.Double, steps: scala.Double): StepResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dir")(dir)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("retried")(retried)
    __obj.updateDynamic("steps")(steps)
    __obj.asInstanceOf[StepResult]
  }
}

