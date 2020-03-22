package typings.packageJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUrl extends js.Object {
  val email: String
  val url: js.UndefOr[String] = js.undefined
}

object AnonUrl {
  @scala.inline
  def apply(email: String, url: String = null): AnonUrl = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUrl]
  }
}

