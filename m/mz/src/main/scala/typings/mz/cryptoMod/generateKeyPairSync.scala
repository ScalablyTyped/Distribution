package typings.mz.cryptoMod

import typings.mz.mzStrings.der
import typings.mz.mzStrings.dsa
import typings.mz.mzStrings.ec
import typings.mz.mzStrings.ed25519
import typings.mz.mzStrings.pem
import typings.mz.mzStrings.rsa
import typings.node.cryptoMod.DSAKeyPairOptions
import typings.node.cryptoMod.ECKeyPairOptions
import typings.node.cryptoMod.ED25519KeyPairOptions
import typings.node.cryptoMod.KeyPairSyncResult
import typings.node.cryptoMod.RSAKeyPairOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/crypto", "generateKeyPairSync")
@js.native
object generateKeyPairSync extends js.Object {
  def apply(`type`: dsa, options: DSAKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
  def apply(`type`: ec, options: ECKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
  def apply(`type`: ed25519, options: ED25519KeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
  def apply(`type`: rsa, options: RSAKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
}

