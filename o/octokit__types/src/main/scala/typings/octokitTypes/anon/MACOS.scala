package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MACOS extends StObject {
  
  var MACOS: Jobs
  
  var UBUNTU: Jobs
  
  var WINDOWS: Jobs
}
object MACOS {
  
  inline def apply(MACOS: Jobs, UBUNTU: Jobs, WINDOWS: Jobs): MACOS = {
    val __obj = js.Dynamic.literal(MACOS = MACOS.asInstanceOf[js.Any], UBUNTU = UBUNTU.asInstanceOf[js.Any], WINDOWS = WINDOWS.asInstanceOf[js.Any])
    __obj.asInstanceOf[MACOS]
  }
  
  extension [Self <: MACOS](x: Self) {
    
    inline def setMACOS(value: Jobs): Self = StObject.set(x, "MACOS", value.asInstanceOf[js.Any])
    
    inline def setUBUNTU(value: Jobs): Self = StObject.set(x, "UBUNTU", value.asInstanceOf[js.Any])
    
    inline def setWINDOWS(value: Jobs): Self = StObject.set(x, "WINDOWS", value.asInstanceOf[js.Any])
  }
}
