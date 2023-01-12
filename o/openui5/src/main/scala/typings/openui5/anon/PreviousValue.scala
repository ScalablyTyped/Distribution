package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviousValue extends StObject {
  
  /**
    * The previous value of the input, before the last user interaction.
    */
  var previousValue: js.UndefOr[String] = js.undefined
  
  /**
    * The current value of the input, after a live change event.
    */
  var value: js.UndefOr[String] = js.undefined
}
object PreviousValue {
  
  inline def apply(): PreviousValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviousValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreviousValue] (val x: Self) extends AnyVal {
    
    inline def setPreviousValue(value: String): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
    
    inline def setPreviousValueUndefined: Self = StObject.set(x, "previousValue", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
