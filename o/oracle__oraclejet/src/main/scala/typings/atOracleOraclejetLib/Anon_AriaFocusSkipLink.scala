package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AriaFocusSkipLink extends js.Object {
  var ariaFocusSkipLink: js.UndefOr[java.lang.String] = js.undefined
  var labelCancel: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AriaFocusSkipLink {
  @scala.inline
  def apply(ariaFocusSkipLink: java.lang.String = null, labelCancel: java.lang.String = null): Anon_AriaFocusSkipLink = {
    val __obj = js.Dynamic.literal()
    if (ariaFocusSkipLink != null) __obj.updateDynamic("ariaFocusSkipLink")(ariaFocusSkipLink)
    if (labelCancel != null) __obj.updateDynamic("labelCancel")(labelCancel)
    __obj.asInstanceOf[Anon_AriaFocusSkipLink]
  }
}

