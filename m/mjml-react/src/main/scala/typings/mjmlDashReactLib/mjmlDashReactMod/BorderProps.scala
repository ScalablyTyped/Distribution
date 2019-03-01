package typings
package mjmlDashReactLib.mjmlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderProps extends js.Object {
  var border: js.UndefOr[java.lang.String] = js.undefined
  var borderBottom: js.UndefOr[java.lang.String] = js.undefined
  var borderLeft: js.UndefOr[java.lang.String] = js.undefined
  var borderRadius: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var borderRight: js.UndefOr[java.lang.String] = js.undefined
  var borderTop: js.UndefOr[java.lang.String] = js.undefined
}

object BorderProps {
  @scala.inline
  def apply(
    border: java.lang.String = null,
    borderBottom: java.lang.String = null,
    borderLeft: java.lang.String = null,
    borderRadius: java.lang.String | scala.Double = null,
    borderRight: java.lang.String = null,
    borderTop: java.lang.String = null
  ): BorderProps = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (borderBottom != null) __obj.updateDynamic("borderBottom")(borderBottom)
    if (borderLeft != null) __obj.updateDynamic("borderLeft")(borderLeft)
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderRight != null) __obj.updateDynamic("borderRight")(borderRight)
    if (borderTop != null) __obj.updateDynamic("borderTop")(borderTop)
    __obj.asInstanceOf[BorderProps]
  }
}

