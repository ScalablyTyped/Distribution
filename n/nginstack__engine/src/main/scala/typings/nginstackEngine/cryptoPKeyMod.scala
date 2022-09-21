package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cryptoPKeyMod {
  
  inline def apply(`type`: String, bits: Double): CryptoPKey = (^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[CryptoPKey]
  
  @JSImport("@nginstack/engine/lib/crypto/CryptoPKey", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with CryptoPKey {
    def this(`type`: String, bits: Double) = this()
  }
  @JSImport("@nginstack/engine/lib/crypto/CryptoPKey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/crypto/CryptoPKey", "RSA_NO_PADDING")
  @js.native
  val RSA_NO_PADDING: Double = js.native
  
  @JSImport("@nginstack/engine/lib/crypto/CryptoPKey", "RSA_PKCS1_PADDING")
  @js.native
  val RSA_PKCS1_PADDING: Double = js.native
  
  inline def importPrivateKey(format: String, key: String, arg: String): CryptoPKey = (^.asInstanceOf[js.Dynamic].applyDynamic("importPrivateKey")(format.asInstanceOf[js.Any], key.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[CryptoPKey]
  
  inline def importPublicKey(format: String, key: String, `type`: String): CryptoPKey = (^.asInstanceOf[js.Dynamic].applyDynamic("importPublicKey")(format.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[CryptoPKey]
  
  @js.native
  trait CryptoPKey extends StObject {
    
    def exportPrivateKey(format: String, key: String, cipher: String): String = js.native
    
    def exportPublicKey(format: String): String = js.native
    
    var keyBits: Double = js.native
    
    var keyType: String = js.native
    
    def sign(text: String): String = js.native
    def sign(text: String, opt_digestName: String): String = js.native
    
    def verify(text: String, sig: String): Boolean = js.native
    def verify(text: String, sig: String, opt_digestName: String): Boolean = js.native
  }
}
