package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveValue extends StObject {
  
  /**
    * Current value of the Textfield.
    */
  var liveValue: js.UndefOr[String] = js.undefined
}
object LiveValue {
  
  inline def apply(): LiveValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LiveValue] (val x: Self) extends AnyVal {
    
    inline def setLiveValue(value: String): Self = StObject.set(x, "liveValue", value.asInstanceOf[js.Any])
    
    inline def setLiveValueUndefined: Self = StObject.set(x, "liveValue", js.undefined)
  }
}
