package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosDeviceList extends StObject {
  
  /** Required. A list of iOS devices. */
  var iosDevices: js.UndefOr[js.Array[IosDevice]] = js.undefined
}
object IosDeviceList {
  
  @scala.inline
  def apply(): IosDeviceList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosDeviceList]
  }
  
  @scala.inline
  implicit class IosDeviceListMutableBuilder[Self <: IosDeviceList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIosDevices(value: js.Array[IosDevice]): Self = StObject.set(x, "iosDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosDevicesUndefined: Self = StObject.set(x, "iosDevices", js.undefined)
    
    @scala.inline
    def setIosDevicesVarargs(value: IosDevice*): Self = StObject.set(x, "iosDevices", js.Array(value :_*))
  }
}
