package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrivateKeyPublicKey extends js.Object {
  var privateKey: Buffer
  var publicKey: java.lang.String
}

object AnonPrivateKeyPublicKey {
  @scala.inline
  def apply(privateKey: Buffer, publicKey: java.lang.String): AnonPrivateKeyPublicKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPrivateKeyPublicKey]
  }
}

