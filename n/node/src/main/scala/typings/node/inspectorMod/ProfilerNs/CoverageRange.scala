package typings.node.inspectorMod.ProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Coverage data for a source range.
  */
trait CoverageRange extends js.Object {
  /**
    * Collected execution count of the source range.
    */
  var count: Double
  /**
    * JavaScript script source offset for the range end.
    */
  var endOffset: Double
  /**
    * JavaScript script source offset for the range start.
    */
  var startOffset: Double
}

object CoverageRange {
  @scala.inline
  def apply(count: Double, endOffset: Double, startOffset: Double): CoverageRange = {
    val __obj = js.Dynamic.literal(count = count, endOffset = endOffset, startOffset = startOffset)
  
    __obj.asInstanceOf[CoverageRange]
  }
}

