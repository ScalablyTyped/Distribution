package typings.nodeForge.mod.pki.rsa

import typings.nodeForge.mod.Bytes
import typings.nodeForge.mod.jsbn.BigInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKey extends js.Object {
  
  var e: BigInteger = js.native
  
  def encrypt(data: Bytes): Bytes = js.native
  def encrypt(data: Bytes, scheme: js.UndefOr[EncryptionScheme], schemeOptions: js.Any): Bytes = js.native
  def encrypt(data: Bytes, scheme: EncryptionScheme): Bytes = js.native
  
  var n: BigInteger = js.native
  
  def verify(digest: Bytes, signature: Bytes): Boolean = js.native
  def verify(digest: Bytes, signature: Bytes, scheme: SignatureScheme): Boolean = js.native
}
