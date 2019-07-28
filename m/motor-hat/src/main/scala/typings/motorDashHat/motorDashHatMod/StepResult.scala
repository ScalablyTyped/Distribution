package typings.motorDashHat.motorDashHatMod

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
  var duration: Double
  /**
    * Number of steps retried
    */
  var retried: Double
  /**
    * Performed steps
    */
  var steps: Double
}

object StepResult {
  @scala.inline
  def apply(dir: Direction, duration: Double, retried: Double, steps: Double): StepResult = {
    val __obj = js.Dynamic.literal(dir = dir, duration = duration, retried = retried, steps = steps)
  
    __obj.asInstanceOf[StepResult]
  }
}

