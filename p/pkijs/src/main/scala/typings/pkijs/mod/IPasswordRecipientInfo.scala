package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPasswordRecipientInfo extends StObject {
  
  var encryptedKey: OctetString
  
  var keyDerivationAlgorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var keyEncryptionAlgorithm: AlgorithmIdentifier
  
  var password: js.typedarray.ArrayBuffer
  
  var version: Double
}
object IPasswordRecipientInfo {
  
  inline def apply(
    encryptedKey: OctetString,
    keyEncryptionAlgorithm: AlgorithmIdentifier,
    password: js.typedarray.ArrayBuffer,
    version: Double
  ): IPasswordRecipientInfo = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPasswordRecipientInfo]
  }
  
  extension [Self <: IPasswordRecipientInfo](x: Self) {
    
    inline def setEncryptedKey(value: OctetString): Self = StObject.set(x, "encryptedKey", value.asInstanceOf[js.Any])
    
    inline def setKeyDerivationAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "keyDerivationAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setKeyDerivationAlgorithmUndefined: Self = StObject.set(x, "keyDerivationAlgorithm", js.undefined)
    
    inline def setKeyEncryptionAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "keyEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
