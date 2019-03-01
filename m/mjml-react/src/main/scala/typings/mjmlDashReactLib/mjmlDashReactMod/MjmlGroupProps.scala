package typings
package mjmlDashReactLib.mjmlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlGroupProps extends js.Object {
  var backgroundColor: js.UndefOr[csstypeLib.csstypeMod.BackgroundColorProperty] = js.undefined
  var verticalAlign: js.UndefOr[csstypeLib.csstypeMod.VerticalAlignProperty[java.lang.String | scala.Double]] = js.undefined
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object MjmlGroupProps {
  @scala.inline
  def apply(
    backgroundColor: csstypeLib.csstypeMod.BackgroundColorProperty = null,
    verticalAlign: csstypeLib.csstypeMod.VerticalAlignProperty[java.lang.String | scala.Double] = null,
    width: java.lang.String | scala.Double = null
  ): MjmlGroupProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MjmlGroupProps]
  }
}

