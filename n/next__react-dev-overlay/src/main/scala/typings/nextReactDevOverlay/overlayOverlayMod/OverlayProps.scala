package typings.nextReactDevOverlay.overlayOverlayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var fixed: js.UndefOr[Boolean] = js.undefined
}

object OverlayProps {
  @scala.inline
  def apply(className: String = null, fixed: js.UndefOr[Boolean] = js.undefined): OverlayProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayProps]
  }
}

