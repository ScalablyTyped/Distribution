package typings.overlayscrollbars.mod

import typings.overlayscrollbars.AnonXNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollInfo extends js.Object {
  var handleLength: AnonXNumber
  var handleLengthRatio: AnonXNumber
  var handleOffset: AnonXNumber
  var isRTL: Boolean
  var isRTLNormalized: Boolean
  var max: AnonXNumber
  var position: AnonXNumber
  var ratio: AnonXNumber
  var snappedHandleOffset: AnonXNumber
  var trackLength: AnonXNumber
}

object ScrollInfo {
  @scala.inline
  def apply(
    handleLength: AnonXNumber,
    handleLengthRatio: AnonXNumber,
    handleOffset: AnonXNumber,
    isRTL: Boolean,
    isRTLNormalized: Boolean,
    max: AnonXNumber,
    position: AnonXNumber,
    ratio: AnonXNumber,
    snappedHandleOffset: AnonXNumber,
    trackLength: AnonXNumber
  ): ScrollInfo = {
    val __obj = js.Dynamic.literal(handleLength = handleLength.asInstanceOf[js.Any], handleLengthRatio = handleLengthRatio.asInstanceOf[js.Any], handleOffset = handleOffset.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any], isRTLNormalized = isRTLNormalized.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], snappedHandleOffset = snappedHandleOffset.asInstanceOf[js.Any], trackLength = trackLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollInfo]
  }
}

