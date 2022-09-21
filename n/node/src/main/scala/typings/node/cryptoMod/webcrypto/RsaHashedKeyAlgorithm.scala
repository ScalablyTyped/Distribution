package typings.node.cryptoMod.webcrypto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RsaHashedKeyAlgorithm
  extends StObject
     with RsaKeyAlgorithm {
  
  var hash: KeyAlgorithm
}
object RsaHashedKeyAlgorithm {
  
  inline def apply(hash: KeyAlgorithm, modulusLength: Double, name: String, publicExponent: js.typedarray.Uint8Array): RsaHashedKeyAlgorithm = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], modulusLength = modulusLength.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaHashedKeyAlgorithm]
  }
  
  extension [Self <: RsaHashedKeyAlgorithm](x: Self) {
    
    inline def setHash(value: KeyAlgorithm): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
  }
}
