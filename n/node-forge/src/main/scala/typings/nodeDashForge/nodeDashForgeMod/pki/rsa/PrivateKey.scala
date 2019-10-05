package typings.nodeDashForge.nodeDashForgeMod.pki.rsa

import typings.nodeDashForge.nodeDashForgeMod.Bytes
import typings.nodeDashForge.nodeDashForgeMod.jsbn.BigInteger
import typings.nodeDashForge.nodeDashForgeMod.md.MessageDigest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateKey extends js.Object {
  var d: BigInteger = js.native
  var dP: BigInteger = js.native
  var dQ: BigInteger = js.native
  var e: BigInteger = js.native
  var n: BigInteger = js.native
  var p: BigInteger = js.native
  var q: BigInteger = js.native
  var qInv: BigInteger = js.native
  def decrypt(data: Bytes): Bytes = js.native
  def decrypt(data: Bytes, scheme: EncryptionScheme): Bytes = js.native
  def decrypt(data: Bytes, scheme: EncryptionScheme, schemeOptions: js.Any): Bytes = js.native
  def sign(md: MessageDigest): Bytes = js.native
  def sign(md: MessageDigest, scheme: SignatureScheme): Bytes = js.native
}

