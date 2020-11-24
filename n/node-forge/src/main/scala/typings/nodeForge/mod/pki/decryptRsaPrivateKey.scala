package typings.nodeForge.mod.pki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-forge", "pki.decryptRsaPrivateKey")
@js.native
object decryptRsaPrivateKey extends js.Object {
  
  def apply(pem: PEM): typings.nodeForge.mod.pki.rsa.PrivateKey = js.native
  def apply(pem: PEM, passphrase: String): typings.nodeForge.mod.pki.rsa.PrivateKey = js.native
}
