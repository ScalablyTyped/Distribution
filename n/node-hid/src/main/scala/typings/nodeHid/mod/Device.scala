package typings.nodeHid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Device extends js.Object {
  
  var interface: Double = js.native
  
  var manufacturer: js.UndefOr[String] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var product: js.UndefOr[String] = js.native
  
  var productId: Double = js.native
  
  var release: Double = js.native
  
  var serialNumber: js.UndefOr[String] = js.native
  
  var usage: js.UndefOr[Double] = js.native
  
  var usagePage: js.UndefOr[Double] = js.native
  
  var vendorId: Double = js.native
}
object Device {
  
  @scala.inline
  def apply(interface: Double, productId: Double, release: Double, vendorId: Double): Device = {
    val __obj = js.Dynamic.literal(interface = interface.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], vendorId = vendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
    
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
    def setInterface(value: Double): Self = this.set("interface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductId(value: Double): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease(value: Double): Self = this.set("release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorId(value: Double): Self = this.set("vendorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManufacturer: Self = this.set("manufacturer", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setProduct(value: String): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
    
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialNumber: Self = this.set("serialNumber", js.undefined)
    
    @scala.inline
    def setUsage(value: Double): Self = this.set("usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsage: Self = this.set("usage", js.undefined)
    
    @scala.inline
    def setUsagePage(value: Double): Self = this.set("usagePage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsagePage: Self = this.set("usagePage", js.undefined)
  }
}
