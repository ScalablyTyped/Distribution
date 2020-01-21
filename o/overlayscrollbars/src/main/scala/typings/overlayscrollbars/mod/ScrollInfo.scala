package typings.overlayscrollbars.mod

import typings.overlayscrollbars.AnonXYNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollInfo extends js.Object {
  var handleLength: AnonXYNumber
  var handleLengthRatio: AnonXYNumber
  var handleOffset: AnonXYNumber
  var isRTL: Boolean
  var isRTLNormalized: Boolean
  var max: AnonXYNumber
  var position: AnonXYNumber
  var ratio: AnonXYNumber
  var snappedHandleOffset: AnonXYNumber
  var trackLength: AnonXYNumber
}

object ScrollInfo {
  @scala.inline
  def apply(
    handleLength: AnonXYNumber,
    handleLengthRatio: AnonXYNumber,
    handleOffset: AnonXYNumber,
    isRTL: Boolean,
    isRTLNormalized: Boolean,
    max: AnonXYNumber,
    position: AnonXYNumber,
    ratio: AnonXYNumber,
    snappedHandleOffset: AnonXYNumber,
    trackLength: AnonXYNumber
  ): ScrollInfo = {
    val __obj = js.Dynamic.literal(handleLength = handleLength.asInstanceOf[js.Any], handleLengthRatio = handleLengthRatio.asInstanceOf[js.Any], handleOffset = handleOffset.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any], isRTLNormalized = isRTLNormalized.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], snappedHandleOffset = snappedHandleOffset.asInstanceOf[js.Any], trackLength = trackLength.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScrollInfo]
  }
}

