package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetDiscoveryConfig extends StObject {
  
  /** The mode to use for filtering asset discovery. */
  var inclusionMode: js.UndefOr[String] = js.native
  
  /** The project ids to use for filtering asset discovery. */
  var projectIds: js.UndefOr[js.Array[String]] = js.native
}
object AssetDiscoveryConfig {
  
  @scala.inline
  def apply(): AssetDiscoveryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetDiscoveryConfig]
  }
  
  @scala.inline
  implicit class AssetDiscoveryConfigMutableBuilder[Self <: AssetDiscoveryConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInclusionMode(value: String): Self = StObject.set(x, "inclusionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclusionModeUndefined: Self = StObject.set(x, "inclusionMode", js.undefined)
    
    @scala.inline
    def setProjectIds(value: js.Array[String]): Self = StObject.set(x, "projectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdsUndefined: Self = StObject.set(x, "projectIds", js.undefined)
    
    @scala.inline
    def setProjectIdsVarargs(value: String*): Self = StObject.set(x, "projectIds", js.Array(value :_*))
  }
}
