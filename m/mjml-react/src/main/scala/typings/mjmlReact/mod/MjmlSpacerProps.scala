package typings.mjmlReact.mod

import typings.csstype.mod.BackgroundColorProperty
import typings.csstype.mod.VerticalAlignProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlSpacerProps extends js.Object {
  var containerBackgroundColor: js.UndefOr[BackgroundColorProperty] = js.undefined
  var height: js.UndefOr[String | Double] = js.undefined
  var verticalAlign: js.UndefOr[VerticalAlignProperty[String | Double]] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
}

object MjmlSpacerProps {
  @scala.inline
  def apply(
    containerBackgroundColor: BackgroundColorProperty = null,
    height: String | Double = null,
    verticalAlign: VerticalAlignProperty[String | Double] = null,
    width: String | Double = null
  ): MjmlSpacerProps = {
    val __obj = js.Dynamic.literal()
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MjmlSpacerProps]
  }
}

