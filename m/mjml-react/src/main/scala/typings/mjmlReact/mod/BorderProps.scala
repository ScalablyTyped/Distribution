package typings.mjmlReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderProps extends StObject {
  
  var border: js.UndefOr[String] = js.undefined
  
  var borderBottom: js.UndefOr[String] = js.undefined
  
  var borderLeft: js.UndefOr[String] = js.undefined
  
  var borderRadius: js.UndefOr[String | Double] = js.undefined
  
  var borderRight: js.UndefOr[String] = js.undefined
  
  var borderTop: js.UndefOr[String] = js.undefined
}
object BorderProps {
  
  inline def apply(): BorderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderProps] (val x: Self) extends AnyVal {
    
    inline def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderBottom(value: String): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
    
    inline def setBorderLeft(value: String): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
    
    inline def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
    
    inline def setBorderRadius(value: String | Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setBorderRight(value: String): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
    
    inline def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
    
    inline def setBorderTop(value: String): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
    
    inline def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
  }
}
