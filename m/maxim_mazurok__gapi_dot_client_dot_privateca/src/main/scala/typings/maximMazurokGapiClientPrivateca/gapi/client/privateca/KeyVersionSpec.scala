package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyVersionSpec extends StObject {
  
  /** Required. The algorithm to use for creating a managed Cloud KMS key for a for a simplified experience. All managed keys will be have their ProtectionLevel as `HSM`. */
  var algorithm: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The resource name for an existing Cloud KMS CryptoKeyVersion in the format `projects/∗/locations/∗/keyRings/∗/cryptoKeys/∗/cryptoKeyVersions/ *`. This option enables full
    * flexibility in the key's capabilities and properties.
    */
  var cloudKmsKeyVersion: js.UndefOr[String] = js.undefined
}
object KeyVersionSpec {
  
  inline def apply(): KeyVersionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyVersionSpec]
  }
  
  extension [Self <: KeyVersionSpec](x: Self) {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setCloudKmsKeyVersion(value: String): Self = StObject.set(x, "cloudKmsKeyVersion", value.asInstanceOf[js.Any])
    
    inline def setCloudKmsKeyVersionUndefined: Self = StObject.set(x, "cloudKmsKeyVersion", js.undefined)
  }
}
