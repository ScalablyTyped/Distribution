package typings.nkeysJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHelperMod {
  
  @JSImport("nkeys.js/lib/helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEd25519Helper(): Ed25519Helper = ^.asInstanceOf[js.Dynamic].applyDynamic("getEd25519Helper")().asInstanceOf[Ed25519Helper]
  
  inline def setEd25519Helper(lib: Ed25519Helper): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEd25519Helper")(lib.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Ed25519Helper extends StObject {
    
    def fromSeed(seed: js.typedarray.Uint8Array): SignPair
    
    def randomBytes(len: Double): js.typedarray.Uint8Array
    
    def sign(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array
    
    def verify(data: js.typedarray.Uint8Array, sig: js.typedarray.Uint8Array, pub: js.typedarray.Uint8Array): Boolean
  }
  object Ed25519Helper {
    
    inline def apply(
      fromSeed: js.typedarray.Uint8Array => SignPair,
      randomBytes: Double => js.typedarray.Uint8Array,
      sign: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array,
      verify: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array) => Boolean
    ): Ed25519Helper = {
      val __obj = js.Dynamic.literal(fromSeed = js.Any.fromFunction1(fromSeed), randomBytes = js.Any.fromFunction1(randomBytes), sign = js.Any.fromFunction2(sign), verify = js.Any.fromFunction3(verify))
      __obj.asInstanceOf[Ed25519Helper]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ed25519Helper] (val x: Self) extends AnyVal {
      
      inline def setFromSeed(value: js.typedarray.Uint8Array => SignPair): Self = StObject.set(x, "fromSeed", js.Any.fromFunction1(value))
      
      inline def setRandomBytes(value: Double => js.typedarray.Uint8Array): Self = StObject.set(x, "randomBytes", js.Any.fromFunction1(value))
      
      inline def setSign(value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array): Self = StObject.set(x, "sign", js.Any.fromFunction2(value))
      
      inline def setVerify(value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array) => Boolean): Self = StObject.set(x, "verify", js.Any.fromFunction3(value))
    }
  }
  
  trait SignPair extends StObject {
    
    var publicKey: js.typedarray.Uint8Array
    
    var secretKey: js.typedarray.Uint8Array
  }
  object SignPair {
    
    inline def apply(publicKey: js.typedarray.Uint8Array, secretKey: js.typedarray.Uint8Array): SignPair = {
      val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignPair]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignPair] (val x: Self) extends AnyVal {
      
      inline def setPublicKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setSecretKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    }
  }
}
