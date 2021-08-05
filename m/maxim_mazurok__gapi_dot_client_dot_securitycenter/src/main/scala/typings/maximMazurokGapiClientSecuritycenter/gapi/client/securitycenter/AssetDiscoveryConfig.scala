package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetDiscoveryConfig extends StObject {
  
  /** The mode to use for filtering asset discovery. */
  var inclusionMode: js.UndefOr[String] = js.undefined
  
  /** The project ids to use for filtering asset discovery. */
  var projectIds: js.UndefOr[js.Array[String]] = js.undefined
}
object AssetDiscoveryConfig {
  
  inline def apply(): AssetDiscoveryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetDiscoveryConfig]
  }
  
  extension [Self <: AssetDiscoveryConfig](x: Self) {
    
    inline def setInclusionMode(value: String): Self = StObject.set(x, "inclusionMode", value.asInstanceOf[js.Any])
    
    inline def setInclusionModeUndefined: Self = StObject.set(x, "inclusionMode", js.undefined)
    
    inline def setProjectIds(value: js.Array[String]): Self = StObject.set(x, "projectIds", value.asInstanceOf[js.Any])
    
    inline def setProjectIdsUndefined: Self = StObject.set(x, "projectIds", js.undefined)
    
    inline def setProjectIdsVarargs(value: String*): Self = StObject.set(x, "projectIds", js.Array(value :_*))
  }
}
