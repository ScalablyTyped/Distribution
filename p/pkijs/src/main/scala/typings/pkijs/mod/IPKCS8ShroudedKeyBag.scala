package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPKCS8ShroudedKeyBag extends StObject {
  
  var encryptedData: OctetString
  
  var encryptionAlgorithm: AlgorithmIdentifier
  
  var parsedValue: js.UndefOr[PrivateKeyInfo] = js.undefined
}
object IPKCS8ShroudedKeyBag {
  
  inline def apply(encryptedData: OctetString, encryptionAlgorithm: AlgorithmIdentifier): IPKCS8ShroudedKeyBag = {
    val __obj = js.Dynamic.literal(encryptedData = encryptedData.asInstanceOf[js.Any], encryptionAlgorithm = encryptionAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPKCS8ShroudedKeyBag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPKCS8ShroudedKeyBag] (val x: Self) extends AnyVal {
    
    inline def setEncryptedData(value: OctetString): Self = StObject.set(x, "encryptedData", value.asInstanceOf[js.Any])
    
    inline def setEncryptionAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "encryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setParsedValue(value: PrivateKeyInfo): Self = StObject.set(x, "parsedValue", value.asInstanceOf[js.Any])
    
    inline def setParsedValueUndefined: Self = StObject.set(x, "parsedValue", js.undefined)
  }
}
