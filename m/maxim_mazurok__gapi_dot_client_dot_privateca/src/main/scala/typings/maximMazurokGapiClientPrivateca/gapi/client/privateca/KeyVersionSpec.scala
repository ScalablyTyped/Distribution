package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyVersionSpec extends StObject {
  
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
  implicit class KeyVersionSpecMutableBuilder[Self <: KeyVersionSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    @scala.inline
    def setCloudKmsKeyVersion(value: String): Self = StObject.set(x, "cloudKmsKeyVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudKmsKeyVersionUndefined: Self = StObject.set(x, "cloudKmsKeyVersion", js.undefined)
  }
}
