package typings.mjmlDashReact.mjmlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderProps extends js.Object {
  var border: js.UndefOr[String] = js.undefined
  var borderBottom: js.UndefOr[String] = js.undefined
  var borderLeft: js.UndefOr[String] = js.undefined
  var borderRadius: js.UndefOr[String | Double] = js.undefined
  var borderRight: js.UndefOr[String] = js.undefined
  var borderTop: js.UndefOr[String] = js.undefined
}

object BorderProps {
  @scala.inline
  def apply(
    border: String = null,
    borderBottom: String = null,
    borderLeft: String = null,
    borderRadius: String | Double = null,
    borderRight: String = null,
    borderTop: String = null
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

