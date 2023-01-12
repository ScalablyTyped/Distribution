package typings.orbitUiReactComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBlurOnFocus extends StObject {
  
  var onBlur: Unit
  
  var onFocus: Unit
}
object OnBlurOnFocus {
  
  inline def apply(onBlur: Unit, onFocus: Unit): OnBlurOnFocus = {
    val __obj = js.Dynamic.literal(onBlur = onBlur.asInstanceOf[js.Any], onFocus = onFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBlurOnFocus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnBlurOnFocus] (val x: Self) extends AnyVal {
    
    inline def setOnBlur(value: Unit): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    inline def setOnFocus(value: Unit): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
  }
}
