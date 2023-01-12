package typings.mjmlReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingProps extends StObject {
  
  var padding: js.UndefOr[String | Double] = js.undefined
  
  var paddingBottom: js.UndefOr[String | Double] = js.undefined
  
  var paddingLeft: js.UndefOr[String | Double] = js.undefined
  
  var paddingRight: js.UndefOr[String | Double] = js.undefined
  
  var paddingTop: js.UndefOr[String | Double] = js.undefined
}
object PaddingProps {
  
  inline def apply(): PaddingProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaddingProps] (val x: Self) extends AnyVal {
    
    inline def setPadding(value: String | Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingBottom(value: String | Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
    
    inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
    
    inline def setPaddingLeft(value: String | Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
    
    inline def setPaddingRight(value: String | Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
    
    inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
    
    inline def setPaddingTop(value: String | Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
    
    inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
