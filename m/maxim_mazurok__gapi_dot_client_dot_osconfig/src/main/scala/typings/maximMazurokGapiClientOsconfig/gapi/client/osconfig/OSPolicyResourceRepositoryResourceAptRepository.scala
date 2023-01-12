package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPolicyResourceRepositoryResourceAptRepository extends StObject {
  
  /** Required. Type of archive files in this repository. */
  var archiveType: js.UndefOr[String] = js.undefined
  
  /** Required. List of components for this repository. Must contain at least one item. */
  var components: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. Distribution of this repository. */
  var distribution: js.UndefOr[String] = js.undefined
  
  /** URI of the key file for this repository. The agent maintains a keyring at `/etc/apt/trusted.gpg.d/osconfig_agent_managed.gpg`. */
  var gpgKey: js.UndefOr[String] = js.undefined
  
  /** Required. URI for this repository. */
  var uri: js.UndefOr[String] = js.undefined
}
object OSPolicyResourceRepositoryResourceAptRepository {
  
  inline def apply(): OSPolicyResourceRepositoryResourceAptRepository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSPolicyResourceRepositoryResourceAptRepository]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OSPolicyResourceRepositoryResourceAptRepository] (val x: Self) extends AnyVal {
    
    inline def setArchiveType(value: String): Self = StObject.set(x, "archiveType", value.asInstanceOf[js.Any])
    
    inline def setArchiveTypeUndefined: Self = StObject.set(x, "archiveType", js.undefined)
    
    inline def setComponents(value: js.Array[String]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setComponentsVarargs(value: String*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setDistribution(value: String): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
    
    inline def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
    
    inline def setGpgKey(value: String): Self = StObject.set(x, "gpgKey", value.asInstanceOf[js.Any])
    
    inline def setGpgKeyUndefined: Self = StObject.set(x, "gpgKey", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
