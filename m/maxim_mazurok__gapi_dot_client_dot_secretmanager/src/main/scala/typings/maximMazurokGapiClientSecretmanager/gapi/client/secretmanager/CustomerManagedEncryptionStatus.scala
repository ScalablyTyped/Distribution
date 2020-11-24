package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomerManagedEncryptionStatus extends js.Object {
  
  /**
    * Required. The resource name of the Cloud KMS CryptoKeyVersion used to encrypt the secret payload, in the following format:
    * `projects/∗/locations/∗/keyRings/∗/cryptoKeys/∗/versions/ *`.
    */
  var kmsKeyVersionName: js.UndefOr[String] = js.native
}
object CustomerManagedEncryptionStatus {
  
  @scala.inline
  def apply(): CustomerManagedEncryptionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerManagedEncryptionStatus]
  }
  
  @scala.inline
  implicit class CustomerManagedEncryptionStatusOps[Self <: CustomerManagedEncryptionStatus] (val x: Self) extends AnyVal {
    
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
    def setKmsKeyVersionName(value: String): Self = this.set("kmsKeyVersionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyVersionName: Self = this.set("kmsKeyVersionName", js.undefined)
  }
}
