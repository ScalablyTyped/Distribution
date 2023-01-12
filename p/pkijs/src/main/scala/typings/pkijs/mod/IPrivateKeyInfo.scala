package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPrivateKeyInfo extends StObject {
  
  var attributes: js.UndefOr[js.Array[Attribute]] = js.undefined
  
  var parsedKey: js.UndefOr[RSAPrivateKey | ECPrivateKey] = js.undefined
  
  var privateKey: OctetString
  
  var privateKeyAlgorithm: AlgorithmIdentifier
  
  var version: Double
}
object IPrivateKeyInfo {
  
  inline def apply(privateKey: OctetString, privateKeyAlgorithm: AlgorithmIdentifier, version: Double): IPrivateKeyInfo = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], privateKeyAlgorithm = privateKeyAlgorithm.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrivateKeyInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPrivateKeyInfo] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setParsedKey(value: RSAPrivateKey | ECPrivateKey): Self = StObject.set(x, "parsedKey", value.asInstanceOf[js.Any])
    
    inline def setParsedKeyUndefined: Self = StObject.set(x, "parsedKey", js.undefined)
    
    inline def setPrivateKey(value: OctetString): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "privateKeyAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
