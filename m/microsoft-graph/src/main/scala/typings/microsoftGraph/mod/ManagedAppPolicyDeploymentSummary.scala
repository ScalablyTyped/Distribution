package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedAppPolicyDeploymentSummary extends Entity {
  
  // Not yet documented
  var configurationDeployedUserCount: js.UndefOr[Double] = js.native
  
  // Not yet documented
  var configurationDeploymentSummaryPerApp: js.UndefOr[NullableOption[js.Array[ManagedAppPolicyDeploymentSummaryPerApp]]] = js.native
  
  // Not yet documented
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Not yet documented
  var lastRefreshTime: js.UndefOr[String] = js.native
  
  // Version of the entity.
  var version: js.UndefOr[NullableOption[String]] = js.native
}
object ManagedAppPolicyDeploymentSummary {
  
  @scala.inline
  def apply(): ManagedAppPolicyDeploymentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAppPolicyDeploymentSummary]
  }
  
  @scala.inline
  implicit class ManagedAppPolicyDeploymentSummaryMutableBuilder[Self <: ManagedAppPolicyDeploymentSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationDeployedUserCount(value: Double): Self = StObject.set(x, "configurationDeployedUserCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationDeployedUserCountUndefined: Self = StObject.set(x, "configurationDeployedUserCount", js.undefined)
    
    @scala.inline
    def setConfigurationDeploymentSummaryPerApp(value: NullableOption[js.Array[ManagedAppPolicyDeploymentSummaryPerApp]]): Self = StObject.set(x, "configurationDeploymentSummaryPerApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationDeploymentSummaryPerAppNull: Self = StObject.set(x, "configurationDeploymentSummaryPerApp", null)
    
    @scala.inline
    def setConfigurationDeploymentSummaryPerAppUndefined: Self = StObject.set(x, "configurationDeploymentSummaryPerApp", js.undefined)
    
    @scala.inline
    def setConfigurationDeploymentSummaryPerAppVarargs(value: ManagedAppPolicyDeploymentSummaryPerApp*): Self = StObject.set(x, "configurationDeploymentSummaryPerApp", js.Array(value :_*))
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setLastRefreshTime(value: String): Self = StObject.set(x, "lastRefreshTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRefreshTimeUndefined: Self = StObject.set(x, "lastRefreshTime", js.undefined)
    
    @scala.inline
    def setVersion(value: NullableOption[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNull: Self = StObject.set(x, "version", null)
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
