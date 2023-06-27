package typings.openui5.anon

import typings.openui5.sapUiModelContextMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingContext extends StObject {
  
  /**
    * `BindingContext` of the checked field. Inside a table the `ValueHelp` element might be connected to a
    * different row.
    */
  var bindingContext: js.UndefOr[default] = js.undefined
  
  /**
    * If set, the value help checks only if there is an item with the given description. This is set to `false`
    * if only the key is used in the field.
    */
  var checkDescription: Boolean
  
  /**
    * If set, the value help checks only if there is an item with the given key. This is set to `false` if
    * the value cannot be a valid key because of type validation.
    */
  var checkKey: Boolean
  
  /**
    * Contextual information provided by condition payload or inParameters/outParameters. This is only filled
    * if the description needs to be determined for an existing condition.
    */
  var context: js.UndefOr[InParameter] = js.undefined
  
  /**
    * Instance of the calling control
    */
  var control: typings.openui5.sapUiCoreControlMod.default
  
  /**
    * Value parsed by type to fit the data type of the key
    */
  var parsedValue: js.UndefOr[Any] = js.undefined
  
  /**
    * Value as entered by user
    */
  var value: Any
}
object BindingContext {
  
  inline def apply(
    checkDescription: Boolean,
    checkKey: Boolean,
    control: typings.openui5.sapUiCoreControlMod.default,
    value: Any
  ): BindingContext = {
    val __obj = js.Dynamic.literal(checkDescription = checkDescription.asInstanceOf[js.Any], checkKey = checkKey.asInstanceOf[js.Any], control = control.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BindingContext] (val x: Self) extends AnyVal {
    
    inline def setBindingContext(value: default): Self = StObject.set(x, "bindingContext", value.asInstanceOf[js.Any])
    
    inline def setBindingContextUndefined: Self = StObject.set(x, "bindingContext", js.undefined)
    
    inline def setCheckDescription(value: Boolean): Self = StObject.set(x, "checkDescription", value.asInstanceOf[js.Any])
    
    inline def setCheckKey(value: Boolean): Self = StObject.set(x, "checkKey", value.asInstanceOf[js.Any])
    
    inline def setContext(value: InParameter): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setControl(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setParsedValue(value: Any): Self = StObject.set(x, "parsedValue", value.asInstanceOf[js.Any])
    
    inline def setParsedValueUndefined: Self = StObject.set(x, "parsedValue", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
