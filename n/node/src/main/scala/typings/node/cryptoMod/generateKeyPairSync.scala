package typings.node.cryptoMod

import typings.node.nodeStrings.der
import typings.node.nodeStrings.dsa
import typings.node.nodeStrings.ec
import typings.node.nodeStrings.pem
import typings.node.nodeStrings.rsa
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "generateKeyPairSync")
@js.native
object generateKeyPairSync extends js.Object {
  def apply(`type`: dsa, options: DSAKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
  def apply(`type`: ec, options: ECKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
  def apply(`type`: rsa, options: RSAKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
}

