package typings.orbitUiReactComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnTransitionEnd extends StObject {
  
  var onTransitionEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object OnTransitionEnd {
  
  inline def apply(): OnTransitionEnd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnTransitionEnd]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnTransitionEnd] (val x: Self) extends AnyVal {
    
    inline def setOnTransitionEnd(value: () => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction0(value))
    
    inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
  }
}
