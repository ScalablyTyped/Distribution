package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCryptoEccryptopkeyMod {
  
  inline def apply(curve: String): ECCryptoPKey = ^.asInstanceOf[js.Dynamic].apply(curve.asInstanceOf[js.Any]).asInstanceOf[ECCryptoPKey]
  
  @JSImport("@nginstack/engine/lib/crypto/ECCryptoPKey", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ECCryptoPKey {
    def this(curve: String) = this()
    
    /* CompleteClass */
    var curveName: String = js.native
  }
  @JSImport("@nginstack/engine/lib/crypto/ECCryptoPKey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCurves(): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurves")().asInstanceOf[js.Array[Any]]
  
  inline def importPrivateKey(format: String, key: String, sec: Any): ECCryptoPKey = (^.asInstanceOf[js.Dynamic].applyDynamic("importPrivateKey")(format.asInstanceOf[js.Any], key.asInstanceOf[js.Any], sec.asInstanceOf[js.Any])).asInstanceOf[ECCryptoPKey]
  
  inline def importPublicKey(format: String, key: String): ECCryptoPKey = (^.asInstanceOf[js.Dynamic].applyDynamic("importPublicKey")(format.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[ECCryptoPKey]
  
  trait ECCryptoPKey extends StObject {
    
    var curveName: String
  }
  object ECCryptoPKey {
    
    inline def apply(curveName: String): ECCryptoPKey = {
      val __obj = js.Dynamic.literal(curveName = curveName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ECCryptoPKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ECCryptoPKey] (val x: Self) extends AnyVal {
      
      inline def setCurveName(value: String): Self = StObject.set(x, "curveName", value.asInstanceOf[js.Any])
    }
  }
}
