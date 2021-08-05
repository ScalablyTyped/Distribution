package typings.mjmlReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MjmlBreakpointProps extends StObject {
  
  var width: js.UndefOr[String | Double] = js.undefined
}
object MjmlBreakpointProps {
  
  inline def apply(): MjmlBreakpointProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlBreakpointProps]
  }
  
  extension [Self <: MjmlBreakpointProps](x: Self) {
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
