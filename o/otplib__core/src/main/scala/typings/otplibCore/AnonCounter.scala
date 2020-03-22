package typings.otplibCore

import typings.otplibCore.utilsMod.SecretKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCounter extends js.Object {
  var counter: Double
  var secret: SecretKey
  var token: String
}

object AnonCounter {
  @scala.inline
  def apply(counter: Double, secret: SecretKey, token: String): AnonCounter = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCounter]
  }
}

