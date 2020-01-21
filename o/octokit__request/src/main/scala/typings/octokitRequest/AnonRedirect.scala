package typings.octokitRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRedirect extends js.Object {
  var redirect: js.UndefOr[String] = js.undefined
}

object AnonRedirect {
  @scala.inline
  def apply(redirect: String = null): AnonRedirect = {
    val __obj = js.Dynamic.literal()
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRedirect]
  }
}

