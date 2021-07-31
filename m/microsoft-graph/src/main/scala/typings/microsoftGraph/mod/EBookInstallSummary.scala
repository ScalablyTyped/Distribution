package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EBookInstallSummary
  extends StObject
     with Entity {
  
  // Number of Devices that have failed to install this book.
  var failedDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Number of Users that have 1 or more device that failed to install this book.
  var failedUserCount: js.UndefOr[Double] = js.undefined
  
  // Number of Devices that have successfully installed this book.
  var installedDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Number of Users whose devices have all succeeded to install this book.
  var installedUserCount: js.UndefOr[Double] = js.undefined
  
  // Number of Devices that does not have this book installed.
  var notInstalledDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Number of Users that did not install this book.
  var notInstalledUserCount: js.UndefOr[Double] = js.undefined
}
object EBookInstallSummary {
  
  @scala.inline
  def apply(): EBookInstallSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EBookInstallSummary]
  }
  
  @scala.inline
  implicit class EBookInstallSummaryMutableBuilder[Self <: EBookInstallSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedDeviceCount(value: Double): Self = StObject.set(x, "failedDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedDeviceCountUndefined: Self = StObject.set(x, "failedDeviceCount", js.undefined)
    
    @scala.inline
    def setFailedUserCount(value: Double): Self = StObject.set(x, "failedUserCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedUserCountUndefined: Self = StObject.set(x, "failedUserCount", js.undefined)
    
    @scala.inline
    def setInstalledDeviceCount(value: Double): Self = StObject.set(x, "installedDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalledDeviceCountUndefined: Self = StObject.set(x, "installedDeviceCount", js.undefined)
    
    @scala.inline
    def setInstalledUserCount(value: Double): Self = StObject.set(x, "installedUserCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalledUserCountUndefined: Self = StObject.set(x, "installedUserCount", js.undefined)
    
    @scala.inline
    def setNotInstalledDeviceCount(value: Double): Self = StObject.set(x, "notInstalledDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotInstalledDeviceCountUndefined: Self = StObject.set(x, "notInstalledDeviceCount", js.undefined)
    
    @scala.inline
    def setNotInstalledUserCount(value: Double): Self = StObject.set(x, "notInstalledUserCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotInstalledUserCountUndefined: Self = StObject.set(x, "notInstalledUserCount", js.undefined)
  }
}
