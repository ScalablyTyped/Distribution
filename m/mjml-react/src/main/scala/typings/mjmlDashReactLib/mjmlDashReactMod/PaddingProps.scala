package typings
package mjmlDashReactLib.mjmlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaddingProps extends js.Object {
  var padding: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var paddingBottom: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var paddingLeft: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var paddingRight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var paddingTop: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object PaddingProps {
  @scala.inline
  def apply(
    padding: java.lang.String | scala.Double = null,
    paddingBottom: java.lang.String | scala.Double = null,
    paddingLeft: java.lang.String | scala.Double = null,
    paddingRight: java.lang.String | scala.Double = null,
    paddingTop: java.lang.String | scala.Double = null
  ): PaddingProps = {
    val __obj = js.Dynamic.literal()
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingProps]
  }
}

