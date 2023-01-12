package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCryptoRsacryptopkeyMod {
  
  inline def apply(bits: Double): RSACryptoPKey = ^.asInstanceOf[js.Dynamic].apply(bits.asInstanceOf[js.Any]).asInstanceOf[RSACryptoPKey]
  
  @JSImport("@nginstack/engine/lib/crypto/RSACryptoPKey", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with RSACryptoPKey {
    def this(bits: Double) = this()
    
    /* CompleteClass */
    override def privateDecrypt(text: String, padding: Double): String = js.native
    
    /* CompleteClass */
    override def privateEncrypt(text: String, padding: Double): String = js.native
    
    /* CompleteClass */
    override def publicDecrypt(text: String, padding: Double): String = js.native
    
    /* CompleteClass */
    override def publicEncrypt(text: String, padding: Double): String = js.native
  }
  @JSImport("@nginstack/engine/lib/crypto/RSACryptoPKey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def importPrivateKey(format: String, key: String): RSACryptoPKey = (^.asInstanceOf[js.Dynamic].applyDynamic("importPrivateKey")(format.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[RSACryptoPKey]
  inline def importPrivateKey(format: String, key: String, opt_sec: String): RSACryptoPKey = (^.asInstanceOf[js.Dynamic].applyDynamic("importPrivateKey")(format.asInstanceOf[js.Any], key.asInstanceOf[js.Any], opt_sec.asInstanceOf[js.Any])).asInstanceOf[RSACryptoPKey]
  
  inline def importPublicKey(format: String, key: String): RSACryptoPKey = (^.asInstanceOf[js.Dynamic].applyDynamic("importPublicKey")(format.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[RSACryptoPKey]
  
  trait RSACryptoPKey extends StObject {
    
    def privateDecrypt(text: String, padding: Double): String
    
    def privateEncrypt(text: String, padding: Double): String
    
    def publicDecrypt(text: String, padding: Double): String
    
    def publicEncrypt(text: String, padding: Double): String
  }
  object RSACryptoPKey {
    
    inline def apply(
      privateDecrypt: (String, Double) => String,
      privateEncrypt: (String, Double) => String,
      publicDecrypt: (String, Double) => String,
      publicEncrypt: (String, Double) => String
    ): RSACryptoPKey = {
      val __obj = js.Dynamic.literal(privateDecrypt = js.Any.fromFunction2(privateDecrypt), privateEncrypt = js.Any.fromFunction2(privateEncrypt), publicDecrypt = js.Any.fromFunction2(publicDecrypt), publicEncrypt = js.Any.fromFunction2(publicEncrypt))
      __obj.asInstanceOf[RSACryptoPKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RSACryptoPKey] (val x: Self) extends AnyVal {
      
      inline def setPrivateDecrypt(value: (String, Double) => String): Self = StObject.set(x, "privateDecrypt", js.Any.fromFunction2(value))
      
      inline def setPrivateEncrypt(value: (String, Double) => String): Self = StObject.set(x, "privateEncrypt", js.Any.fromFunction2(value))
      
      inline def setPublicDecrypt(value: (String, Double) => String): Self = StObject.set(x, "publicDecrypt", js.Any.fromFunction2(value))
      
      inline def setPublicEncrypt(value: (String, Double) => String): Self = StObject.set(x, "publicEncrypt", js.Any.fromFunction2(value))
    }
  }
}
