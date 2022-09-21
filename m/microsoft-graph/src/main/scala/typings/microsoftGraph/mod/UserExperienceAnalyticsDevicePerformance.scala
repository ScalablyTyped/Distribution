package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserExperienceAnalyticsDevicePerformance
  extends StObject
     with Entity {
  
  // Average (mean) number of Blue Screens per device in the last 14 days. Valid values 0 to 9999999
  var averageBlueScreens: js.UndefOr[Double] = js.undefined
  
  // Average (mean) number of Restarts per device in the last 14 days. Valid values 0 to 9999999
  var averageRestarts: js.UndefOr[Double] = js.undefined
  
  // Number of Blue Screens in the last 14 days. Valid values 0 to 9999999
  var blueScreenCount: js.UndefOr[Double] = js.undefined
  
  // The user experience analytics device boot score.
  var bootScore: js.UndefOr[Double] = js.undefined
  
  // The user experience analytics device core boot time in milliseconds.
  var coreBootTimeInMs: js.UndefOr[Double] = js.undefined
  
  // The user experience analytics device core login time in milliseconds.
  var coreLoginTimeInMs: js.UndefOr[Double] = js.undefined
  
  // User experience analytics summarized device count.
  var deviceCount: js.UndefOr[Double] = js.undefined
  
  // The user experience analytics device name.
  var deviceName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The user experience analytics device disk type.
  var diskType: js.UndefOr[DiskType] = js.undefined
  
  // The user experience analytics device group policy boot time in milliseconds.
  var groupPolicyBootTimeInMs: js.UndefOr[Double] = js.undefined
  
  // The user experience analytics device group policy login time in milliseconds.
  var groupPolicyLoginTimeInMs: js.UndefOr[Double] = js.undefined
  
  // The health state of the user experience analytics device.
  var healthStatus: js.UndefOr[UserExperienceAnalyticsHealthState] = js.undefined
  
  // The user experience analytics device login score.
  var loginScore: js.UndefOr[Double] = js.undefined
  
  // The user experience analytics device manufacturer.
  var manufacturer: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The user experience analytics device model.
  var model: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The user experience analytics model level startup performance score. Valid values -1.79769313486232E+308 to
    * 1.79769313486232E+308
    */
  var modelStartupPerformanceScore: js.UndefOr[Double] = js.undefined
  
  // The user experience analytics device Operating System version.
  var operatingSystemVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The user experience analytics responsive desktop time in milliseconds.
  var responsiveDesktopTimeInMs: js.UndefOr[Double] = js.undefined
  
  // Number of Restarts in the last 14 days. Valid values 0 to 9999999
  var restartCount: js.UndefOr[Double] = js.undefined
  
  /**
    * The user experience analytics device startup performance score. Valid values -1.79769313486232E+308 to
    * 1.79769313486232E+308
    */
  var startupPerformanceScore: js.UndefOr[Double] = js.undefined
}
object UserExperienceAnalyticsDevicePerformance {
  
  inline def apply(): UserExperienceAnalyticsDevicePerformance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserExperienceAnalyticsDevicePerformance]
  }
  
  extension [Self <: UserExperienceAnalyticsDevicePerformance](x: Self) {
    
    inline def setAverageBlueScreens(value: Double): Self = StObject.set(x, "averageBlueScreens", value.asInstanceOf[js.Any])
    
    inline def setAverageBlueScreensUndefined: Self = StObject.set(x, "averageBlueScreens", js.undefined)
    
    inline def setAverageRestarts(value: Double): Self = StObject.set(x, "averageRestarts", value.asInstanceOf[js.Any])
    
    inline def setAverageRestartsUndefined: Self = StObject.set(x, "averageRestarts", js.undefined)
    
    inline def setBlueScreenCount(value: Double): Self = StObject.set(x, "blueScreenCount", value.asInstanceOf[js.Any])
    
    inline def setBlueScreenCountUndefined: Self = StObject.set(x, "blueScreenCount", js.undefined)
    
    inline def setBootScore(value: Double): Self = StObject.set(x, "bootScore", value.asInstanceOf[js.Any])
    
    inline def setBootScoreUndefined: Self = StObject.set(x, "bootScore", js.undefined)
    
    inline def setCoreBootTimeInMs(value: Double): Self = StObject.set(x, "coreBootTimeInMs", value.asInstanceOf[js.Any])
    
    inline def setCoreBootTimeInMsUndefined: Self = StObject.set(x, "coreBootTimeInMs", js.undefined)
    
    inline def setCoreLoginTimeInMs(value: Double): Self = StObject.set(x, "coreLoginTimeInMs", value.asInstanceOf[js.Any])
    
    inline def setCoreLoginTimeInMsUndefined: Self = StObject.set(x, "coreLoginTimeInMs", js.undefined)
    
    inline def setDeviceCount(value: Double): Self = StObject.set(x, "deviceCount", value.asInstanceOf[js.Any])
    
    inline def setDeviceCountUndefined: Self = StObject.set(x, "deviceCount", js.undefined)
    
    inline def setDeviceName(value: NullableOption[String]): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameNull: Self = StObject.set(x, "deviceName", null)
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    inline def setDiskType(value: DiskType): Self = StObject.set(x, "diskType", value.asInstanceOf[js.Any])
    
    inline def setDiskTypeUndefined: Self = StObject.set(x, "diskType", js.undefined)
    
    inline def setGroupPolicyBootTimeInMs(value: Double): Self = StObject.set(x, "groupPolicyBootTimeInMs", value.asInstanceOf[js.Any])
    
    inline def setGroupPolicyBootTimeInMsUndefined: Self = StObject.set(x, "groupPolicyBootTimeInMs", js.undefined)
    
    inline def setGroupPolicyLoginTimeInMs(value: Double): Self = StObject.set(x, "groupPolicyLoginTimeInMs", value.asInstanceOf[js.Any])
    
    inline def setGroupPolicyLoginTimeInMsUndefined: Self = StObject.set(x, "groupPolicyLoginTimeInMs", js.undefined)
    
    inline def setHealthStatus(value: UserExperienceAnalyticsHealthState): Self = StObject.set(x, "healthStatus", value.asInstanceOf[js.Any])
    
    inline def setHealthStatusUndefined: Self = StObject.set(x, "healthStatus", js.undefined)
    
    inline def setLoginScore(value: Double): Self = StObject.set(x, "loginScore", value.asInstanceOf[js.Any])
    
    inline def setLoginScoreUndefined: Self = StObject.set(x, "loginScore", js.undefined)
    
    inline def setManufacturer(value: NullableOption[String]): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerNull: Self = StObject.set(x, "manufacturer", null)
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setModel(value: NullableOption[String]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelStartupPerformanceScore(value: Double): Self = StObject.set(x, "modelStartupPerformanceScore", value.asInstanceOf[js.Any])
    
    inline def setModelStartupPerformanceScoreUndefined: Self = StObject.set(x, "modelStartupPerformanceScore", js.undefined)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setOperatingSystemVersion(value: NullableOption[String]): Self = StObject.set(x, "operatingSystemVersion", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemVersionNull: Self = StObject.set(x, "operatingSystemVersion", null)
    
    inline def setOperatingSystemVersionUndefined: Self = StObject.set(x, "operatingSystemVersion", js.undefined)
    
    inline def setResponsiveDesktopTimeInMs(value: Double): Self = StObject.set(x, "responsiveDesktopTimeInMs", value.asInstanceOf[js.Any])
    
    inline def setResponsiveDesktopTimeInMsUndefined: Self = StObject.set(x, "responsiveDesktopTimeInMs", js.undefined)
    
    inline def setRestartCount(value: Double): Self = StObject.set(x, "restartCount", value.asInstanceOf[js.Any])
    
    inline def setRestartCountUndefined: Self = StObject.set(x, "restartCount", js.undefined)
    
    inline def setStartupPerformanceScore(value: Double): Self = StObject.set(x, "startupPerformanceScore", value.asInstanceOf[js.Any])
    
    inline def setStartupPerformanceScoreUndefined: Self = StObject.set(x, "startupPerformanceScore", js.undefined)
  }
}
