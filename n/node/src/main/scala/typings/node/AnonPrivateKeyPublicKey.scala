package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrivateKeyPublicKey extends js.Object {
  var privateKey: java.lang.String
  var publicKey: Buffer
}

object AnonPrivateKeyPublicKey {
  @scala.inline
  def apply(privateKey: java.lang.String, publicKey: Buffer): AnonPrivateKeyPublicKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrivateKeyPublicKey]
  }
}

