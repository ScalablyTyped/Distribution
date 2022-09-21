package typings.pkcs11js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about a slot
  */
trait SlotInfo extends StObject {
  
  /**
    * Version number of the slot's firmware
    */
  var firmwareVersion: Version
  
  /**
    * Bits flags that provide capabilities of the slot
    */
  var flags: Double
  
  /**
    * Version number of the slot's hardware
    */
  var hardwareVersion: Version
  
  /**
    * ID of the slot manufacturer.
    * Must be padded with the blank character (' ')
    */
  var manufacturerID: String
  
  /**
    * Character-string description of the slot.
    * Must be padded with the blank character (' ')
    */
  var slotDescription: String
}
object SlotInfo {
  
  inline def apply(
    firmwareVersion: Version,
    flags: Double,
    hardwareVersion: Version,
    manufacturerID: String,
    slotDescription: String
  ): SlotInfo = {
    val __obj = js.Dynamic.literal(firmwareVersion = firmwareVersion.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], hardwareVersion = hardwareVersion.asInstanceOf[js.Any], manufacturerID = manufacturerID.asInstanceOf[js.Any], slotDescription = slotDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotInfo]
  }
  
  extension [Self <: SlotInfo](x: Self) {
    
    inline def setFirmwareVersion(value: Version): Self = StObject.set(x, "firmwareVersion", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setHardwareVersion(value: Version): Self = StObject.set(x, "hardwareVersion", value.asInstanceOf[js.Any])
    
    inline def setManufacturerID(value: String): Self = StObject.set(x, "manufacturerID", value.asInstanceOf[js.Any])
    
    inline def setSlotDescription(value: String): Self = StObject.set(x, "slotDescription", value.asInstanceOf[js.Any])
  }
}
