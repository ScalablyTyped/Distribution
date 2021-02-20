package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceConfigurationUserOverview extends Entity {
  
  // Version of the policy for that overview
  var configurationVersion: js.UndefOr[Double] = js.native
  
  // Number of error Users
  var errorCount: js.UndefOr[Double] = js.native
  
  // Number of failed Users
  var failedCount: js.UndefOr[Double] = js.native
  
  // Last update time
  var lastUpdateDateTime: js.UndefOr[String] = js.native
  
  // Number of not applicable users
  var notApplicableCount: js.UndefOr[Double] = js.native
  
  // Number of pending Users
  var pendingCount: js.UndefOr[Double] = js.native
  
  // Number of succeeded Users
  var successCount: js.UndefOr[Double] = js.native
}
object DeviceConfigurationUserOverview {
  
  @scala.inline
  def apply(): DeviceConfigurationUserOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceConfigurationUserOverview]
  }
  
  @scala.inline
  implicit class DeviceConfigurationUserOverviewMutableBuilder[Self <: DeviceConfigurationUserOverview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationVersion(value: Double): Self = StObject.set(x, "configurationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationVersionUndefined: Self = StObject.set(x, "configurationVersion", js.undefined)
    
    @scala.inline
    def setErrorCount(value: Double): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCountUndefined: Self = StObject.set(x, "errorCount", js.undefined)
    
    @scala.inline
    def setFailedCount(value: Double): Self = StObject.set(x, "failedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedCountUndefined: Self = StObject.set(x, "failedCount", js.undefined)
    
    @scala.inline
    def setLastUpdateDateTime(value: String): Self = StObject.set(x, "lastUpdateDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateDateTimeUndefined: Self = StObject.set(x, "lastUpdateDateTime", js.undefined)
    
    @scala.inline
    def setNotApplicableCount(value: Double): Self = StObject.set(x, "notApplicableCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotApplicableCountUndefined: Self = StObject.set(x, "notApplicableCount", js.undefined)
    
    @scala.inline
    def setPendingCount(value: Double): Self = StObject.set(x, "pendingCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingCountUndefined: Self = StObject.set(x, "pendingCount", js.undefined)
    
    @scala.inline
    def setSuccessCount(value: Double): Self = StObject.set(x, "successCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessCountUndefined: Self = StObject.set(x, "successCount", js.undefined)
  }
}
