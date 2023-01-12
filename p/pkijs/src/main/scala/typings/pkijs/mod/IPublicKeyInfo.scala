package typings.pkijs.mod

import typings.asn1js.mod.BitString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPublicKeyInfo extends StObject {
  
  /**
    * Algorithm identifier
    */
  var algorithm: AlgorithmIdentifier
  
  /**
    * Parsed public key value
    */
  var parsedKey: js.UndefOr[ECPublicKey | RSAPublicKey] = js.undefined
  
  /**
    * Subject public key value
    */
  var subjectPublicKey: BitString
}
object IPublicKeyInfo {
  
  inline def apply(algorithm: AlgorithmIdentifier, subjectPublicKey: BitString): IPublicKeyInfo = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], subjectPublicKey = subjectPublicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPublicKeyInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPublicKeyInfo] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setParsedKey(value: ECPublicKey | RSAPublicKey): Self = StObject.set(x, "parsedKey", value.asInstanceOf[js.Any])
    
    inline def setParsedKeyUndefined: Self = StObject.set(x, "parsedKey", js.undefined)
    
    inline def setSubjectPublicKey(value: BitString): Self = StObject.set(x, "subjectPublicKey", value.asInstanceOf[js.Any])
  }
}
