package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WINDOWS extends StObject {
  
  var MACOS: js.UndefOr[Totalms] = js.undefined
  
  var UBUNTU: js.UndefOr[Totalms] = js.undefined
  
  var WINDOWS: js.UndefOr[Totalms] = js.undefined
}
object WINDOWS {
  
  inline def apply(): WINDOWS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WINDOWS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WINDOWS] (val x: Self) extends AnyVal {
    
    inline def setMACOS(value: Totalms): Self = StObject.set(x, "MACOS", value.asInstanceOf[js.Any])
    
    inline def setMACOSUndefined: Self = StObject.set(x, "MACOS", js.undefined)
    
    inline def setUBUNTU(value: Totalms): Self = StObject.set(x, "UBUNTU", value.asInstanceOf[js.Any])
    
    inline def setUBUNTUUndefined: Self = StObject.set(x, "UBUNTU", js.undefined)
    
    inline def setWINDOWS(value: Totalms): Self = StObject.set(x, "WINDOWS", value.asInstanceOf[js.Any])
    
    inline def setWINDOWSUndefined: Self = StObject.set(x, "WINDOWS", js.undefined)
  }
}
