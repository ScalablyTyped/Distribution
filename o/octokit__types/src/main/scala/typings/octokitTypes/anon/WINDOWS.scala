package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WINDOWS extends StObject {
  
  /**
    * Total minutes used on macOS runner machines.
    */
  var MACOS: Double
  
  /**
    * Total minutes used on Ubuntu runner machines.
    */
  var UBUNTU: Double
  
  /**
    * Total minutes used on Windows runner machines.
    */
  var WINDOWS: Double
}
object WINDOWS {
  
  @scala.inline
  def apply(MACOS: Double, UBUNTU: Double, WINDOWS: Double): WINDOWS = {
    val __obj = js.Dynamic.literal(MACOS = MACOS.asInstanceOf[js.Any], UBUNTU = UBUNTU.asInstanceOf[js.Any], WINDOWS = WINDOWS.asInstanceOf[js.Any])
    __obj.asInstanceOf[WINDOWS]
  }
  
  @scala.inline
  implicit class WINDOWSMutableBuilder[Self <: WINDOWS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMACOS(value: Double): Self = StObject.set(x, "MACOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUBUNTU(value: Double): Self = StObject.set(x, "UBUNTU", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWINDOWS(value: Double): Self = StObject.set(x, "WINDOWS", value.asInstanceOf[js.Any])
  }
}
