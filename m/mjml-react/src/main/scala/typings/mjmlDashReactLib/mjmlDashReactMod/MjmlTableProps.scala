package typings
package mjmlDashReactLib.mjmlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlTableProps extends js.Object {
  var cellpadding: js.UndefOr[java.lang.String] = js.undefined
  var cellspacing: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[csstypeLib.csstypeMod.ColorProperty] = js.undefined
  var containerBackgroundColor: js.UndefOr[csstypeLib.csstypeMod.BackgroundColorProperty] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  var lineHeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var tableLayout: js.UndefOr[
    mjmlDashReactLib.mjmlDashReactLibStrings.auto | mjmlDashReactLib.mjmlDashReactLibStrings.fixed | mjmlDashReactLib.mjmlDashReactLibStrings.initial | mjmlDashReactLib.mjmlDashReactLibStrings.inherit
  ] = js.undefined
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object MjmlTableProps {
  @scala.inline
  def apply(
    cellpadding: java.lang.String = null,
    cellspacing: java.lang.String = null,
    color: csstypeLib.csstypeMod.ColorProperty = null,
    containerBackgroundColor: csstypeLib.csstypeMod.BackgroundColorProperty = null,
    fontFamily: java.lang.String = null,
    fontSize: java.lang.String | scala.Double = null,
    fontStyle: java.lang.String = null,
    lineHeight: java.lang.String | scala.Double = null,
    tableLayout: mjmlDashReactLib.mjmlDashReactLibStrings.auto | mjmlDashReactLib.mjmlDashReactLibStrings.fixed | mjmlDashReactLib.mjmlDashReactLibStrings.initial | mjmlDashReactLib.mjmlDashReactLibStrings.inherit = null,
    width: java.lang.String | scala.Double = null
  ): MjmlTableProps = {
    val __obj = js.Dynamic.literal()
    if (cellpadding != null) __obj.updateDynamic("cellpadding")(cellpadding)
    if (cellspacing != null) __obj.updateDynamic("cellspacing")(cellspacing)
    if (color != null) __obj.updateDynamic("color")(color)
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (tableLayout != null) __obj.updateDynamic("tableLayout")(tableLayout.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MjmlTableProps]
  }
}

