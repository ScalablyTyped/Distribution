package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrivateKeyBuffer extends js.Object {
  var privateKey: Buffer
  var publicKey: Buffer
}

object AnonPrivateKeyBuffer {
  @scala.inline
  def apply(privateKey: Buffer, publicKey: Buffer): AnonPrivateKeyBuffer = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrivateKeyBuffer]
  }
}

