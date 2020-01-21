package typings.pem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPublicKey extends js.Object {
  var publicKey: String
}

object AnonPublicKey {
  @scala.inline
  def apply(publicKey: String): AnonPublicKey = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPublicKey]
  }
}

