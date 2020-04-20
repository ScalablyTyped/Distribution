package typings.postmark.webhookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpAuth extends js.Object {
  var Password: String
  var Username: String
}

object HttpAuth {
  @scala.inline
  def apply(Password: String, Username: String): HttpAuth = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpAuth]
  }
}

