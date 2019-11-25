package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AriaFocusSkipLink extends js.Object {
  var ariaFocusSkipLink: js.UndefOr[String] = js.undefined
  var labelCancel: js.UndefOr[String] = js.undefined
}

object Anon_AriaFocusSkipLink {
  @scala.inline
  def apply(ariaFocusSkipLink: String = null, labelCancel: String = null): Anon_AriaFocusSkipLink = {
    val __obj = js.Dynamic.literal()
    if (ariaFocusSkipLink != null) __obj.updateDynamic("ariaFocusSkipLink")(ariaFocusSkipLink.asInstanceOf[js.Any])
    if (labelCancel != null) __obj.updateDynamic("labelCancel")(labelCancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AriaFocusSkipLink]
  }
}

