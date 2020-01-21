package typings.mjmlReact.mod

import typings.csstype.mod.BackgroundColorProperty
import typings.csstype.mod.BackgroundRepeatProperty
import typings.csstype.mod.BackgroundSizeProperty
import typings.csstype.mod.TextAlignProperty
import typings.csstype.mod.VerticalAlignProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlWrapperProps extends js.Object {
  var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.undefined
  var backgroundRepeat: js.UndefOr[BackgroundRepeatProperty] = js.undefined
  var backgroundSize: js.UndefOr[BackgroundSizeProperty[String | Double]] = js.undefined
  var backgroundUrl: js.UndefOr[String] = js.undefined
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  var textAlign: js.UndefOr[TextAlignProperty] = js.undefined
  var verticalAlign: js.UndefOr[VerticalAlignProperty[String | Double]] = js.undefined
}

object MjmlWrapperProps {
  @scala.inline
  def apply(
    backgroundColor: BackgroundColorProperty = null,
    backgroundRepeat: BackgroundRepeatProperty = null,
    backgroundSize: BackgroundSizeProperty[String | Double] = null,
    backgroundUrl: String = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    textAlign: TextAlignProperty = null,
    verticalAlign: VerticalAlignProperty[String | Double] = null
  ): MjmlWrapperProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (backgroundRepeat != null) __obj.updateDynamic("backgroundRepeat")(backgroundRepeat.asInstanceOf[js.Any])
    if (backgroundSize != null) __obj.updateDynamic("backgroundSize")(backgroundSize.asInstanceOf[js.Any])
    if (backgroundUrl != null) __obj.updateDynamic("backgroundUrl")(backgroundUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[MjmlWrapperProps]
  }
}

