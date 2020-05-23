package typings.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKey extends js.Object {
  var privateKey: typings.node.Buffer
  var publicKey: String
}

object PublicKey {
  @scala.inline
  def apply(privateKey: typings.node.Buffer, publicKey: String): PublicKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKey]
  }
}

