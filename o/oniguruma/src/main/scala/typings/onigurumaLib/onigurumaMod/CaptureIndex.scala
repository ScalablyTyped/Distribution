package typings
package onigurumaLib.onigurumaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptureIndex extends js.Object {
  /** The position in the search string where the capture ends */
  var end: scala.Double
  /** The index of the capturing group, or 0 for a full-string match */
  var index: scala.Double
  /** The total character length of the capture */
  var length: scala.Double
  /** The position in the search string where the capture begins */
  var start: scala.Double
}

object CaptureIndex {
  @scala.inline
  def apply(end: scala.Double, index: scala.Double, length: scala.Double, start: scala.Double): CaptureIndex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[CaptureIndex]
  }
}

