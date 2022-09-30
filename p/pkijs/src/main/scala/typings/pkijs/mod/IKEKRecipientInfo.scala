package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKEKRecipientInfo extends StObject {
  
  var encryptedKey: OctetString
  
  var kekid: KEKIdentifier
  
  var keyEncryptionAlgorithm: AlgorithmIdentifier
  
  var preDefinedKEK: js.typedarray.ArrayBuffer
  
  var version: Double
}
object IKEKRecipientInfo {
  
  inline def apply(
    encryptedKey: OctetString,
    kekid: KEKIdentifier,
    keyEncryptionAlgorithm: AlgorithmIdentifier,
    preDefinedKEK: js.typedarray.ArrayBuffer,
    version: Double
  ): IKEKRecipientInfo = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], kekid = kekid.asInstanceOf[js.Any], keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], preDefinedKEK = preDefinedKEK.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKEKRecipientInfo]
  }
  
  extension [Self <: IKEKRecipientInfo](x: Self) {
    
    inline def setEncryptedKey(value: OctetString): Self = StObject.set(x, "encryptedKey", value.asInstanceOf[js.Any])
    
    inline def setKekid(value: KEKIdentifier): Self = StObject.set(x, "kekid", value.asInstanceOf[js.Any])
    
    inline def setKeyEncryptionAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "keyEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setPreDefinedKEK(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "preDefinedKEK", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
