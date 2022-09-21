package typings.mjmlReact.mod

import typings.csstype.mod.Property.BackgroundColor
import typings.csstype.mod.Property.VerticalAlign
import typings.mjmlReact.mjmlReactStrings.ltr
import typings.mjmlReact.mjmlReactStrings.rtl
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MjmlGroupProps extends StObject {
  
  var backgroundColor: js.UndefOr[BackgroundColor] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  
  var verticalAlign: js.UndefOr[VerticalAlign[String | Double]] = js.undefined
  
  var width: js.UndefOr[String | Double] = js.undefined
}
object MjmlGroupProps {
  
  inline def apply(): MjmlGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlGroupProps]
  }
  
  extension [Self <: MjmlGroupProps](x: Self) {
    
    inline def setBackgroundColor(value: BackgroundColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setVerticalAlign(value: VerticalAlign[String | Double]): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
