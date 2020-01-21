package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrivateKey extends js.Object {
  var privateKey: java.lang.String
  var publicKey: java.lang.String
}

object AnonPrivateKey {
  @scala.inline
  def apply(privateKey: java.lang.String, publicKey: java.lang.String): AnonPrivateKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPrivateKey]
  }
}

