package typings.pkijs.mod

import typings.asn1js.mod.OctetStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyAgreeRecipientInfoJson
  extends StObject
     with RecipientInfoValueJson {
  
  var keyEncryptionAlgorithm: AlgorithmIdentifierJson
  
  var originator: OriginatorIdentifierOrKeyJson
  
  var recipientEncryptedKeys: RecipientEncryptedKeysJson
  
  var ukm: js.UndefOr[OctetStringJson] = js.undefined
  
  var version: Double
}
object KeyAgreeRecipientInfoJson {
  
  inline def apply(
    keyEncryptionAlgorithm: AlgorithmIdentifierJson,
    originator: OriginatorIdentifierOrKeyJson,
    recipientEncryptedKeys: RecipientEncryptedKeysJson,
    version: Double
  ): KeyAgreeRecipientInfoJson = {
    val __obj = js.Dynamic.literal(keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any], recipientEncryptedKeys = recipientEncryptedKeys.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyAgreeRecipientInfoJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyAgreeRecipientInfoJson] (val x: Self) extends AnyVal {
    
    inline def setKeyEncryptionAlgorithm(value: AlgorithmIdentifierJson): Self = StObject.set(x, "keyEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setOriginator(value: OriginatorIdentifierOrKeyJson): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    inline def setRecipientEncryptedKeys(value: RecipientEncryptedKeysJson): Self = StObject.set(x, "recipientEncryptedKeys", value.asInstanceOf[js.Any])
    
    inline def setUkm(value: OctetStringJson): Self = StObject.set(x, "ukm", value.asInstanceOf[js.Any])
    
    inline def setUkmUndefined: Self = StObject.set(x, "ukm", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
