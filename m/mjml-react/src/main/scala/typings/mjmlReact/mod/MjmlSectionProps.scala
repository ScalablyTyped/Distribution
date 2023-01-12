package typings.mjmlReact.mod

import typings.csstype.mod.Property.BackgroundColor
import typings.csstype.mod.Property.BackgroundPosition
import typings.csstype.mod.Property.BackgroundPositionX
import typings.csstype.mod.Property.BackgroundPositionY
import typings.csstype.mod.Property.BackgroundRepeat
import typings.csstype.mod.Property.BackgroundSize
import typings.csstype.mod.Property.TextAlign
import typings.csstype.mod.Property.VerticalAlign
import typings.mjmlReact.mjmlReactStrings.ltr
import typings.mjmlReact.mjmlReactStrings.rtl
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MjmlSectionProps extends StObject {
  
  var backgroundColor: js.UndefOr[BackgroundColor] = js.undefined
  
  var backgroundPosition: js.UndefOr[BackgroundPosition[String | Double]] = js.undefined
  
  var backgroundPositionX: js.UndefOr[BackgroundPositionX[String | Double]] = js.undefined
  
  var backgroundPositionY: js.UndefOr[BackgroundPositionY[String | Double]] = js.undefined
  
  var backgroundRepeat: js.UndefOr[BackgroundRepeat] = js.undefined
  
  var backgroundSize: js.UndefOr[BackgroundSize[String | Double]] = js.undefined
  
  var backgroundUrl: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  
  var textAlign: js.UndefOr[TextAlign] = js.undefined
  
  var verticalAlign: js.UndefOr[VerticalAlign[String | Double]] = js.undefined
}
object MjmlSectionProps {
  
  inline def apply(): MjmlSectionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlSectionProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MjmlSectionProps] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: BackgroundColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundPosition(value: BackgroundPosition[String | Double]): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
    
    inline def setBackgroundPositionUndefined: Self = StObject.set(x, "backgroundPosition", js.undefined)
    
    inline def setBackgroundPositionX(value: BackgroundPositionX[String | Double]): Self = StObject.set(x, "backgroundPositionX", value.asInstanceOf[js.Any])
    
    inline def setBackgroundPositionXUndefined: Self = StObject.set(x, "backgroundPositionX", js.undefined)
    
    inline def setBackgroundPositionY(value: BackgroundPositionY[String | Double]): Self = StObject.set(x, "backgroundPositionY", value.asInstanceOf[js.Any])
    
    inline def setBackgroundPositionYUndefined: Self = StObject.set(x, "backgroundPositionY", js.undefined)
    
    inline def setBackgroundRepeat(value: BackgroundRepeat): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
    
    inline def setBackgroundRepeatUndefined: Self = StObject.set(x, "backgroundRepeat", js.undefined)
    
    inline def setBackgroundSize(value: BackgroundSize[String | Double]): Self = StObject.set(x, "backgroundSize", value.asInstanceOf[js.Any])
    
    inline def setBackgroundSizeUndefined: Self = StObject.set(x, "backgroundSize", js.undefined)
    
    inline def setBackgroundUrl(value: String): Self = StObject.set(x, "backgroundUrl", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUrlUndefined: Self = StObject.set(x, "backgroundUrl", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    inline def setTextAlign(value: TextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setVerticalAlign(value: VerticalAlign[String | Double]): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
  }
}
