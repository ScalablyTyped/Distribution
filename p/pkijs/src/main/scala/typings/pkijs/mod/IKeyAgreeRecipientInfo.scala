package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import typings.std.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKeyAgreeRecipientInfo extends StObject {
  
  var keyEncryptionAlgorithm: AlgorithmIdentifier
  
  var originator: OriginatorIdentifierOrKey
  
  var recipientCertificate: Certificate
  
  var recipientEncryptedKeys: RecipientEncryptedKeys
  
  var recipientPublicKey: CryptoKey | Null
  
  var ukm: js.UndefOr[OctetString] = js.undefined
  
  var version: Double
}
object IKeyAgreeRecipientInfo {
  
  inline def apply(
    keyEncryptionAlgorithm: AlgorithmIdentifier,
    originator: OriginatorIdentifierOrKey,
    recipientCertificate: Certificate,
    recipientEncryptedKeys: RecipientEncryptedKeys,
    version: Double
  ): IKeyAgreeRecipientInfo = {
    val __obj = js.Dynamic.literal(keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any], recipientCertificate = recipientCertificate.asInstanceOf[js.Any], recipientEncryptedKeys = recipientEncryptedKeys.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], recipientPublicKey = null)
    __obj.asInstanceOf[IKeyAgreeRecipientInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IKeyAgreeRecipientInfo] (val x: Self) extends AnyVal {
    
    inline def setKeyEncryptionAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "keyEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setOriginator(value: OriginatorIdentifierOrKey): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    inline def setRecipientCertificate(value: Certificate): Self = StObject.set(x, "recipientCertificate", value.asInstanceOf[js.Any])
    
    inline def setRecipientEncryptedKeys(value: RecipientEncryptedKeys): Self = StObject.set(x, "recipientEncryptedKeys", value.asInstanceOf[js.Any])
    
    inline def setRecipientPublicKey(value: CryptoKey): Self = StObject.set(x, "recipientPublicKey", value.asInstanceOf[js.Any])
    
    inline def setRecipientPublicKeyNull: Self = StObject.set(x, "recipientPublicKey", null)
    
    inline def setUkm(value: OctetString): Self = StObject.set(x, "ukm", value.asInstanceOf[js.Any])
    
    inline def setUkmUndefined: Self = StObject.set(x, "ukm", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
