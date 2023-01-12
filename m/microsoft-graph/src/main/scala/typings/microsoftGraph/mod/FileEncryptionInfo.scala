package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileEncryptionInfo extends StObject {
  
  // The key used to encrypt the file content.
  var encryptionKey: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The file digest prior to encryption.
  var fileDigest: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The file digest algorithm.
  var fileDigestAlgorithm: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The initialization vector used for the encryption algorithm.
  var initializationVector: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The hash of the encrypted file content + IV (content hash).
  var mac: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The key used to get mac.
  var macKey: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The the profile identifier.
  var profileIdentifier: js.UndefOr[NullableOption[String]] = js.undefined
}
object FileEncryptionInfo {
  
  inline def apply(): FileEncryptionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileEncryptionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileEncryptionInfo] (val x: Self) extends AnyVal {
    
    inline def setEncryptionKey(value: NullableOption[String]): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyNull: Self = StObject.set(x, "encryptionKey", null)
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setFileDigest(value: NullableOption[String]): Self = StObject.set(x, "fileDigest", value.asInstanceOf[js.Any])
    
    inline def setFileDigestAlgorithm(value: NullableOption[String]): Self = StObject.set(x, "fileDigestAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setFileDigestAlgorithmNull: Self = StObject.set(x, "fileDigestAlgorithm", null)
    
    inline def setFileDigestAlgorithmUndefined: Self = StObject.set(x, "fileDigestAlgorithm", js.undefined)
    
    inline def setFileDigestNull: Self = StObject.set(x, "fileDigest", null)
    
    inline def setFileDigestUndefined: Self = StObject.set(x, "fileDigest", js.undefined)
    
    inline def setInitializationVector(value: NullableOption[String]): Self = StObject.set(x, "initializationVector", value.asInstanceOf[js.Any])
    
    inline def setInitializationVectorNull: Self = StObject.set(x, "initializationVector", null)
    
    inline def setInitializationVectorUndefined: Self = StObject.set(x, "initializationVector", js.undefined)
    
    inline def setMac(value: NullableOption[String]): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    
    inline def setMacKey(value: NullableOption[String]): Self = StObject.set(x, "macKey", value.asInstanceOf[js.Any])
    
    inline def setMacKeyNull: Self = StObject.set(x, "macKey", null)
    
    inline def setMacKeyUndefined: Self = StObject.set(x, "macKey", js.undefined)
    
    inline def setMacNull: Self = StObject.set(x, "mac", null)
    
    inline def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
    
    inline def setProfileIdentifier(value: NullableOption[String]): Self = StObject.set(x, "profileIdentifier", value.asInstanceOf[js.Any])
    
    inline def setProfileIdentifierNull: Self = StObject.set(x, "profileIdentifier", null)
    
    inline def setProfileIdentifierUndefined: Self = StObject.set(x, "profileIdentifier", js.undefined)
  }
}
