package typings.overlayscrollbars.mod

import typings.overlayscrollbars.AnonB
import typings.overlayscrollbars.AnonHeight
import typings.overlayscrollbars.AnonXXs
import typings.overlayscrollbars.AnonXYBoolean
import typings.overlayscrollbars.AnonXYNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var autoUpdate: Boolean
  var contentScrollSize: AnonHeight
  var destroyed: Boolean
  var documentMixed: Boolean
  var hasOverflow: AnonXYBoolean
  var heightAuto: Boolean
  var hideOverflow: AnonXXs
  var hostSize: AnonHeight
  var overflowAmount: AnonXYNumber
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
    hasOverflow: AnonXYBoolean,
    heightAuto: Boolean,
    hideOverflow: AnonXXs,
    hostSize: AnonHeight,
    overflowAmount: AnonXYNumber,
    padding: AnonB,
    sleeping: Boolean,
    viewportSize: AnonHeight,
    widthAuto: Boolean
  ): State = {
    val __obj = js.Dynamic.literal(autoUpdate = autoUpdate.asInstanceOf[js.Any], contentScrollSize = contentScrollSize.asInstanceOf[js.Any], destroyed = destroyed.asInstanceOf[js.Any], documentMixed = documentMixed.asInstanceOf[js.Any], hasOverflow = hasOverflow.asInstanceOf[js.Any], heightAuto = heightAuto.asInstanceOf[js.Any], hideOverflow = hideOverflow.asInstanceOf[js.Any], hostSize = hostSize.asInstanceOf[js.Any], overflowAmount = overflowAmount.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], sleeping = sleeping.asInstanceOf[js.Any], viewportSize = viewportSize.asInstanceOf[js.Any], widthAuto = widthAuto.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

