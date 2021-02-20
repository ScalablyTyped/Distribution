package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileEncryptionInfo extends StObject {
  
  // The key used to encrypt the file content.
  var encryptionKey: js.UndefOr[NullableOption[Double]] = js.native
  
  // The file digest prior to encryption.
  var fileDigest: js.UndefOr[NullableOption[Double]] = js.native
  
  // The file digest algorithm.
  var fileDigestAlgorithm: js.UndefOr[NullableOption[String]] = js.native
  
  // The initialization vector used for the encryption algorithm.
  var initializationVector: js.UndefOr[NullableOption[Double]] = js.native
  
  // The hash of the encrypted file content + IV (content hash).
  var mac: js.UndefOr[NullableOption[Double]] = js.native
  
  // The key used to get mac.
  var macKey: js.UndefOr[NullableOption[Double]] = js.native
  
  // The profile identifier.
  var profileIdentifier: js.UndefOr[NullableOption[String]] = js.native
}
object FileEncryptionInfo {
  
  @scala.inline
  def apply(): FileEncryptionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileEncryptionInfo]
  }
  
  @scala.inline
  implicit class FileEncryptionInfoMutableBuilder[Self <: FileEncryptionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionKey(value: NullableOption[Double]): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionKeyNull: Self = StObject.set(x, "encryptionKey", null)
    
    @scala.inline
    def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    @scala.inline
    def setFileDigest(value: NullableOption[Double]): Self = StObject.set(x, "fileDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileDigestAlgorithm(value: NullableOption[String]): Self = StObject.set(x, "fileDigestAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileDigestAlgorithmNull: Self = StObject.set(x, "fileDigestAlgorithm", null)
    
    @scala.inline
    def setFileDigestAlgorithmUndefined: Self = StObject.set(x, "fileDigestAlgorithm", js.undefined)
    
    @scala.inline
    def setFileDigestNull: Self = StObject.set(x, "fileDigest", null)
    
    @scala.inline
    def setFileDigestUndefined: Self = StObject.set(x, "fileDigest", js.undefined)
    
    @scala.inline
    def setInitializationVector(value: NullableOption[Double]): Self = StObject.set(x, "initializationVector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitializationVectorNull: Self = StObject.set(x, "initializationVector", null)
    
    @scala.inline
    def setInitializationVectorUndefined: Self = StObject.set(x, "initializationVector", js.undefined)
    
    @scala.inline
    def setMac(value: NullableOption[Double]): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacKey(value: NullableOption[Double]): Self = StObject.set(x, "macKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacKeyNull: Self = StObject.set(x, "macKey", null)
    
    @scala.inline
    def setMacKeyUndefined: Self = StObject.set(x, "macKey", js.undefined)
    
    @scala.inline
    def setMacNull: Self = StObject.set(x, "mac", null)
    
    @scala.inline
    def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
    
    @scala.inline
    def setProfileIdentifier(value: NullableOption[String]): Self = StObject.set(x, "profileIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileIdentifierNull: Self = StObject.set(x, "profileIdentifier", null)
    
    @scala.inline
    def setProfileIdentifierUndefined: Self = StObject.set(x, "profileIdentifier", js.undefined)
  }
}
