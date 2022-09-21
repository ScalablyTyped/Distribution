package typings.mraid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MRAIDAppOrientationState extends StObject {
  
  var locked: Boolean
  
  var orientation: MRAIDOrientation
}
object MRAIDAppOrientationState {
  
  inline def apply(locked: Boolean, orientation: MRAIDOrientation): MRAIDAppOrientationState = {
    val __obj = js.Dynamic.literal(locked = locked.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[MRAIDAppOrientationState]
  }
  
  extension [Self <: MRAIDAppOrientationState](x: Self) {
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: MRAIDOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
  }
}
