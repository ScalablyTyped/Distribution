package typings.orbitUiReactComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnFocus extends StObject {
  
  var onBlur: Unit
  
  var onFocus: Unit
}
object OnFocus {
  
  inline def apply(onBlur: Unit, onFocus: Unit): OnFocus = {
    val __obj = js.Dynamic.literal(onBlur = onBlur.asInstanceOf[js.Any], onFocus = onFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnFocus]
  }
  
  extension [Self <: OnFocus](x: Self) {
    
    inline def setOnBlur(value: Unit): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    inline def setOnFocus(value: Unit): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
  }
}
