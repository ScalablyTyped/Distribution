package typings.nodegit

import typings.nodegit.nodegitInts.`16`
import typings.nodegit.nodegitInts.`1`
import typings.nodegit.nodegitInts.`2`
import typings.nodegit.nodegitInts.`32`
import typings.nodegit.nodegitInts.`4`
import typings.nodegit.nodegitInts.`64`
import typings.nodegit.nodegitInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object credMod {
  
  @JSImport("nodegit/cred", "Cred")
  @js.native
  open class Cred () extends StObject {
    
    def free(): Unit = js.native
    
    def hasUsername(): Double = js.native
  }
  /* static members */
  object Cred {
    
    @JSImport("nodegit/cred", "Cred")
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultNew(): Cred = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultNew")().asInstanceOf[Cred]
    
    inline def sshKeyFromAgent(username: String): Cred = ^.asInstanceOf[js.Dynamic].applyDynamic("sshKeyFromAgent")(username.asInstanceOf[js.Any]).asInstanceOf[Cred]
    
    inline def sshKeyMemoryNew(username: String, publicKey: String, privateKey: String, passphrase: String): js.Promise[Cred] = (^.asInstanceOf[js.Dynamic].applyDynamic("sshKeyMemoryNew")(username.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Cred]]
    
    inline def sshKeyNew(username: String, publicKey: String, privateKey: String, passphrase: String): Cred = (^.asInstanceOf[js.Dynamic].applyDynamic("sshKeyNew")(username.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[Cred]
    
    inline def usernameNew(username: String): js.Promise[Cred] = ^.asInstanceOf[js.Dynamic].applyDynamic("usernameNew")(username.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cred]]
    
    inline def userpassPlaintextNew(username: String, password: String): Cred = (^.asInstanceOf[js.Dynamic].applyDynamic("userpassPlaintextNew")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Cred]
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitInts.`1`
      - typings.nodegit.nodegitInts.`2`
      - typings.nodegit.nodegitInts.`4`
      - typings.nodegit.nodegitInts.`8`
      - typings.nodegit.nodegitInts.`16`
      - typings.nodegit.nodegitInts.`32`
      - typings.nodegit.nodegitInts.`64`
    */
    trait TYPE extends StObject
    object TYPE {
      
      inline def DEFAULT: `8` = 8.asInstanceOf[`8`]
      
      inline def SSH_CUSTOM: `4` = 4.asInstanceOf[`4`]
      
      inline def SSH_INTERACTIVE: `16` = 16.asInstanceOf[`16`]
      
      inline def SSH_KEY: `2` = 2.asInstanceOf[`2`]
      
      inline def SSH_MEMORY: `64` = 64.asInstanceOf[`64`]
      
      inline def USERNAME: `32` = 32.asInstanceOf[`32`]
      
      inline def USERPASS_PLAINTEXT: `1` = 1.asInstanceOf[`1`]
    }
  }
}
