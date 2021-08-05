package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedDeviceMobileAppConfigurationUserSummary
  extends StObject
     with Entity {
  
  // Version of the policy for that overview
  var configurationVersion: js.UndefOr[Double] = js.undefined
  
  // Number of error Users
  var errorCount: js.UndefOr[Double] = js.undefined
  
  // Number of failed Users
  var failedCount: js.UndefOr[Double] = js.undefined
  
  // Last update time
  var lastUpdateDateTime: js.UndefOr[String] = js.undefined
  
  // Number of not applicable users
  var notApplicableCount: js.UndefOr[Double] = js.undefined
  
  // Number of pending Users
  var pendingCount: js.UndefOr[Double] = js.undefined
  
  // Number of succeeded Users
  var successCount: js.UndefOr[Double] = js.undefined
}
object ManagedDeviceMobileAppConfigurationUserSummary {
  
  inline def apply(): ManagedDeviceMobileAppConfigurationUserSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedDeviceMobileAppConfigurationUserSummary]
  }
  
  extension [Self <: ManagedDeviceMobileAppConfigurationUserSummary](x: Self) {
    
    inline def setConfigurationVersion(value: Double): Self = StObject.set(x, "configurationVersion", value.asInstanceOf[js.Any])
    
    inline def setConfigurationVersionUndefined: Self = StObject.set(x, "configurationVersion", js.undefined)
    
    inline def setErrorCount(value: Double): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
    
    inline def setErrorCountUndefined: Self = StObject.set(x, "errorCount", js.undefined)
    
    inline def setFailedCount(value: Double): Self = StObject.set(x, "failedCount", value.asInstanceOf[js.Any])
    
    inline def setFailedCountUndefined: Self = StObject.set(x, "failedCount", js.undefined)
    
    inline def setLastUpdateDateTime(value: String): Self = StObject.set(x, "lastUpdateDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateDateTimeUndefined: Self = StObject.set(x, "lastUpdateDateTime", js.undefined)
    
    inline def setNotApplicableCount(value: Double): Self = StObject.set(x, "notApplicableCount", value.asInstanceOf[js.Any])
    
    inline def setNotApplicableCountUndefined: Self = StObject.set(x, "notApplicableCount", js.undefined)
    
    inline def setPendingCount(value: Double): Self = StObject.set(x, "pendingCount", value.asInstanceOf[js.Any])
    
    inline def setPendingCountUndefined: Self = StObject.set(x, "pendingCount", js.undefined)
    
    inline def setSuccessCount(value: Double): Self = StObject.set(x, "successCount", value.asInstanceOf[js.Any])
    
    inline def setSuccessCountUndefined: Self = StObject.set(x, "successCount", js.undefined)
  }
}
