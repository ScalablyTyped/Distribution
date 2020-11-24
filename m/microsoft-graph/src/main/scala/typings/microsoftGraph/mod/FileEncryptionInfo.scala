package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileEncryptionInfo extends js.Object {
  
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
  implicit class FileEncryptionInfoOps[Self <: FileEncryptionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEncryptionKey(value: NullableOption[Double]): Self = this.set("encryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionKey: Self = this.set("encryptionKey", js.undefined)
    
    @scala.inline
    def setEncryptionKeyNull: Self = this.set("encryptionKey", null)
    
    @scala.inline
    def setFileDigest(value: NullableOption[Double]): Self = this.set("fileDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileDigest: Self = this.set("fileDigest", js.undefined)
    
    @scala.inline
    def setFileDigestNull: Self = this.set("fileDigest", null)
    
    @scala.inline
    def setFileDigestAlgorithm(value: NullableOption[String]): Self = this.set("fileDigestAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileDigestAlgorithm: Self = this.set("fileDigestAlgorithm", js.undefined)
    
    @scala.inline
    def setFileDigestAlgorithmNull: Self = this.set("fileDigestAlgorithm", null)
    
    @scala.inline
    def setInitializationVector(value: NullableOption[Double]): Self = this.set("initializationVector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitializationVector: Self = this.set("initializationVector", js.undefined)
    
    @scala.inline
    def setInitializationVectorNull: Self = this.set("initializationVector", null)
    
    @scala.inline
    def setMac(value: NullableOption[Double]): Self = this.set("mac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMac: Self = this.set("mac", js.undefined)
    
    @scala.inline
    def setMacNull: Self = this.set("mac", null)
    
    @scala.inline
    def setMacKey(value: NullableOption[Double]): Self = this.set("macKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMacKey: Self = this.set("macKey", js.undefined)
    
    @scala.inline
    def setMacKeyNull: Self = this.set("macKey", null)
    
    @scala.inline
    def setProfileIdentifier(value: NullableOption[String]): Self = this.set("profileIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileIdentifier: Self = this.set("profileIdentifier", js.undefined)
    
    @scala.inline
    def setProfileIdentifierNull: Self = this.set("profileIdentifier", null)
  }
}
