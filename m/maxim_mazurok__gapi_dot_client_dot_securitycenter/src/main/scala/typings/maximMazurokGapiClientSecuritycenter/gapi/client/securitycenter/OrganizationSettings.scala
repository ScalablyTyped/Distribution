package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationSettings extends StObject {
  
  /** The configuration used for Asset Discovery runs. */
  var assetDiscoveryConfig: js.UndefOr[AssetDiscoveryConfig] = js.undefined
  
  /**
    * A flag that indicates if Asset Discovery should be enabled. If the flag is set to `true`, then discovery of assets will occur. If it is set to `false, all historical assets will
    * remain, but discovery of future assets will not occur.
    */
  var enableAssetDiscovery: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The relative resource name of the settings. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example:
    * "organizations/{organization_id}/organizationSettings".
    */
  var name: js.UndefOr[String] = js.undefined
}
object OrganizationSettings {
  
  inline def apply(): OrganizationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationSettings]
  }
  
  extension [Self <: OrganizationSettings](x: Self) {
    
    inline def setAssetDiscoveryConfig(value: AssetDiscoveryConfig): Self = StObject.set(x, "assetDiscoveryConfig", value.asInstanceOf[js.Any])
    
    inline def setAssetDiscoveryConfigUndefined: Self = StObject.set(x, "assetDiscoveryConfig", js.undefined)
    
    inline def setEnableAssetDiscovery(value: Boolean): Self = StObject.set(x, "enableAssetDiscovery", value.asInstanceOf[js.Any])
    
    inline def setEnableAssetDiscoveryUndefined: Self = StObject.set(x, "enableAssetDiscovery", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
