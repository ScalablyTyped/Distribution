package typings.motorHat.mod

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
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], retried = retried.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepResult]
  }
}

