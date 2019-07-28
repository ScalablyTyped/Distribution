package typings.mjmlDashReact.mjmlDashReactMod

import typings.csstype.csstypeMod.BackgroundColorProperty
import typings.csstype.csstypeMod.VerticalAlignProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlGroupProps extends js.Object {
  var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.undefined
  var verticalAlign: js.UndefOr[VerticalAlignProperty[String | Double]] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
}

object MjmlGroupProps {
  @scala.inline
  def apply(
    backgroundColor: BackgroundColorProperty = null,
    verticalAlign: VerticalAlignProperty[String | Double] = null,
    width: String | Double = null
  ): MjmlGroupProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MjmlGroupProps]
  }
}

