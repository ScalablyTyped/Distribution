package typings.pkcs11js.Pkcs11Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlotInfo extends js.Object {
  
  var firmwareVersion: Version = js.native
  
  var flags: Double = js.native
  
  var hardwareVersion: Version = js.native
  
  var manufacturerID: String = js.native
  
  var slotDescription: String = js.native
}
object SlotInfo {
  
  @scala.inline
  def apply(
    firmwareVersion: Version,
    flags: Double,
    hardwareVersion: Version,
    manufacturerID: String,
    slotDescription: String
  ): SlotInfo = {
    val __obj = js.Dynamic.literal(firmwareVersion = firmwareVersion.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], hardwareVersion = hardwareVersion.asInstanceOf[js.Any], manufacturerID = manufacturerID.asInstanceOf[js.Any], slotDescription = slotDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotInfo]
  }
  
  @scala.inline
  implicit class SlotInfoOps[Self <: SlotInfo] (val x: Self) extends AnyVal {
    
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
    def setFirmwareVersion(value: Version): Self = this.set("firmwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHardwareVersion(value: Version): Self = this.set("hardwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerID(value: String): Self = this.set("manufacturerID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotDescription(value: String): Self = this.set("slotDescription", value.asInstanceOf[js.Any])
  }
}
