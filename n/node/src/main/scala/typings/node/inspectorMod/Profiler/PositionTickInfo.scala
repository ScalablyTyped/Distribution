package typings.node.inspectorMod.Profiler

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
  var line: Double
  /**
    * Number of samples attributed to the source line.
    */
  var ticks: Double
}

object PositionTickInfo {
  @scala.inline
  def apply(line: Double, ticks: Double): PositionTickInfo = {
    val __obj = js.Dynamic.literal(line = line, ticks = ticks)
  
    __obj.asInstanceOf[PositionTickInfo]
  }
}

