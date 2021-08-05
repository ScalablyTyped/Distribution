package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedAppPolicyDeploymentSummary
  extends StObject
     with Entity {
  
  // Not yet documented
  var configurationDeployedUserCount: js.UndefOr[Double] = js.undefined
  
  // Not yet documented
  var configurationDeploymentSummaryPerApp: js.UndefOr[NullableOption[js.Array[ManagedAppPolicyDeploymentSummaryPerApp]]] = js.undefined
  
  // Not yet documented
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Not yet documented
  var lastRefreshTime: js.UndefOr[String] = js.undefined
  
  // Version of the entity.
  var version: js.UndefOr[NullableOption[String]] = js.undefined
}
object ManagedAppPolicyDeploymentSummary {
  
  inline def apply(): ManagedAppPolicyDeploymentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAppPolicyDeploymentSummary]
  }
  
  extension [Self <: ManagedAppPolicyDeploymentSummary](x: Self) {
    
    inline def setConfigurationDeployedUserCount(value: Double): Self = StObject.set(x, "configurationDeployedUserCount", value.asInstanceOf[js.Any])
    
    inline def setConfigurationDeployedUserCountUndefined: Self = StObject.set(x, "configurationDeployedUserCount", js.undefined)
    
    inline def setConfigurationDeploymentSummaryPerApp(value: NullableOption[js.Array[ManagedAppPolicyDeploymentSummaryPerApp]]): Self = StObject.set(x, "configurationDeploymentSummaryPerApp", value.asInstanceOf[js.Any])
    
    inline def setConfigurationDeploymentSummaryPerAppNull: Self = StObject.set(x, "configurationDeploymentSummaryPerApp", null)
    
    inline def setConfigurationDeploymentSummaryPerAppUndefined: Self = StObject.set(x, "configurationDeploymentSummaryPerApp", js.undefined)
    
    inline def setConfigurationDeploymentSummaryPerAppVarargs(value: ManagedAppPolicyDeploymentSummaryPerApp*): Self = StObject.set(x, "configurationDeploymentSummaryPerApp", js.Array(value :_*))
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLastRefreshTime(value: String): Self = StObject.set(x, "lastRefreshTime", value.asInstanceOf[js.Any])
    
    inline def setLastRefreshTimeUndefined: Self = StObject.set(x, "lastRefreshTime", js.undefined)
    
    inline def setVersion(value: NullableOption[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
