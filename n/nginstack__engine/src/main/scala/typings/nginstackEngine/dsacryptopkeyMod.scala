package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dsacryptopkeyMod {
  
  inline def apply(bits: Double): DSACryptoPKey = ^.asInstanceOf[js.Dynamic].apply(bits.asInstanceOf[js.Any]).asInstanceOf[DSACryptoPKey]
  
  @JSImport("@nginstack/engine/lib/crypto/DSACryptoPKey", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DSACryptoPKey {
    def this(bits: Double) = this()
  }
  @JSImport("@nginstack/engine/lib/crypto/DSACryptoPKey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def importPrivateKey(format: String, key: String, sec: String): DSACryptoPKey = (^.asInstanceOf[js.Dynamic].applyDynamic("importPrivateKey")(format.asInstanceOf[js.Any], key.asInstanceOf[js.Any], sec.asInstanceOf[js.Any])).asInstanceOf[DSACryptoPKey]
  
  inline def importPublicKey(format: String, key: String): DSACryptoPKey = (^.asInstanceOf[js.Dynamic].applyDynamic("importPublicKey")(format.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[DSACryptoPKey]
  
  trait DSACryptoPKey extends StObject
}
