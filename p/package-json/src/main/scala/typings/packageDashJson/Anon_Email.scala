package typings.packageDashJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  val email: js.UndefOr[String] = js.undefined
  val url: String
}

object Anon_Email {
  @scala.inline
  def apply(url: String, email: String = null): Anon_Email = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Email]
  }
}

