package typings.mjmlReact.mod

import typings.csstype.mod.BackgroundColorProperty
import typings.csstype.mod.VerticalAlignProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MjmlColumnProps extends StObject {
  
  var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.undefined
  
  var verticalAlign: js.UndefOr[VerticalAlignProperty[String | Double]] = js.undefined
  
  var width: js.UndefOr[String | Double] = js.undefined
}
object MjmlColumnProps {
  
  inline def apply(): MjmlColumnProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlColumnProps]
  }
  
  extension [Self <: MjmlColumnProps](x: Self) {
    
    inline def setBackgroundColor(value: BackgroundColorProperty): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setVerticalAlign(value: VerticalAlignProperty[String | Double]): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
