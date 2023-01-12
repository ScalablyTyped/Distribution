package typings.mjmlReact.mod

import typings.csstype.mod.Property.BackgroundColor
import typings.csstype.mod.Property.BorderColor
import typings.csstype.mod.Property.BorderStyle
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MjmlDividerProps extends StObject {
  
  var borderColor: js.UndefOr[BorderColor] = js.undefined
  
  var borderStyle: js.UndefOr[BorderStyle] = js.undefined
  
  var borderWidth: js.UndefOr[String | Double] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var containerBackgroundColor: js.UndefOr[BackgroundColor] = js.undefined
  
  var width: js.UndefOr[String | Double] = js.undefined
}
object MjmlDividerProps {
  
  inline def apply(): MjmlDividerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlDividerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MjmlDividerProps] (val x: Self) extends AnyVal {
    
    inline def setBorderColor(value: BorderColor): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderStyle(value: BorderStyle): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    inline def setBorderWidth(value: String | Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setContainerBackgroundColor(value: BackgroundColor): Self = StObject.set(x, "containerBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setContainerBackgroundColorUndefined: Self = StObject.set(x, "containerBackgroundColor", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
