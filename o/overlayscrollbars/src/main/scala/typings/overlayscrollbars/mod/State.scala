package typings.overlayscrollbars.mod

import typings.overlayscrollbars.anon.B
import typings.overlayscrollbars.anon.Height
import typings.overlayscrollbars.anon.XBoolean
import typings.overlayscrollbars.anon.XNumber
import typings.overlayscrollbars.anon.Xs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var autoUpdate: Boolean
  var contentScrollSize: Height
  var destroyed: Boolean
  var documentMixed: Boolean
  var hasOverflow: XBoolean
  var heightAuto: Boolean
  var hideOverflow: Xs
  var hostSize: Height
  var overflowAmount: XNumber
  var padding: B
  var sleeping: Boolean
  var viewportSize: Height
  var widthAuto: Boolean
}

object State {
  @scala.inline
  def apply(
    autoUpdate: Boolean,
    contentScrollSize: Height,
    destroyed: Boolean,
    documentMixed: Boolean,
    hasOverflow: XBoolean,
    heightAuto: Boolean,
    hideOverflow: Xs,
    hostSize: Height,
    overflowAmount: XNumber,
    padding: B,
    sleeping: Boolean,
    viewportSize: Height,
    widthAuto: Boolean
  ): State = {
    val __obj = js.Dynamic.literal(autoUpdate = autoUpdate.asInstanceOf[js.Any], contentScrollSize = contentScrollSize.asInstanceOf[js.Any], destroyed = destroyed.asInstanceOf[js.Any], documentMixed = documentMixed.asInstanceOf[js.Any], hasOverflow = hasOverflow.asInstanceOf[js.Any], heightAuto = heightAuto.asInstanceOf[js.Any], hideOverflow = hideOverflow.asInstanceOf[js.Any], hostSize = hostSize.asInstanceOf[js.Any], overflowAmount = overflowAmount.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], sleeping = sleeping.asInstanceOf[js.Any], viewportSize = viewportSize.asInstanceOf[js.Any], widthAuto = widthAuto.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

