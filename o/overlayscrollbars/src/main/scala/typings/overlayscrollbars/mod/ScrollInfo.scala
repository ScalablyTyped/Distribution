package typings.overlayscrollbars.mod

import typings.overlayscrollbars.anon.XNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollInfo extends js.Object {
  var handleLength: XNumber
  var handleLengthRatio: XNumber
  var handleOffset: XNumber
  var isRTL: Boolean
  var isRTLNormalized: Boolean
  var max: XNumber
  var position: XNumber
  var ratio: XNumber
  var snappedHandleOffset: XNumber
  var trackLength: XNumber
}

object ScrollInfo {
  @scala.inline
  def apply(
    handleLength: XNumber,
    handleLengthRatio: XNumber,
    handleOffset: XNumber,
    isRTL: Boolean,
    isRTLNormalized: Boolean,
    max: XNumber,
    position: XNumber,
    ratio: XNumber,
    snappedHandleOffset: XNumber,
    trackLength: XNumber
  ): ScrollInfo = {
    val __obj = js.Dynamic.literal(handleLength = handleLength.asInstanceOf[js.Any], handleLengthRatio = handleLengthRatio.asInstanceOf[js.Any], handleOffset = handleOffset.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any], isRTLNormalized = isRTLNormalized.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], snappedHandleOffset = snappedHandleOffset.asInstanceOf[js.Any], trackLength = trackLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollInfo]
  }
}

