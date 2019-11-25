package typings.overlayscrollbars.overlayscrollbarsMod

import typings.overlayscrollbars.Anon_B
import typings.overlayscrollbars.Anon_Height
import typings.overlayscrollbars.Anon_XXs
import typings.overlayscrollbars.Anon_XYBoolean
import typings.overlayscrollbars.Anon_XYNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var autoUpdate: Boolean
  var contentScrollSize: Anon_Height
  var destroyed: Boolean
  var documentMixed: Boolean
  var hasOverflow: Anon_XYBoolean
  var heightAuto: Boolean
  var hideOverflow: Anon_XXs
  var hostSize: Anon_Height
  var overflowAmount: Anon_XYNumber
  var padding: Anon_B
  var sleeping: Boolean
  var viewportSize: Anon_Height
  var widthAuto: Boolean
}

object State {
  @scala.inline
  def apply(
    autoUpdate: Boolean,
    contentScrollSize: Anon_Height,
    destroyed: Boolean,
    documentMixed: Boolean,
    hasOverflow: Anon_XYBoolean,
    heightAuto: Boolean,
    hideOverflow: Anon_XXs,
    hostSize: Anon_Height,
    overflowAmount: Anon_XYNumber,
    padding: Anon_B,
    sleeping: Boolean,
    viewportSize: Anon_Height,
    widthAuto: Boolean
  ): State = {
    val __obj = js.Dynamic.literal(autoUpdate = autoUpdate.asInstanceOf[js.Any], contentScrollSize = contentScrollSize.asInstanceOf[js.Any], destroyed = destroyed.asInstanceOf[js.Any], documentMixed = documentMixed.asInstanceOf[js.Any], hasOverflow = hasOverflow.asInstanceOf[js.Any], heightAuto = heightAuto.asInstanceOf[js.Any], hideOverflow = hideOverflow.asInstanceOf[js.Any], hostSize = hostSize.asInstanceOf[js.Any], overflowAmount = overflowAmount.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], sleeping = sleeping.asInstanceOf[js.Any], viewportSize = viewportSize.asInstanceOf[js.Any], widthAuto = widthAuto.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

