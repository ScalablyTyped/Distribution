package typings.packageJson.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Email extends js.Object {
  val email: js.UndefOr[String] = js.undefined
  val url: String
}

object Email {
  @scala.inline
  def apply(url: String, email: String = null): Email = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
}

