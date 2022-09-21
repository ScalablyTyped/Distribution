package typings.orbitUiReactComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnKeyDownUndefined extends StObject {
  
  var onKeyDown: Unit
}
object OnKeyDownUndefined {
  
  inline def apply(onKeyDown: Unit): OnKeyDownUndefined = {
    val __obj = js.Dynamic.literal(onKeyDown = onKeyDown.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnKeyDownUndefined]
  }
  
  extension [Self <: OnKeyDownUndefined](x: Self) {
    
    inline def setOnKeyDown(value: Unit): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
  }
}
