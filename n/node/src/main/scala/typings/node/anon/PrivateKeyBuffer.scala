package typings.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateKeyBuffer extends js.Object {
  var privateKey: typings.node.Buffer
  var publicKey: typings.node.Buffer
}

object PrivateKeyBuffer {
  @scala.inline
  def apply(privateKey: typings.node.Buffer, publicKey: typings.node.Buffer): PrivateKeyBuffer = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKeyBuffer]
  }
}

