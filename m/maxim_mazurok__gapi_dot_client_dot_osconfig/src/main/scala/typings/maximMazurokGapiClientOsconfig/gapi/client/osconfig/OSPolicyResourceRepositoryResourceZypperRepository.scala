package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPolicyResourceRepositoryResourceZypperRepository extends StObject {
  
  /** Required. The location of the repository directory. */
  var baseUrl: js.UndefOr[String] = js.undefined
  
  /** The display name of the repository. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** URIs of GPG keys. */
  var gpgKeys: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Required. A one word, unique name for this repository. This is the `repo id` in the zypper config file and also the `display_name` if `display_name` is omitted. This id is also used
    * as the unique identifier when checking for GuestPolicy conflicts.
    */
  var id: js.UndefOr[String] = js.undefined
}
object OSPolicyResourceRepositoryResourceZypperRepository {
  
  inline def apply(): OSPolicyResourceRepositoryResourceZypperRepository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSPolicyResourceRepositoryResourceZypperRepository]
  }
  
  extension [Self <: OSPolicyResourceRepositoryResourceZypperRepository](x: Self) {
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGpgKeys(value: js.Array[String]): Self = StObject.set(x, "gpgKeys", value.asInstanceOf[js.Any])
    
    inline def setGpgKeysUndefined: Self = StObject.set(x, "gpgKeys", js.undefined)
    
    inline def setGpgKeysVarargs(value: String*): Self = StObject.set(x, "gpgKeys", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
