package typings.mjmlReact.mod

import typings.csstype.mod.BackgroundColorProperty
import typings.csstype.mod.BackgroundRepeatProperty
import typings.csstype.mod.BackgroundSizeProperty
import typings.csstype.mod.TextAlignProperty
import typings.csstype.mod.VerticalAlignProperty
import typings.mjmlReact.mjmlReactStrings.ltr
import typings.mjmlReact.mjmlReactStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlSectionProps extends js.Object {
  var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.undefined
  var backgroundRepeat: js.UndefOr[BackgroundRepeatProperty] = js.undefined
  var backgroundSize: js.UndefOr[BackgroundSizeProperty[String | Double]] = js.undefined
  var backgroundUrl: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  var textAlign: js.UndefOr[TextAlignProperty] = js.undefined
  var verticalAlign: js.UndefOr[VerticalAlignProperty[String | Double]] = js.undefined
}

object MjmlSectionProps {
  @scala.inline
  def apply(
    backgroundColor: BackgroundColorProperty = null,
    backgroundRepeat: BackgroundRepeatProperty = null,
    backgroundSize: BackgroundSizeProperty[String | Double] = null,
    backgroundUrl: String = null,
    direction: ltr | rtl = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    textAlign: TextAlignProperty = null,
    verticalAlign: VerticalAlignProperty[String | Double] = null
  ): MjmlSectionProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (backgroundRepeat != null) __obj.updateDynamic("backgroundRepeat")(backgroundRepeat.asInstanceOf[js.Any])
    if (backgroundSize != null) __obj.updateDynamic("backgroundSize")(backgroundSize.asInstanceOf[js.Any])
    if (backgroundUrl != null) __obj.updateDynamic("backgroundUrl")(backgroundUrl.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.get.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[MjmlSectionProps]
  }
}

