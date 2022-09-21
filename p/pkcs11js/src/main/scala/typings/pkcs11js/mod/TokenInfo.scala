package typings.pkcs11js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about a token
  */
trait TokenInfo extends StObject {
  
  /**
    * Version number of firmware
    */
  var firmwareVersion: Version
  
  /**
    * Bit flags indicating capabilities and status of the device
    */
  var flags: Double
  
  /**
    * The amount of free (unused) memory on the token in bytes for private objects
    */
  var freePrivateMemory: Double
  
  /**
    * The amount of free (unused) memory on the token in bytes for public objects
    */
  var freePublicMemory: Double
  
  /**
    * version number of hardware
    */
  var hardwareVersion: Version
  
  /**
    * Application-defined label, assigned during token initialization.
    * Must be padded with the blank character (' ')
    */
  var label: String
  
  /**
    * ID of the device manufacturer. 
    * Must be padded with the blank character (' ')
    */
  var manufacturerID: String
  
  /**
    * Maximum length in bytes of the PIN
    */
  var maxPinLen: Double
  
  /**
    * Maximum number of read/write sessions that can be opened with the token at one time by a single application
    */
  var maxRwSessionCount: Double
  
  /**
    * Maximum number of sessions that can be opened with the token at one time by a single application
    */
  var maxSessionCount: Double
  
  /**
    * Minimum length in bytes of the PIN
    */
  var minPinLen: Double
  
  /**
    * Model of the device. 
    * Must be padded with the blank character (' ')
    */
  var model: String
  
  /**
    * Number of read/write sessions that this application currently has open with the token
    */
  var rwSessionCount: Double
  
  /**
    * Character-string serial number of the device. 
    * Must be padded with the blank character (' ')
    */
  var serialNumber: String
  
  /**
    * Number of sessions that this application currently has open with the token
    */
  var sessionCount: Double
  
  /**
    * The total amount of memory on the token in bytes in which private objects may be stored
    */
  var totalPrivateMemory: Double
  
  /**
    * The total amount of memory on the token in bytes in which public objects may be stored
    */
  var totalPublicMemory: Double
  
  /**
    * Current time as a character-string of length 16, represented in the format YYYYMMDDhhmmssxx 
    * (4 characters for the year; 2 characters each for the month, the day, the hour, the minute, 
    * and the second; and 2 additional reserved '0' characters). 
    * The value of this field only makes sense for tokens equipped with a clock, 
    * as indicated in the token information flags
    */
  var utcTime: String
}
object TokenInfo {
  
  inline def apply(
    firmwareVersion: Version,
    flags: Double,
    freePrivateMemory: Double,
    freePublicMemory: Double,
    hardwareVersion: Version,
    label: String,
    manufacturerID: String,
    maxPinLen: Double,
    maxRwSessionCount: Double,
    maxSessionCount: Double,
    minPinLen: Double,
    model: String,
    rwSessionCount: Double,
    serialNumber: String,
    sessionCount: Double,
    totalPrivateMemory: Double,
    totalPublicMemory: Double,
    utcTime: String
  ): TokenInfo = {
    val __obj = js.Dynamic.literal(firmwareVersion = firmwareVersion.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], freePrivateMemory = freePrivateMemory.asInstanceOf[js.Any], freePublicMemory = freePublicMemory.asInstanceOf[js.Any], hardwareVersion = hardwareVersion.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], manufacturerID = manufacturerID.asInstanceOf[js.Any], maxPinLen = maxPinLen.asInstanceOf[js.Any], maxRwSessionCount = maxRwSessionCount.asInstanceOf[js.Any], maxSessionCount = maxSessionCount.asInstanceOf[js.Any], minPinLen = minPinLen.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], rwSessionCount = rwSessionCount.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], sessionCount = sessionCount.asInstanceOf[js.Any], totalPrivateMemory = totalPrivateMemory.asInstanceOf[js.Any], totalPublicMemory = totalPublicMemory.asInstanceOf[js.Any], utcTime = utcTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenInfo]
  }
  
  extension [Self <: TokenInfo](x: Self) {
    
    inline def setFirmwareVersion(value: Version): Self = StObject.set(x, "firmwareVersion", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFreePrivateMemory(value: Double): Self = StObject.set(x, "freePrivateMemory", value.asInstanceOf[js.Any])
    
    inline def setFreePublicMemory(value: Double): Self = StObject.set(x, "freePublicMemory", value.asInstanceOf[js.Any])
    
    inline def setHardwareVersion(value: Version): Self = StObject.set(x, "hardwareVersion", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setManufacturerID(value: String): Self = StObject.set(x, "manufacturerID", value.asInstanceOf[js.Any])
    
    inline def setMaxPinLen(value: Double): Self = StObject.set(x, "maxPinLen", value.asInstanceOf[js.Any])
    
    inline def setMaxRwSessionCount(value: Double): Self = StObject.set(x, "maxRwSessionCount", value.asInstanceOf[js.Any])
    
    inline def setMaxSessionCount(value: Double): Self = StObject.set(x, "maxSessionCount", value.asInstanceOf[js.Any])
    
    inline def setMinPinLen(value: Double): Self = StObject.set(x, "minPinLen", value.asInstanceOf[js.Any])
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setRwSessionCount(value: Double): Self = StObject.set(x, "rwSessionCount", value.asInstanceOf[js.Any])
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSessionCount(value: Double): Self = StObject.set(x, "sessionCount", value.asInstanceOf[js.Any])
    
    inline def setTotalPrivateMemory(value: Double): Self = StObject.set(x, "totalPrivateMemory", value.asInstanceOf[js.Any])
    
    inline def setTotalPublicMemory(value: Double): Self = StObject.set(x, "totalPublicMemory", value.asInstanceOf[js.Any])
    
    inline def setUtcTime(value: String): Self = StObject.set(x, "utcTime", value.asInstanceOf[js.Any])
  }
}
