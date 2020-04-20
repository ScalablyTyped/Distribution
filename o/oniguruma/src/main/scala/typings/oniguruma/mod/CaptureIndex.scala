package typings.oniguruma.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptureIndex extends js.Object {
  /** The position in the search string where the capture ends */
  var end: Double
  /** The index of the capturing group, or 0 for a full-string match */
  var index: Double
  /** The total character length of the capture */
  var length: Double
  /** The position in the search string where the capture begins */
  var start: Double
}

object CaptureIndex {
  @scala.inline
  def apply(end: Double, index: Double, length: Double, start: Double): CaptureIndex = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureIndex]
  }
}

