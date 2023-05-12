package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Credential")
@js.native
open class Credential ()
  extends typings.nodegit.credentialMod.Credential
/* static members */
object Credential {
  
  @JSImport("nodegit", "Credential")
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultNew(): typings.nodegit.credentialMod.Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultNew")().asInstanceOf[typings.nodegit.credentialMod.Credential]
  
  inline def sshKeyFromAgent(username: String): typings.nodegit.credentialMod.Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("sshKeyFromAgent")(username.asInstanceOf[js.Any]).asInstanceOf[typings.nodegit.credentialMod.Credential]
  
  inline def sshKeyMemoryNew(username: String, publicKey: String, privateKey: String, passphrase: String): js.Promise[typings.nodegit.credentialMod.Credential] = (^.asInstanceOf[js.Dynamic].applyDynamic("sshKeyMemoryNew")(username.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.credentialMod.Credential]]
  
  inline def sshKeyNew(username: String, publicKey: String, privateKey: String, passphrase: String): typings.nodegit.credentialMod.Credential = (^.asInstanceOf[js.Dynamic].applyDynamic("sshKeyNew")(username.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[typings.nodegit.credentialMod.Credential]
  
  inline def usernameNew(username: String): js.Promise[typings.nodegit.credentialMod.Credential] = ^.asInstanceOf[js.Dynamic].applyDynamic("usernameNew")(username.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nodegit.credentialMod.Credential]]
  
  inline def userpassPlaintextNew(username: String, password: String): typings.nodegit.credentialMod.Credential = (^.asInstanceOf[js.Dynamic].applyDynamic("userpassPlaintextNew")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.nodegit.credentialMod.Credential]
}
