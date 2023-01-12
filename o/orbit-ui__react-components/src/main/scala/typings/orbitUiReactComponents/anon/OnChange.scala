package typings.orbitUiReactComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnChange extends StObject {
  
  def onChange(): Unit
}
object OnChange {
  
  inline def apply(onChange: () => Unit): OnChange = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction0(onChange))
    __obj.asInstanceOf[OnChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnChange] (val x: Self) extends AnyVal {
    
    inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
  }
}
