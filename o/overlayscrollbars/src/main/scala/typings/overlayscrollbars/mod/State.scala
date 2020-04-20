package typings.overlayscrollbars.mod

import typings.overlayscrollbars.AnonB
import typings.overlayscrollbars.AnonHeight
import typings.overlayscrollbars.AnonXBoolean
import typings.overlayscrollbars.AnonXNumber
import typings.overlayscrollbars.AnonXs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var autoUpdate: Boolean
  var contentScrollSize: AnonHeight
  var destroyed: Boolean
  var documentMixed: Boolean
  var hasOverflow: AnonXBoolean
  var heightAuto: Boolean
  var hideOverflow: AnonXs
  var hostSize: AnonHeight
  var overflowAmount: AnonXNumber
  var padding: AnonB
  var sleeping: Boolean
  var viewportSize: AnonHeight
  var widthAuto: Boolean
}

object State {
  @scala.inline
  def apply(
    autoUpdate: Boolean,
    contentScrollSize: AnonHeight,
    destroyed: Boolean,
    documentMixed: Boolean,
    hasOverflow: AnonXBoolean,
    heightAuto: Boolean,
    hideOverflow: AnonXs,
    hostSize: AnonHeight,
    overflowAmount: AnonXNumber,
    padding: AnonB,
    sleeping: Boolean,
    viewportSize: AnonHeight,
    widthAuto: Boolean
  ): State = {
    val __obj = js.Dynamic.literal(autoUpdate = autoUpdate.asInstanceOf[js.Any], contentScrollSize = contentScrollSize.asInstanceOf[js.Any], destroyed = destroyed.asInstanceOf[js.Any], documentMixed = documentMixed.asInstanceOf[js.Any], hasOverflow = hasOverflow.asInstanceOf[js.Any], heightAuto = heightAuto.asInstanceOf[js.Any], hideOverflow = hideOverflow.asInstanceOf[js.Any], hostSize = hostSize.asInstanceOf[js.Any], overflowAmount = overflowAmount.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], sleeping = sleeping.asInstanceOf[js.Any], viewportSize = viewportSize.asInstanceOf[js.Any], widthAuto = widthAuto.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

