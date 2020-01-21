package typings.mjmlReact.mod

import typings.csstype.mod.BackgroundColorProperty
import typings.csstype.mod.BackgroundPositionProperty
import typings.csstype.mod.VerticalAlignProperty
import typings.mjmlReact.mjmlReactStrings.`fixed-height`
import typings.mjmlReact.mjmlReactStrings.`fluid-height`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlHeroProps extends js.Object {
  var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.undefined
  var backgroundHeight: js.UndefOr[String] = js.undefined
  var backgroundPosition: js.UndefOr[BackgroundPositionProperty[String | Double]] = js.undefined
  var backgroundUrl: js.UndefOr[String] = js.undefined
  var backgroundWidth: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[String | Double] = js.undefined
  var mode: js.UndefOr[`fluid-height` | `fixed-height`] = js.undefined
  var verticalAlign: js.UndefOr[VerticalAlignProperty[String | Double]] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
}

object MjmlHeroProps {
  @scala.inline
  def apply(
    backgroundColor: BackgroundColorProperty = null,
    backgroundHeight: String = null,
    backgroundPosition: BackgroundPositionProperty[String | Double] = null,
    backgroundUrl: String = null,
    backgroundWidth: String = null,
    height: String | Double = null,
    mode: `fluid-height` | `fixed-height` = null,
    verticalAlign: VerticalAlignProperty[String | Double] = null,
    width: String | Double = null
  ): MjmlHeroProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (backgroundHeight != null) __obj.updateDynamic("backgroundHeight")(backgroundHeight.asInstanceOf[js.Any])
    if (backgroundPosition != null) __obj.updateDynamic("backgroundPosition")(backgroundPosition.asInstanceOf[js.Any])
    if (backgroundUrl != null) __obj.updateDynamic("backgroundUrl")(backgroundUrl.asInstanceOf[js.Any])
    if (backgroundWidth != null) __obj.updateDynamic("backgroundWidth")(backgroundWidth.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MjmlHeroProps]
  }
}

