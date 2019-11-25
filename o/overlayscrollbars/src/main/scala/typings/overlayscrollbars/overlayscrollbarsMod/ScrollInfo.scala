package typings.overlayscrollbars.overlayscrollbarsMod

import typings.overlayscrollbars.Anon_XYNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollInfo extends js.Object {
  var handleLength: Anon_XYNumber
  var handleLengthRatio: Anon_XYNumber
  var handleOffset: Anon_XYNumber
  var isRTL: Boolean
  var isRTLNormalized: Boolean
  var max: Anon_XYNumber
  var position: Anon_XYNumber
  var ratio: Anon_XYNumber
  var snappedHandleOffset: Anon_XYNumber
  var trackLength: Anon_XYNumber
}

object ScrollInfo {
  @scala.inline
  def apply(
    handleLength: Anon_XYNumber,
    handleLengthRatio: Anon_XYNumber,
    handleOffset: Anon_XYNumber,
    isRTL: Boolean,
    isRTLNormalized: Boolean,
    max: Anon_XYNumber,
    position: Anon_XYNumber,
    ratio: Anon_XYNumber,
    snappedHandleOffset: Anon_XYNumber,
    trackLength: Anon_XYNumber
  ): ScrollInfo = {
    val __obj = js.Dynamic.literal(handleLength = handleLength.asInstanceOf[js.Any], handleLengthRatio = handleLengthRatio.asInstanceOf[js.Any], handleOffset = handleOffset.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any], isRTLNormalized = isRTLNormalized.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], snappedHandleOffset = snappedHandleOffset.asInstanceOf[js.Any], trackLength = trackLength.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScrollInfo]
  }
}

