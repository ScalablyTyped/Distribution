package typings.pkijs.mod

import typings.asn1js.mod.OctetStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordRecipientInfoJson
  extends StObject
     with RecipientInfoValueJson {
  
  var encryptedKey: OctetStringJson
  
  var keyDerivationAlgorithm: js.UndefOr[AlgorithmIdentifierJson] = js.undefined
  
  var keyEncryptionAlgorithm: AlgorithmIdentifierJson
  
  var version: Double
}
object PasswordRecipientInfoJson {
  
  inline def apply(encryptedKey: OctetStringJson, keyEncryptionAlgorithm: AlgorithmIdentifierJson, version: Double): PasswordRecipientInfoJson = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordRecipientInfoJson]
  }
  
  extension [Self <: PasswordRecipientInfoJson](x: Self) {
    
    inline def setEncryptedKey(value: OctetStringJson): Self = StObject.set(x, "encryptedKey", value.asInstanceOf[js.Any])
    
    inline def setKeyDerivationAlgorithm(value: AlgorithmIdentifierJson): Self = StObject.set(x, "keyDerivationAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setKeyDerivationAlgorithmUndefined: Self = StObject.set(x, "keyDerivationAlgorithm", js.undefined)
    
    inline def setKeyEncryptionAlgorithm(value: AlgorithmIdentifierJson): Self = StObject.set(x, "keyEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
