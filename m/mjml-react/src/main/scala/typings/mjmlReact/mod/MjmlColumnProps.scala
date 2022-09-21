package typings.mjmlReact.mod

import typings.csstype.mod.Property.BackgroundColor
import typings.csstype.mod.Property.VerticalAlign
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MjmlColumnProps extends StObject {
  
  var backgroundColor: js.UndefOr[BackgroundColor] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var innerBackgroundColor: js.UndefOr[BackgroundColor] = js.undefined
  
  var verticalAlign: js.UndefOr[VerticalAlign[String | Double]] = js.undefined
  
  var width: js.UndefOr[String | Double] = js.undefined
}
object MjmlColumnProps {
  
  inline def apply(): MjmlColumnProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlColumnProps]
  }
  
  extension [Self <: MjmlColumnProps](x: Self) {
    
    inline def setBackgroundColor(value: BackgroundColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setInnerBackgroundColor(value: BackgroundColor): Self = StObject.set(x, "innerBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setInnerBackgroundColorUndefined: Self = StObject.set(x, "innerBackgroundColor", js.undefined)
    
    inline def setVerticalAlign(value: VerticalAlign[String | Double]): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
