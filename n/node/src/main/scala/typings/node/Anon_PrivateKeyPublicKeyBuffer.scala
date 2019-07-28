package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrivateKeyPublicKeyBuffer extends js.Object {
  var privateKey: java.lang.String
  var publicKey: Buffer
}

object Anon_PrivateKeyPublicKeyBuffer {
  @scala.inline
  def apply(privateKey: java.lang.String, publicKey: Buffer): Anon_PrivateKeyPublicKeyBuffer = {
    val __obj = js.Dynamic.literal(privateKey = privateKey, publicKey = publicKey)
  
    __obj.asInstanceOf[Anon_PrivateKeyPublicKeyBuffer]
  }
}

