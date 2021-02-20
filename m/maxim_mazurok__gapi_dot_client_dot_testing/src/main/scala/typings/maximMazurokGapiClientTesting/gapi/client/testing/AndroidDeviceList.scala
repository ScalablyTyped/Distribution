package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidDeviceList extends StObject {
  
  /** Required. A list of Android devices. */
  var androidDevices: js.UndefOr[js.Array[AndroidDevice]] = js.native
}
object AndroidDeviceList {
  
  @scala.inline
  def apply(): AndroidDeviceList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidDeviceList]
  }
  
  @scala.inline
  implicit class AndroidDeviceListMutableBuilder[Self <: AndroidDeviceList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidDevices(value: js.Array[AndroidDevice]): Self = StObject.set(x, "androidDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidDevicesUndefined: Self = StObject.set(x, "androidDevices", js.undefined)
    
    @scala.inline
    def setAndroidDevicesVarargs(value: AndroidDevice*): Self = StObject.set(x, "androidDevices", js.Array(value :_*))
  }
}
