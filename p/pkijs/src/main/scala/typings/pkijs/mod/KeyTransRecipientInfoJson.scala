package typings.pkijs.mod

import typings.asn1js.mod.OctetStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyTransRecipientInfoJson
  extends StObject
     with RecipientInfoValueJson {
  
  var encryptedKey: OctetStringJson
  
  var keyEncryptionAlgorithm: AlgorithmIdentifierJson
  
  var rid: RecipientIdentifierMixedJson
  
  var version: Double
}
object KeyTransRecipientInfoJson {
  
  inline def apply(
    encryptedKey: OctetStringJson,
    keyEncryptionAlgorithm: AlgorithmIdentifierJson,
    rid: RecipientIdentifierMixedJson,
    version: Double
  ): KeyTransRecipientInfoJson = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], rid = rid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyTransRecipientInfoJson]
  }
  
  extension [Self <: KeyTransRecipientInfoJson](x: Self) {
    
    inline def setEncryptedKey(value: OctetStringJson): Self = StObject.set(x, "encryptedKey", value.asInstanceOf[js.Any])
    
    inline def setKeyEncryptionAlgorithm(value: AlgorithmIdentifierJson): Self = StObject.set(x, "keyEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setRid(value: RecipientIdentifierMixedJson): Self = StObject.set(x, "rid", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
