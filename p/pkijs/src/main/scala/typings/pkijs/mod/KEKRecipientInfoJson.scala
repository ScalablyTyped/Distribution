package typings.pkijs.mod

import typings.asn1js.mod.OctetStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KEKRecipientInfoJson
  extends StObject
     with RecipientInfoValueJson {
  
  var encryptedKey: OctetStringJson
  
  var kekid: KEKIdentifierJson
  
  var keyEncryptionAlgorithm: AlgorithmIdentifierJson
  
  var version: Double
}
object KEKRecipientInfoJson {
  
  inline def apply(
    encryptedKey: OctetStringJson,
    kekid: KEKIdentifierJson,
    keyEncryptionAlgorithm: AlgorithmIdentifierJson,
    version: Double
  ): KEKRecipientInfoJson = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], kekid = kekid.asInstanceOf[js.Any], keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[KEKRecipientInfoJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KEKRecipientInfoJson] (val x: Self) extends AnyVal {
    
    inline def setEncryptedKey(value: OctetStringJson): Self = StObject.set(x, "encryptedKey", value.asInstanceOf[js.Any])
    
    inline def setKekid(value: KEKIdentifierJson): Self = StObject.set(x, "kekid", value.asInstanceOf[js.Any])
    
    inline def setKeyEncryptionAlgorithm(value: AlgorithmIdentifierJson): Self = StObject.set(x, "keyEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
