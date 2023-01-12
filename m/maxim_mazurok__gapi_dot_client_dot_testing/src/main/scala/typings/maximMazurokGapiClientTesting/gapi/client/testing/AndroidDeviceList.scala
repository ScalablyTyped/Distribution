package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidDeviceList extends StObject {
  
  /** Required. A list of Android devices. */
  var androidDevices: js.UndefOr[js.Array[AndroidDevice]] = js.undefined
}
object AndroidDeviceList {
  
  inline def apply(): AndroidDeviceList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidDeviceList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AndroidDeviceList] (val x: Self) extends AnyVal {
    
    inline def setAndroidDevices(value: js.Array[AndroidDevice]): Self = StObject.set(x, "androidDevices", value.asInstanceOf[js.Any])
    
    inline def setAndroidDevicesUndefined: Self = StObject.set(x, "androidDevices", js.undefined)
    
    inline def setAndroidDevicesVarargs(value: AndroidDevice*): Self = StObject.set(x, "androidDevices", js.Array(value*))
  }
}
