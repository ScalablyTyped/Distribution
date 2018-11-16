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

