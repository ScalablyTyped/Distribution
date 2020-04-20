package typings.otplibCore

import typings.otplibCore.utilsMod.SecretKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSecret extends js.Object {
  var secret: SecretKey
  var token: String
}

object AnonSecret {
  @scala.inline
  def apply(secret: SecretKey, token: String): AnonSecret = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSecret]
  }
}

