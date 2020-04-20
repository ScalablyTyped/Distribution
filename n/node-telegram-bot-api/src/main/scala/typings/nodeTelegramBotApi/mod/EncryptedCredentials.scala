package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptedCredentials extends js.Object {
  var data: String
  var hash: String
  var secret: String
}

object EncryptedCredentials {
  @scala.inline
  def apply(data: String, hash: String, secret: String): EncryptedCredentials = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedCredentials]
  }
}

