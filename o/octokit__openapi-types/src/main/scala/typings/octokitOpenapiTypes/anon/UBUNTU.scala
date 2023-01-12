package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UBUNTU extends StObject {
  
  var MACOS: js.UndefOr[Jobruns] = js.undefined
  
  var UBUNTU: js.UndefOr[Jobruns] = js.undefined
  
  var WINDOWS: js.UndefOr[Jobruns] = js.undefined
}
object UBUNTU {
  
  inline def apply(): UBUNTU = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UBUNTU]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UBUNTU] (val x: Self) extends AnyVal {
    
    inline def setMACOS(value: Jobruns): Self = StObject.set(x, "MACOS", value.asInstanceOf[js.Any])
    
    inline def setMACOSUndefined: Self = StObject.set(x, "MACOS", js.undefined)
    
    inline def setUBUNTU(value: Jobruns): Self = StObject.set(x, "UBUNTU", value.asInstanceOf[js.Any])
    
    inline def setUBUNTUUndefined: Self = StObject.set(x, "UBUNTU", js.undefined)
    
    inline def setWINDOWS(value: Jobruns): Self = StObject.set(x, "WINDOWS", value.asInstanceOf[js.Any])
    
    inline def setWINDOWSUndefined: Self = StObject.set(x, "WINDOWS", js.undefined)
  }
}
