package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Valid extends StObject {
  
  /**
    * Indicator if the value is in correct format pattern and in valid range.
    */
  var valid: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The submitted value.
    */
  var value: js.UndefOr[String] = js.undefined
}
object Valid {
  
  inline def apply(): Valid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Valid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Valid] (val x: Self) extends AnyVal {
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
