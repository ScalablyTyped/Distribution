package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentBreakpoint extends StObject {
  
  var currentBreakpoint: js.UndefOr[String] = js.undefined
}
object CurrentBreakpoint {
  
  inline def apply(): CurrentBreakpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentBreakpoint]
  }
  
  extension [Self <: CurrentBreakpoint](x: Self) {
    
    inline def setCurrentBreakpoint(value: String): Self = StObject.set(x, "currentBreakpoint", value.asInstanceOf[js.Any])
    
    inline def setCurrentBreakpointUndefined: Self = StObject.set(x, "currentBreakpoint", js.undefined)
  }
}
