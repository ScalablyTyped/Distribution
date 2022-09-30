package typings.pkijs.mod

import typings.asn1js.mod.OctetStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateKeyInfoJson
  extends StObject
     with _BagTypeJson {
  
  var attributes: js.UndefOr[js.Array[AttributeJson]] = js.undefined
  
  var privateKey: OctetStringJson
  
  var privateKeyAlgorithm: AlgorithmIdentifierJson
  
  var version: Double
}
object PrivateKeyInfoJson {
  
  inline def apply(privateKey: OctetStringJson, privateKeyAlgorithm: AlgorithmIdentifierJson, version: Double): PrivateKeyInfoJson = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], privateKeyAlgorithm = privateKeyAlgorithm.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKeyInfoJson]
  }
  
  extension [Self <: PrivateKeyInfoJson](x: Self) {
    
    inline def setAttributes(value: js.Array[AttributeJson]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: AttributeJson*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setPrivateKey(value: OctetStringJson): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyAlgorithm(value: AlgorithmIdentifierJson): Self = StObject.set(x, "privateKeyAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
