package typings.openrct2.mod.global

import typings.openrct2.openrct2Strings.spinner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpinnerWidget
  extends StObject
     with WidgetBase
     with Widget {
  
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onDecrement: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onIncrement: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var `type`: spinner
}
object SpinnerWidget {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): SpinnerWidget = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("spinner")
    __obj.asInstanceOf[SpinnerWidget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpinnerWidget] (val x: Self) extends AnyVal {
    
    inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnDecrement(value: () => Unit): Self = StObject.set(x, "onDecrement", js.Any.fromFunction0(value))
    
    inline def setOnDecrementUndefined: Self = StObject.set(x, "onDecrement", js.undefined)
    
    inline def setOnIncrement(value: () => Unit): Self = StObject.set(x, "onIncrement", js.Any.fromFunction0(value))
    
    inline def setOnIncrementUndefined: Self = StObject.set(x, "onIncrement", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: spinner): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
