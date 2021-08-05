package typings.pkcs11js.Pkcs11Js

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionInfo extends StObject {
  
  var deviceError: Double
  
  var flags: Double
  
  var slotID: Buffer
  
  var state: Double
}
object SessionInfo {
  
  inline def apply(deviceError: Double, flags: Double, slotID: Buffer, state: Double): SessionInfo = {
    val __obj = js.Dynamic.literal(deviceError = deviceError.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], slotID = slotID.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionInfo]
  }
  
  extension [Self <: SessionInfo](x: Self) {
    
    inline def setDeviceError(value: Double): Self = StObject.set(x, "deviceError", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setSlotID(value: Buffer): Self = StObject.set(x, "slotID", value.asInstanceOf[js.Any])
    
    inline def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
