package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrivateKeyPublicKeyBuffer extends js.Object {
  var privateKey: java.lang.String
  var publicKey: Buffer
}

object AnonPrivateKeyPublicKeyBuffer {
  @scala.inline
  def apply(privateKey: java.lang.String, publicKey: Buffer): AnonPrivateKeyPublicKeyBuffer = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPrivateKeyPublicKeyBuffer]
  }
}

