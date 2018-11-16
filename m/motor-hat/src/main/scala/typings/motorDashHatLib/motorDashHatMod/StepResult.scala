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

