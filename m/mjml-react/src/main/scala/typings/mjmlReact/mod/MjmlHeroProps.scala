package typings.mjmlReact.mod

import typings.csstype.mod.Property.BackgroundColor
import typings.csstype.mod.Property.BackgroundPosition
import typings.csstype.mod.Property.VerticalAlign
import typings.mjmlReact.mjmlReactStrings.`fixed-height`
import typings.mjmlReact.mjmlReactStrings.`fluid-height`
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MjmlHeroProps extends StObject {
  
  var backgroundColor: js.UndefOr[BackgroundColor] = js.undefined
  
  var backgroundHeight: js.UndefOr[String] = js.undefined
  
  var backgroundPosition: js.UndefOr[BackgroundPosition[String | Double]] = js.undefined
  
  var backgroundUrl: js.UndefOr[String] = js.undefined
  
  var backgroundWidth: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var height: js.UndefOr[String | Double] = js.undefined
  
  var mode: js.UndefOr[`fluid-height` | `fixed-height`] = js.undefined
  
  var verticalAlign: js.UndefOr[VerticalAlign[String | Double]] = js.undefined
  
  var width: js.UndefOr[String | Double] = js.undefined
}
object MjmlHeroProps {
  
  inline def apply(): MjmlHeroProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlHeroProps]
  }
  
  extension [Self <: MjmlHeroProps](x: Self) {
    
    inline def setBackgroundColor(value: BackgroundColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundHeight(value: String): Self = StObject.set(x, "backgroundHeight", value.asInstanceOf[js.Any])
    
    inline def setBackgroundHeightUndefined: Self = StObject.set(x, "backgroundHeight", js.undefined)
    
    inline def setBackgroundPosition(value: BackgroundPosition[String | Double]): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
    
    inline def setBackgroundPositionUndefined: Self = StObject.set(x, "backgroundPosition", js.undefined)
    
    inline def setBackgroundUrl(value: String): Self = StObject.set(x, "backgroundUrl", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUrlUndefined: Self = StObject.set(x, "backgroundUrl", js.undefined)
    
    inline def setBackgroundWidth(value: String): Self = StObject.set(x, "backgroundWidth", value.asInstanceOf[js.Any])
    
    inline def setBackgroundWidthUndefined: Self = StObject.set(x, "backgroundWidth", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMode(value: `fluid-height` | `fixed-height`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setVerticalAlign(value: VerticalAlign[String | Double]): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
