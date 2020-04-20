package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPublicKey extends js.Object {
  var privateKey: Buffer
  var publicKey: java.lang.String
}

object AnonPublicKey {
  @scala.inline
  def apply(privateKey: Buffer, publicKey: java.lang.String): AnonPublicKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPublicKey]
  }
}

