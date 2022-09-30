package typings.pkijs.mod

import typings.asn1js.mod.BitString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOriginatorPublicKey extends StObject {
  
  var algorithm: AlgorithmIdentifier
  
  var publicKey: BitString
}
object IOriginatorPublicKey {
  
  inline def apply(algorithm: AlgorithmIdentifier, publicKey: BitString): IOriginatorPublicKey = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOriginatorPublicKey]
  }
  
  extension [Self <: IOriginatorPublicKey](x: Self) {
    
    inline def setAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setPublicKey(value: BitString): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
