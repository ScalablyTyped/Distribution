package typings.node.cryptoMod.webcrypto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RsaHashedKeyGenParams
  extends StObject
     with RsaKeyGenParams {
  
  var hash: HashAlgorithmIdentifier
}
object RsaHashedKeyGenParams {
  
  inline def apply(
    hash: HashAlgorithmIdentifier,
    modulusLength: Double,
    name: String,
    publicExponent: js.typedarray.Uint8Array
  ): RsaHashedKeyGenParams = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], modulusLength = modulusLength.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaHashedKeyGenParams]
  }
  
  extension [Self <: RsaHashedKeyGenParams](x: Self) {
    
    inline def setHash(value: HashAlgorithmIdentifier): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
  }
}
