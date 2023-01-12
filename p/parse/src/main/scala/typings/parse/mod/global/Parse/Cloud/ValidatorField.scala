package typings.parse.mod.global.Parse.Cloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidatorField extends StObject {
  
  var default: js.UndefOr[Any] = js.undefined
  
  var constant: js.UndefOr[Boolean] = js.undefined
  
  var error: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[js.Array[Any] | js.Function] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[Any] = js.undefined
}
object ValidatorField {
  
  inline def apply(): ValidatorField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidatorField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidatorField] (val x: Self) extends AnyVal {
    
    inline def setConstant(value: Boolean): Self = StObject.set(x, "constant", value.asInstanceOf[js.Any])
    
    inline def setConstantUndefined: Self = StObject.set(x, "constant", js.undefined)
    
    inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setOptions(value: js.Array[Any] | js.Function): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: Any*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
