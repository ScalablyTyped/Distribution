package typings.orbitUiReactComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnClick extends StObject {
  
  var onBlur: Unit
  
  var onClick: Unit
  
  var onFocus: Unit
  
  var onKeyDown: Unit
  
  var onKeyUp: Unit
  
  var onMouseEnter: Unit
}
object OnClick {
  
  inline def apply(onBlur: Unit, onClick: Unit, onFocus: Unit, onKeyDown: Unit, onKeyUp: Unit, onMouseEnter: Unit): OnClick = {
    val __obj = js.Dynamic.literal(onBlur = onBlur.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], onFocus = onFocus.asInstanceOf[js.Any], onKeyDown = onKeyDown.asInstanceOf[js.Any], onKeyUp = onKeyUp.asInstanceOf[js.Any], onMouseEnter = onMouseEnter.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnClick]
  }
  
  extension [Self <: OnClick](x: Self) {
    
    inline def setOnBlur(value: Unit): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: Unit): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnFocus(value: Unit): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
    
    inline def setOnKeyDown(value: Unit): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
    
    inline def setOnKeyUp(value: Unit): Self = StObject.set(x, "onKeyUp", value.asInstanceOf[js.Any])
    
    inline def setOnMouseEnter(value: Unit): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
  }
}
