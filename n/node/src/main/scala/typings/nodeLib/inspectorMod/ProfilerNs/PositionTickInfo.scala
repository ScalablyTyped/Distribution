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

object PositionTickInfo {
  @scala.inline
  def apply(line: scala.Double, ticks: scala.Double): PositionTickInfo = {
    val __obj = js.Dynamic.literal(line = line, ticks = ticks)
  
    __obj.asInstanceOf[PositionTickInfo]
  }
}

