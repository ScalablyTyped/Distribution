package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKeyTransRecipientInfo extends StObject {
  
  var encryptedKey: OctetString
  
  var keyEncryptionAlgorithm: AlgorithmIdentifier
  
  var recipientCertificate: Certificate
  
  var rid: RecipientIdentifierType
  
  var version: Double
}
object IKeyTransRecipientInfo {
  
  inline def apply(
    encryptedKey: OctetString,
    keyEncryptionAlgorithm: AlgorithmIdentifier,
    recipientCertificate: Certificate,
    rid: RecipientIdentifierType,
    version: Double
  ): IKeyTransRecipientInfo = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], recipientCertificate = recipientCertificate.asInstanceOf[js.Any], rid = rid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyTransRecipientInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IKeyTransRecipientInfo] (val x: Self) extends AnyVal {
    
    inline def setEncryptedKey(value: OctetString): Self = StObject.set(x, "encryptedKey", value.asInstanceOf[js.Any])
    
    inline def setKeyEncryptionAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "keyEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setRecipientCertificate(value: Certificate): Self = StObject.set(x, "recipientCertificate", value.asInstanceOf[js.Any])
    
    inline def setRid(value: RecipientIdentifierType): Self = StObject.set(x, "rid", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
