package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosDeviceList extends js.Object {
  
  /** Required. A list of iOS devices. */
  var iosDevices: js.UndefOr[js.Array[IosDevice]] = js.native
}
object IosDeviceList {
  
  @scala.inline
  def apply(): IosDeviceList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosDeviceList]
  }
  
  @scala.inline
  implicit class IosDeviceListOps[Self <: IosDeviceList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIosDevicesVarargs(value: IosDevice*): Self = this.set("iosDevices", js.Array(value :_*))
    
    @scala.inline
    def setIosDevices(value: js.Array[IosDevice]): Self = this.set("iosDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosDevices: Self = this.set("iosDevices", js.undefined)
  }
}
