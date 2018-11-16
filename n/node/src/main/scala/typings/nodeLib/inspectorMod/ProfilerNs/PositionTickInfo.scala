package typings
package nodeLib.inspectorMod.ProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Specifies a number of samples attributed to a certain source position.
         */

trait PositionTickInfo extends js.Object {
  /**
               * Source line number (1-based).
               */
  var line: scala.Double
  /**
               * Number of samples attributed to the source line.
               */
  var ticks: scala.Double
}

