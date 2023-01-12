package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OldValue extends StObject {
  
  /**
    * The old value of the code editor.
    */
  var oldValue: js.UndefOr[String] = js.undefined
  
  /**
    * The current value of the code editor.
    */
  var value: js.UndefOr[String] = js.undefined
}
object OldValue {
  
  inline def apply(): OldValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OldValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OldValue] (val x: Self) extends AnyVal {
    
    inline def setOldValue(value: String): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
