package typings.mjmlDashReact.mjmlDashReactMod

import typings.csstype.csstypeMod.BackgroundColorProperty
import typings.csstype.csstypeMod.ColorProperty
import typings.mjmlDashReact.mjmlDashReactStrings.auto
import typings.mjmlDashReact.mjmlDashReactStrings.fixed
import typings.mjmlDashReact.mjmlDashReactStrings.inherit
import typings.mjmlDashReact.mjmlDashReactStrings.initial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlTableProps extends js.Object {
  var cellpadding: js.UndefOr[String] = js.undefined
  var cellspacing: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[ColorProperty] = js.undefined
  var containerBackgroundColor: js.UndefOr[BackgroundColorProperty] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[String | Double] = js.undefined
  var fontStyle: js.UndefOr[String] = js.undefined
  var lineHeight: js.UndefOr[String | Double] = js.undefined
  var tableLayout: js.UndefOr[auto | fixed | initial | inherit] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
}

object MjmlTableProps {
  @scala.inline
  def apply(
    cellpadding: String = null,
    cellspacing: String = null,
    color: ColorProperty = null,
    containerBackgroundColor: BackgroundColorProperty = null,
    fontFamily: String = null,
    fontSize: String | Double = null,
    fontStyle: String = null,
    lineHeight: String | Double = null,
    tableLayout: auto | fixed | initial | inherit = null,
    width: String | Double = null
  ): MjmlTableProps = {
    val __obj = js.Dynamic.literal()
    if (cellpadding != null) __obj.updateDynamic("cellpadding")(cellpadding.asInstanceOf[js.Any])
    if (cellspacing != null) __obj.updateDynamic("cellspacing")(cellspacing.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (tableLayout != null) __obj.updateDynamic("tableLayout")(tableLayout.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MjmlTableProps]
  }
}

