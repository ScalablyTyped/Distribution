package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedDeviceOverview
  extends StObject
     with Entity {
  
  // Distribution of Exchange Access State in Intune
  var deviceExchangeAccessStateSummary: js.UndefOr[NullableOption[DeviceExchangeAccessStateSummary]] = js.undefined
  
  // Device operating system summary.
  var deviceOperatingSystemSummary: js.UndefOr[NullableOption[DeviceOperatingSystemSummary]] = js.undefined
  
  // The number of devices enrolled in both MDM and EAS
  var dualEnrolledDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Total enrolled device count. Does not include PC devices managed via Intune PC Agent
  var enrolledDeviceCount: js.UndefOr[Double] = js.undefined
  
  // The number of devices enrolled in MDM
  var mdmEnrolledCount: js.UndefOr[Double] = js.undefined
}
object ManagedDeviceOverview {
  
  @scala.inline
  def apply(): ManagedDeviceOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedDeviceOverview]
  }
  
  @scala.inline
  implicit class ManagedDeviceOverviewMutableBuilder[Self <: ManagedDeviceOverview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceExchangeAccessStateSummary(value: NullableOption[DeviceExchangeAccessStateSummary]): Self = StObject.set(x, "deviceExchangeAccessStateSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceExchangeAccessStateSummaryNull: Self = StObject.set(x, "deviceExchangeAccessStateSummary", null)
    
    @scala.inline
    def setDeviceExchangeAccessStateSummaryUndefined: Self = StObject.set(x, "deviceExchangeAccessStateSummary", js.undefined)
    
    @scala.inline
    def setDeviceOperatingSystemSummary(value: NullableOption[DeviceOperatingSystemSummary]): Self = StObject.set(x, "deviceOperatingSystemSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceOperatingSystemSummaryNull: Self = StObject.set(x, "deviceOperatingSystemSummary", null)
    
    @scala.inline
    def setDeviceOperatingSystemSummaryUndefined: Self = StObject.set(x, "deviceOperatingSystemSummary", js.undefined)
    
    @scala.inline
    def setDualEnrolledDeviceCount(value: Double): Self = StObject.set(x, "dualEnrolledDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDualEnrolledDeviceCountUndefined: Self = StObject.set(x, "dualEnrolledDeviceCount", js.undefined)
    
    @scala.inline
    def setEnrolledDeviceCount(value: Double): Self = StObject.set(x, "enrolledDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnrolledDeviceCountUndefined: Self = StObject.set(x, "enrolledDeviceCount", js.undefined)
    
    @scala.inline
    def setMdmEnrolledCount(value: Double): Self = StObject.set(x, "mdmEnrolledCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMdmEnrolledCountUndefined: Self = StObject.set(x, "mdmEnrolledCount", js.undefined)
  }
}
