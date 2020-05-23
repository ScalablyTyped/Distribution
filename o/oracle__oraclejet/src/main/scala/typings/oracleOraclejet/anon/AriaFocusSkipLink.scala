package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AriaFocusSkipLink extends js.Object {
  var ariaFocusSkipLink: js.UndefOr[String] = js.undefined
  var labelCancel: js.UndefOr[String] = js.undefined
}

object AriaFocusSkipLink {
  @scala.inline
  def apply(ariaFocusSkipLink: String = null, labelCancel: String = null): AriaFocusSkipLink = {
    val __obj = js.Dynamic.literal()
    if (ariaFocusSkipLink != null) __obj.updateDynamic("ariaFocusSkipLink")(ariaFocusSkipLink.asInstanceOf[js.Any])
    if (labelCancel != null) __obj.updateDynamic("labelCancel")(labelCancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaFocusSkipLink]
  }
}

