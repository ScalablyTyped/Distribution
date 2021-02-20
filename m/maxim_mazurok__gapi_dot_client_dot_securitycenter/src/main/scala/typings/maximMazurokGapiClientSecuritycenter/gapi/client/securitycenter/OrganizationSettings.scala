package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationSettings extends StObject {
  
  /** The configuration used for Asset Discovery runs. */
  var assetDiscoveryConfig: js.UndefOr[AssetDiscoveryConfig] = js.native
  
  /**
    * A flag that indicates if Asset Discovery should be enabled. If the flag is set to `true`, then discovery of assets will occur. If it is set to `false, all historical assets will
    * remain, but discovery of future assets will not occur.
    */
  var enableAssetDiscovery: js.UndefOr[Boolean] = js.native
  
  /**
    * The relative resource name of the settings. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example:
    * "organizations/{organization_id}/organizationSettings".
    */
  var name: js.UndefOr[String] = js.native
}
object OrganizationSettings {
  
  @scala.inline
  def apply(): OrganizationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationSettings]
  }
  
  @scala.inline
  implicit class OrganizationSettingsMutableBuilder[Self <: OrganizationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetDiscoveryConfig(value: AssetDiscoveryConfig): Self = StObject.set(x, "assetDiscoveryConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetDiscoveryConfigUndefined: Self = StObject.set(x, "assetDiscoveryConfig", js.undefined)
    
    @scala.inline
    def setEnableAssetDiscovery(value: Boolean): Self = StObject.set(x, "enableAssetDiscovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAssetDiscoveryUndefined: Self = StObject.set(x, "enableAssetDiscovery", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
