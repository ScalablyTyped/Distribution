package typings.pkcs11js.Pkcs11Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenInfo extends StObject {
  
  var firmwareVersion: Version
  
  var flags: Double
  
  var freePrivateMemory: Double
  
  var freePublicMemory: Double
  
  var hardwareVersion: Version
  
  var label: String
  
  var manufacturerID: String
  
  var maxPinLen: Double
  
  var maxRwSessionCount: Double
  
  var maxSessionCount: Double
  
  var minPinLen: Double
  
  var model: String
  
  var rwSessionCount: Double
  
  var serialNumber: String
  
  var sessionCount: Double
  
  var totalPrivateMemory: Double
  
  var totalPublicMemory: Double
  
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
