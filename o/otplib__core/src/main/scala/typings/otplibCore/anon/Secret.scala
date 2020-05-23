package typings.otplibCore.anon

import typings.otplibCore.utilsMod.SecretKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Secret extends js.Object {
  var secret: SecretKey
  var token: String
}

object Secret {
  @scala.inline
  def apply(secret: SecretKey, token: String): Secret = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Secret]
  }
}

