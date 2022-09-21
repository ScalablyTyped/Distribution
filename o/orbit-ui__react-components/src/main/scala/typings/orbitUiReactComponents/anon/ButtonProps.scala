package typings.orbitUiReactComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonProps[Shape] extends StObject {
  
  var buttonProps: Dictx[Shape]
  
  var isChecked: Boolean
}
object ButtonProps {
  
  inline def apply[Shape](buttonProps: Dictx[Shape], isChecked: Boolean): ButtonProps[Shape] = {
    val __obj = js.Dynamic.literal(buttonProps = buttonProps.asInstanceOf[js.Any], isChecked = isChecked.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps[Shape]]
  }
  
  extension [Self <: ButtonProps[?], Shape](x: Self & ButtonProps[Shape]) {
    
    inline def setButtonProps(value: Dictx[Shape]): Self = StObject.set(x, "buttonProps", value.asInstanceOf[js.Any])
    
    inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
  }
}
