package typings.otplibCore.anon

import typings.otplibCore.utilsMod.SecretKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Counter extends js.Object {
  var counter: Double
  var secret: SecretKey
  var token: String
}

object Counter {
  @scala.inline
  def apply(counter: Double, secret: SecretKey, token: String): Counter = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Counter]
  }
}

