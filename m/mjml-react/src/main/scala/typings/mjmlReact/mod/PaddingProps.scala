package typings.mjmlReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaddingProps extends js.Object {
  var padding: js.UndefOr[String | Double] = js.undefined
  var paddingBottom: js.UndefOr[String | Double] = js.undefined
  var paddingLeft: js.UndefOr[String | Double] = js.undefined
  var paddingRight: js.UndefOr[String | Double] = js.undefined
  var paddingTop: js.UndefOr[String | Double] = js.undefined
}

object PaddingProps {
  @scala.inline
  def apply(
    padding: String | Double = null,
    paddingBottom: String | Double = null,
    paddingLeft: String | Double = null,
    paddingRight: String | Double = null,
    paddingTop: String | Double = null
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

