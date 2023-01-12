package typings.openrct2.mod.global

import typings.openrct2.openrct2Strings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonWidget
  extends StObject
     with WidgetBase
     with Widget {
  
  /**
    * Whether the button has a 3D border.
    * By default, text buttons have borders and image buttons do not but it can be overridden.
    */
  var border: js.UndefOr[Boolean] = js.undefined
  
  var image: js.UndefOr[Double] = js.undefined
  
  var isPressed: js.UndefOr[Boolean] = js.undefined
  
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var `type`: button
}
object ButtonWidget {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): ButtonWidget = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("button")
    __obj.asInstanceOf[ButtonWidget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonWidget] (val x: Self) extends AnyVal {
    
    inline def setBorder(value: Boolean): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setImage(value: Double): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setIsPressed(value: Boolean): Self = StObject.set(x, "isPressed", value.asInstanceOf[js.Any])
    
    inline def setIsPressedUndefined: Self = StObject.set(x, "isPressed", js.undefined)
    
    inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
