package typings.nodeDashForge.nodeDashForgeMod.pki.rsa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPair extends js.Object {
  var privateKey: typings.nodeDashForge.nodeDashForgeMod.pki.rsa.PrivateKey
  var publicKey: typings.nodeDashForge.nodeDashForgeMod.pki.rsa.PublicKey
}

object KeyPair {
  @scala.inline
  def apply(
    privateKey: typings.nodeDashForge.nodeDashForgeMod.pki.rsa.PrivateKey,
    publicKey: typings.nodeDashForge.nodeDashForgeMod.pki.rsa.PublicKey
  ): KeyPair = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeyPair]
  }
}

