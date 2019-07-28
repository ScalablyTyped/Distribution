package typings.motorDashHat.motorDashHatMod

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
  var duration: Double
  /**
    * Performed steps
    */
  var steps: Double
}

object StepSyncResult {
  @scala.inline
  def apply(dir: Direction, duration: Double, steps: Double): StepSyncResult = {
    val __obj = js.Dynamic.literal(dir = dir, duration = duration, steps = steps)
  
    __obj.asInstanceOf[StepSyncResult]
  }
}

