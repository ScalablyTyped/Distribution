package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UBUNTU extends StObject {
  
  var MACOS: Totalms
  
  var UBUNTU: Totalms
  
  var WINDOWS: Totalms
}
object UBUNTU {
  
  inline def apply(MACOS: Totalms, UBUNTU: Totalms, WINDOWS: Totalms): UBUNTU = {
    val __obj = js.Dynamic.literal(MACOS = MACOS.asInstanceOf[js.Any], UBUNTU = UBUNTU.asInstanceOf[js.Any], WINDOWS = WINDOWS.asInstanceOf[js.Any])
    __obj.asInstanceOf[UBUNTU]
  }
  
  extension [Self <: UBUNTU](x: Self) {
    
    inline def setMACOS(value: Totalms): Self = StObject.set(x, "MACOS", value.asInstanceOf[js.Any])
    
    inline def setUBUNTU(value: Totalms): Self = StObject.set(x, "UBUNTU", value.asInstanceOf[js.Any])
    
    inline def setWINDOWS(value: Totalms): Self = StObject.set(x, "WINDOWS", value.asInstanceOf[js.Any])
  }
}
