package typings
package mjmlDashReactLib.mjmlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlSpacerProps extends js.Object {
  var containerBackgroundColor: js.UndefOr[csstypeLib.csstypeMod.BackgroundColorProperty] = js.undefined
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var verticalAlign: js.UndefOr[csstypeLib.csstypeMod.VerticalAlignProperty[java.lang.String | scala.Double]] = js.undefined
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object MjmlSpacerProps {
  @scala.inline
  def apply(
    containerBackgroundColor: csstypeLib.csstypeMod.BackgroundColorProperty = null,
    height: java.lang.String | scala.Double = null,
    verticalAlign: csstypeLib.csstypeMod.VerticalAlignProperty[java.lang.String | scala.Double] = null,
    width: java.lang.String | scala.Double = null
  ): MjmlSpacerProps = {
    val __obj = js.Dynamic.literal()
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MjmlSpacerProps]
  }
}

