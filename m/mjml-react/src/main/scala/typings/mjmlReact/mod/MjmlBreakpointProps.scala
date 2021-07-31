package typings.mjmlReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MjmlBreakpointProps extends StObject {
  
  var width: js.UndefOr[String | Double] = js.undefined
}
object MjmlBreakpointProps {
  
  @scala.inline
  def apply(): MjmlBreakpointProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlBreakpointProps]
  }
  
  @scala.inline
  implicit class MjmlBreakpointPropsMutableBuilder[Self <: MjmlBreakpointProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
