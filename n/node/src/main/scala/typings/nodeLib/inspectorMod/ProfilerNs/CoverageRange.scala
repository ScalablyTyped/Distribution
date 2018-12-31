package typings
package nodeLib.inspectorMod.ProfilerNs

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
  var count: scala.Double
  /**
    * JavaScript script source offset for the range end.
    */
  var endOffset: scala.Double
  /**
    * JavaScript script source offset for the range start.
    */
  var startOffset: scala.Double
}

