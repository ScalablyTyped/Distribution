package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidValue extends StObject {
  
  /**
    * Whether the new value is valid.
    */
  var valid: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The current value of the control.
    */
  var value: js.UndefOr[js.Object] = js.undefined
}
object ValidValue {
  
  inline def apply(): ValidValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidValue] (val x: Self) extends AnyVal {
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    
    inline def setValue(value: js.Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
