package typings.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPairKeyObjectResult extends js.Object {
  var privateKey: KeyObject
  var publicKey: KeyObject
}

object KeyPairKeyObjectResult {
  @scala.inline
  def apply(privateKey: KeyObject, publicKey: KeyObject): KeyPairKeyObjectResult = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeyPairKeyObjectResult]
  }
}

