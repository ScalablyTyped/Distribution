package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserInstallStateSummary
  extends StObject
     with Entity {
  
  // The install state of the eBook.
  var deviceStates: js.UndefOr[NullableOption[js.Array[DeviceInstallState]]] = js.undefined
  
  // Failed Device Count.
  var failedDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Installed Device Count.
  var installedDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Not installed device count.
  var notInstalledDeviceCount: js.UndefOr[Double] = js.undefined
  
  // User name.
  var userName: js.UndefOr[NullableOption[String]] = js.undefined
}
object UserInstallStateSummary {
  
  @scala.inline
  def apply(): UserInstallStateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserInstallStateSummary]
  }
  
  @scala.inline
  implicit class UserInstallStateSummaryMutableBuilder[Self <: UserInstallStateSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceStates(value: NullableOption[js.Array[DeviceInstallState]]): Self = StObject.set(x, "deviceStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceStatesNull: Self = StObject.set(x, "deviceStates", null)
    
    @scala.inline
    def setDeviceStatesUndefined: Self = StObject.set(x, "deviceStates", js.undefined)
    
    @scala.inline
    def setDeviceStatesVarargs(value: DeviceInstallState*): Self = StObject.set(x, "deviceStates", js.Array(value :_*))
    
    @scala.inline
    def setFailedDeviceCount(value: Double): Self = StObject.set(x, "failedDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedDeviceCountUndefined: Self = StObject.set(x, "failedDeviceCount", js.undefined)
    
    @scala.inline
    def setInstalledDeviceCount(value: Double): Self = StObject.set(x, "installedDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalledDeviceCountUndefined: Self = StObject.set(x, "installedDeviceCount", js.undefined)
    
    @scala.inline
    def setNotInstalledDeviceCount(value: Double): Self = StObject.set(x, "notInstalledDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotInstalledDeviceCountUndefined: Self = StObject.set(x, "notInstalledDeviceCount", js.undefined)
    
    @scala.inline
    def setUserName(value: NullableOption[String]): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameNull: Self = StObject.set(x, "userName", null)
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
