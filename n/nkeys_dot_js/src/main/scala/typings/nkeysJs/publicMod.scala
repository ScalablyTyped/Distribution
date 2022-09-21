package typings.nkeysJs

import typings.nkeysJs.nkeysMod.KeyPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publicMod {
  
  @JSImport("nkeys.js/lib/public", "PublicKey")
  @js.native
  open class PublicKey protected ()
    extends StObject
       with KeyPair {
    def this(publicKey: js.typedarray.Uint8Array) = this()
    
    /**
      * Clears the secret stored in the keypair. After clearing
      * a keypair cannot be used or recovered.
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * Returns the private key associated with the KeyPair
      * @returns Uint8Array
      * @throws NKeysError
      */
    /* CompleteClass */
    override def getPrivateKey(): js.typedarray.Uint8Array = js.native
    
    /**
      * Returns the public key associated with the KeyPair
      * @returns {string}
      * @throws NKeysError
      */
    /* CompleteClass */
    override def getPublicKey(): String = js.native
    
    /**
      * Returns the PrivateKey's seed.
      * @returns Uint8Array
      * @throws NKeysError
      */
    /* CompleteClass */
    override def getSeed(): js.typedarray.Uint8Array = js.native
    
    var publicKey: js.UndefOr[js.typedarray.Uint8Array] = js.native
    
    /**
      * Returns the digital signature of signing the input with the
      * the KeyPair's private key.
      * @param {Uint8Array} input
      * @returns Uint8Array
      * @throws NKeysError
      */
    /* CompleteClass */
    override def sign(input: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    /**
      * Returns true if the signature can be verified with the KeyPair
      * @param {Uint8Array} input
      * @param {Uint8Array} sig
      * @returns {boolean}
      * @throws NKeysError
      */
    /* CompleteClass */
    override def verify(input: js.typedarray.Uint8Array, sig: js.typedarray.Uint8Array): Boolean = js.native
  }
}
