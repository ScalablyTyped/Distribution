package typings.nodegit

import typings.nodegit.nodegitNumbers.`16`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`32`
import typings.nodegit.nodegitNumbers.`4`
import typings.nodegit.nodegitNumbers.`64`
import typings.nodegit.nodegitNumbers.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object credMod {
  
  @JSImport("nodegit/cred", "Cred")
  @js.native
  class Cred () extends StObject {
    
    def free(): Unit = js.native
    
    def hasUsername(): Double = js.native
  }
  /* static members */
  object Cred {
    
    @JSImport("nodegit/cred", "Cred")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def defaultNew(): Cred = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultNew")().asInstanceOf[Cred]
    
    @scala.inline
    def sshKeyFromAgent(username: String): Cred = ^.asInstanceOf[js.Dynamic].applyDynamic("sshKeyFromAgent")(username.asInstanceOf[js.Any]).asInstanceOf[Cred]
    
    @scala.inline
    def sshKeyMemoryNew(username: String, publicKey: String, privateKey: String, passphrase: String): js.Promise[Cred] = (^.asInstanceOf[js.Dynamic].applyDynamic("sshKeyMemoryNew")(username.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Cred]]
    
    @scala.inline
    def sshKeyNew(username: String, publicKey: String, privateKey: String, passphrase: String): Cred = (^.asInstanceOf[js.Dynamic].applyDynamic("sshKeyNew")(username.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[Cred]
    
    @scala.inline
    def usernameNew(username: String): js.Promise[Cred] = ^.asInstanceOf[js.Dynamic].applyDynamic("usernameNew")(username.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cred]]
    
    @scala.inline
    def userpassPlaintextNew(username: String, password: String): Cred = (^.asInstanceOf[js.Dynamic].applyDynamic("userpassPlaintextNew")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Cred]
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`4`
      - typings.nodegit.nodegitNumbers.`8`
      - typings.nodegit.nodegitNumbers.`16`
      - typings.nodegit.nodegitNumbers.`32`
      - typings.nodegit.nodegitNumbers.`64`
    */
    trait TYPE extends StObject
    object TYPE {
      
      @scala.inline
      def DEFAULT: `8` = 8.asInstanceOf[`8`]
      
      @scala.inline
      def SSH_CUSTOM: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def SSH_INTERACTIVE: `16` = 16.asInstanceOf[`16`]
      
      @scala.inline
      def SSH_KEY: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def SSH_MEMORY: `64` = 64.asInstanceOf[`64`]
      
      @scala.inline
      def USERNAME: `32` = 32.asInstanceOf[`32`]
      
      @scala.inline
      def USERPASS_PLAINTEXT: `1` = 1.asInstanceOf[`1`]
    }
  }
}
