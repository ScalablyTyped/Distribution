package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsMinimumOperatingSystem extends StObject {
  
  // Windows version 10.0 or later.
  var v10_0: js.UndefOr[Boolean] = js.undefined
  
  // Windows version 8.0 or later.
  var v8_0: js.UndefOr[Boolean] = js.undefined
  
  // Windows version 8.1 or later.
  var v8_1: js.UndefOr[Boolean] = js.undefined
}
object WindowsMinimumOperatingSystem {
  
  inline def apply(): WindowsMinimumOperatingSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsMinimumOperatingSystem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowsMinimumOperatingSystem] (val x: Self) extends AnyVal {
    
    inline def setV10_0(value: Boolean): Self = StObject.set(x, "v10_0", value.asInstanceOf[js.Any])
    
    inline def setV10_0Undefined: Self = StObject.set(x, "v10_0", js.undefined)
    
    inline def setV8_0(value: Boolean): Self = StObject.set(x, "v8_0", value.asInstanceOf[js.Any])
    
    inline def setV8_0Undefined: Self = StObject.set(x, "v8_0", js.undefined)
    
    inline def setV8_1(value: Boolean): Self = StObject.set(x, "v8_1", value.asInstanceOf[js.Any])
    
    inline def setV8_1Undefined: Self = StObject.set(x, "v8_1", js.undefined)
  }
}
