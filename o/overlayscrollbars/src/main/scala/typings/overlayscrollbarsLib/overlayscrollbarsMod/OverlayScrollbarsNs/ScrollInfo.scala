package typings
package overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollInfo extends js.Object {
  var handleLength: overlayscrollbarsLib.Anon_XYNumber
  var handleLengthRatio: overlayscrollbarsLib.Anon_XYNumber
  var handleOffset: overlayscrollbarsLib.Anon_XYNumber
  var isRTL: scala.Boolean
  var isRTLNormalized: scala.Boolean
  var max: overlayscrollbarsLib.Anon_XYNumber
  var position: overlayscrollbarsLib.Anon_XYNumber
  var ratio: overlayscrollbarsLib.Anon_XYNumber
  var trackLength: overlayscrollbarsLib.Anon_XYNumber
}

object ScrollInfo {
  @scala.inline
  def apply(
    handleLength: overlayscrollbarsLib.Anon_XYNumber,
    handleLengthRatio: overlayscrollbarsLib.Anon_XYNumber,
    handleOffset: overlayscrollbarsLib.Anon_XYNumber,
    isRTL: scala.Boolean,
    isRTLNormalized: scala.Boolean,
    max: overlayscrollbarsLib.Anon_XYNumber,
    position: overlayscrollbarsLib.Anon_XYNumber,
    ratio: overlayscrollbarsLib.Anon_XYNumber,
    trackLength: overlayscrollbarsLib.Anon_XYNumber
  ): ScrollInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handleLength")(handleLength)
    __obj.updateDynamic("handleLengthRatio")(handleLengthRatio)
    __obj.updateDynamic("handleOffset")(handleOffset)
    __obj.updateDynamic("isRTL")(isRTL)
    __obj.updateDynamic("isRTLNormalized")(isRTLNormalized)
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("ratio")(ratio)
    __obj.updateDynamic("trackLength")(trackLength)
    __obj.asInstanceOf[ScrollInfo]
  }
}

