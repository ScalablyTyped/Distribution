package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyVersionSpec extends js.Object {
  
  /** Required. The algorithm to use for creating a managed Cloud KMS key for a for a simplified experience. All managed keys will be have their ProtectionLevel as `HSM`. */
  var algorithm: js.UndefOr[String] = js.native
  
  /**
    * Required. The resource name for an existing Cloud KMS CryptoKeyVersion in the format `projects/∗/locations/∗/keyRings/∗/cryptoKeys/∗/cryptoKeyVersions/ *`. This option enables full
    * flexibility in the key's capabilities and properties.
    */
  var cloudKmsKeyVersion: js.UndefOr[String] = js.native
}
object KeyVersionSpec {
  
  @scala.inline
  def apply(): KeyVersionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyVersionSpec]
  }
  
  @scala.inline
  implicit class KeyVersionSpecOps[Self <: KeyVersionSpec] (val x: Self) extends AnyVal {
    
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
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    
    @scala.inline
    def setCloudKmsKeyVersion(value: String): Self = this.set("cloudKmsKeyVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudKmsKeyVersion: Self = this.set("cloudKmsKeyVersion", js.undefined)
  }
}
