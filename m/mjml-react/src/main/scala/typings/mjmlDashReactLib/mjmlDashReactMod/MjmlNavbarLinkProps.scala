package typings
package mjmlDashReactLib.mjmlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlNavbarLinkProps extends js.Object {
  var color: js.UndefOr[csstypeLib.csstypeMod.ColorProperty] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  var fontWeight: js.UndefOr[scala.Double] = js.undefined
  var lineHeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var textDecoration: js.UndefOr[java.lang.String] = js.undefined
  var textTransform: js.UndefOr[java.lang.String] = js.undefined
}

object MjmlNavbarLinkProps {
  @scala.inline
  def apply(
    color: csstypeLib.csstypeMod.ColorProperty = null,
    fontFamily: java.lang.String = null,
    fontSize: java.lang.String | scala.Double = null,
    fontStyle: java.lang.String = null,
    fontWeight: scala.Int | scala.Double = null,
    lineHeight: java.lang.String | scala.Double = null,
    textDecoration: java.lang.String = null,
    textTransform: java.lang.String = null
  ): MjmlNavbarLinkProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration)
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform)
    __obj.asInstanceOf[MjmlNavbarLinkProps]
  }
}

