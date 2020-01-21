package typings.normalizePackageData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmailUrl extends js.Object {
  var email: String
  var url: js.UndefOr[String] = js.undefined
}

object AnonEmailUrl {
  @scala.inline
  def apply(email: String, url: String = null): AnonEmailUrl = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmailUrl]
  }
}

