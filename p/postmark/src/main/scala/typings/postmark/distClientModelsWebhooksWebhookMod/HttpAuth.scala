package typings.postmark.distClientModelsWebhooksWebhookMod

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
    val __obj = js.Dynamic.literal(Password = Password, Username = Username)
  
    __obj.asInstanceOf[HttpAuth]
  }
}

