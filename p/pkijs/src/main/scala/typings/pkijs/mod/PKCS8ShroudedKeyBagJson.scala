package typings.pkijs.mod

import typings.asn1js.mod.OctetStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PKCS8ShroudedKeyBagJson
  extends StObject
     with _BagTypeJson {
  
  var encryptedData: OctetStringJson
  
  var encryptionAlgorithm: AlgorithmIdentifierJson
}
object PKCS8ShroudedKeyBagJson {
  
  inline def apply(encryptedData: OctetStringJson, encryptionAlgorithm: AlgorithmIdentifierJson): PKCS8ShroudedKeyBagJson = {
    val __obj = js.Dynamic.literal(encryptedData = encryptedData.asInstanceOf[js.Any], encryptionAlgorithm = encryptionAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[PKCS8ShroudedKeyBagJson]
  }
  
  extension [Self <: PKCS8ShroudedKeyBagJson](x: Self) {
    
    inline def setEncryptedData(value: OctetStringJson): Self = StObject.set(x, "encryptedData", value.asInstanceOf[js.Any])
    
    inline def setEncryptionAlgorithm(value: AlgorithmIdentifierJson): Self = StObject.set(x, "encryptionAlgorithm", value.asInstanceOf[js.Any])
  }
}
