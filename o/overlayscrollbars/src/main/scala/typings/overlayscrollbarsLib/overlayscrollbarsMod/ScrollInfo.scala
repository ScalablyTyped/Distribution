package typings
package overlayscrollbarsLib.overlayscrollbarsMod

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
  var snappedHandleOffset: overlayscrollbarsLib.Anon_XYNumber
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
    snappedHandleOffset: overlayscrollbarsLib.Anon_XYNumber,
    trackLength: overlayscrollbarsLib.Anon_XYNumber
  ): ScrollInfo = {
    val __obj = js.Dynamic.literal(handleLength = handleLength, handleLengthRatio = handleLengthRatio, handleOffset = handleOffset, isRTL = isRTL, isRTLNormalized = isRTLNormalized, max = max, position = position, ratio = ratio, snappedHandleOffset = snappedHandleOffset, trackLength = trackLength)
  
    __obj.asInstanceOf[ScrollInfo]
  }
}

