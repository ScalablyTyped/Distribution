package typings.mjmlReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InnerBorderProps extends StObject {
  
  var innerBorder: js.UndefOr[String] = js.undefined
  
  var innerBorderBottom: js.UndefOr[String] = js.undefined
  
  var innerBorderLeft: js.UndefOr[String] = js.undefined
  
  var innerBorderRadius: js.UndefOr[String | Double] = js.undefined
  
  var innerBorderRight: js.UndefOr[String] = js.undefined
  
  var innerBorderTop: js.UndefOr[String] = js.undefined
}
object InnerBorderProps {
  
  inline def apply(): InnerBorderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InnerBorderProps]
  }
  
  extension [Self <: InnerBorderProps](x: Self) {
    
    inline def setInnerBorder(value: String): Self = StObject.set(x, "innerBorder", value.asInstanceOf[js.Any])
    
    inline def setInnerBorderBottom(value: String): Self = StObject.set(x, "innerBorderBottom", value.asInstanceOf[js.Any])
    
    inline def setInnerBorderBottomUndefined: Self = StObject.set(x, "innerBorderBottom", js.undefined)
    
    inline def setInnerBorderLeft(value: String): Self = StObject.set(x, "innerBorderLeft", value.asInstanceOf[js.Any])
    
    inline def setInnerBorderLeftUndefined: Self = StObject.set(x, "innerBorderLeft", js.undefined)
    
    inline def setInnerBorderRadius(value: String | Double): Self = StObject.set(x, "innerBorderRadius", value.asInstanceOf[js.Any])
    
    inline def setInnerBorderRadiusUndefined: Self = StObject.set(x, "innerBorderRadius", js.undefined)
    
    inline def setInnerBorderRight(value: String): Self = StObject.set(x, "innerBorderRight", value.asInstanceOf[js.Any])
    
    inline def setInnerBorderRightUndefined: Self = StObject.set(x, "innerBorderRight", js.undefined)
    
    inline def setInnerBorderTop(value: String): Self = StObject.set(x, "innerBorderTop", value.asInstanceOf[js.Any])
    
    inline def setInnerBorderTopUndefined: Self = StObject.set(x, "innerBorderTop", js.undefined)
    
    inline def setInnerBorderUndefined: Self = StObject.set(x, "innerBorder", js.undefined)
  }
}
