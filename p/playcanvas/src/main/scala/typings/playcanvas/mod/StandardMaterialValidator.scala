package typings.playcanvas.mod

import typings.playcanvas.anon.Cull
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardMaterialValidator extends StObject {
  
  def _createEnumValidator(values: Any): js.Function1[/* value */ Any, Boolean]
  
  var enumValidators: Cull
  
  var removeInvalid: Boolean
  
  def setInvalid(key: Any, data: Any): Unit
  
  var valid: Boolean
  
  def validate(data: Any): Boolean
}
object StandardMaterialValidator {
  
  inline def apply(
    _createEnumValidator: Any => js.Function1[/* value */ Any, Boolean],
    enumValidators: Cull,
    removeInvalid: Boolean,
    setInvalid: (Any, Any) => Unit,
    valid: Boolean,
    validate: Any => Boolean
  ): StandardMaterialValidator = {
    val __obj = js.Dynamic.literal(_createEnumValidator = js.Any.fromFunction1(_createEnumValidator), enumValidators = enumValidators.asInstanceOf[js.Any], removeInvalid = removeInvalid.asInstanceOf[js.Any], setInvalid = js.Any.fromFunction2(setInvalid), valid = valid.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[StandardMaterialValidator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StandardMaterialValidator] (val x: Self) extends AnyVal {
    
    inline def setEnumValidators(value: Cull): Self = StObject.set(x, "enumValidators", value.asInstanceOf[js.Any])
    
    inline def setRemoveInvalid(value: Boolean): Self = StObject.set(x, "removeInvalid", value.asInstanceOf[js.Any])
    
    inline def setSetInvalid(value: (Any, Any) => Unit): Self = StObject.set(x, "setInvalid", js.Any.fromFunction2(value))
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    inline def setValidate(value: Any => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    
    inline def set_createEnumValidator(value: Any => js.Function1[/* value */ Any, Boolean]): Self = StObject.set(x, "_createEnumValidator", js.Any.fromFunction1(value))
  }
}
