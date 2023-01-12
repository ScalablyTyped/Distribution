package typings.oidcProvider.anon

import typings.node.bufferMod.global.Buffer
import typings.node.cryptoMod.KeyObject
import typings.oidcProvider.mod.EncryptionAlgValues
import typings.oidcProvider.mod.EncryptionEncValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enc extends StObject {
  
  var alg: EncryptionAlgValues
  
  var enc: EncryptionEncValues
  
  var key: KeyObject | Buffer
  
  var kid: js.UndefOr[String] = js.undefined
}
object Enc {
  
  inline def apply(alg: EncryptionAlgValues, enc: EncryptionEncValues, key: KeyObject | Buffer): Enc = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], enc = enc.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Enc] (val x: Self) extends AnyVal {
    
    inline def setAlg(value: EncryptionAlgValues): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    inline def setEnc(value: EncryptionEncValues): Self = StObject.set(x, "enc", value.asInstanceOf[js.Any])
    
    inline def setKey(value: KeyObject | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
    
    inline def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
  }
}
