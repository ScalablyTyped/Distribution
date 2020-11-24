package typings.nobleMac.mod

import typings.nobleMac.anon.Data
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Advertisement extends js.Object {
  
  var localName: String = js.native
  
  var manufacturerData: Buffer = js.native
  
  var serviceData: Data = js.native
  
  var serviceUuids: js.Array[String] = js.native
  
  var txPowerLevel: Double = js.native
}
object Advertisement {
  
  @scala.inline
  def apply(
    localName: String,
    manufacturerData: Buffer,
    serviceData: Data,
    serviceUuids: js.Array[String],
    txPowerLevel: Double
  ): Advertisement = {
    val __obj = js.Dynamic.literal(localName = localName.asInstanceOf[js.Any], manufacturerData = manufacturerData.asInstanceOf[js.Any], serviceData = serviceData.asInstanceOf[js.Any], serviceUuids = serviceUuids.asInstanceOf[js.Any], txPowerLevel = txPowerLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Advertisement]
  }
  
  @scala.inline
  implicit class AdvertisementOps[Self <: Advertisement] (val x: Self) extends AnyVal {
    
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
    def setLocalName(value: String): Self = this.set("localName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerData(value: Buffer): Self = this.set("manufacturerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceData(value: Data): Self = this.set("serviceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUuidsVarargs(value: String*): Self = this.set("serviceUuids", js.Array(value :_*))
    
    @scala.inline
    def setServiceUuids(value: js.Array[String]): Self = this.set("serviceUuids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxPowerLevel(value: Double): Self = this.set("txPowerLevel", value.asInstanceOf[js.Any])
  }
}
