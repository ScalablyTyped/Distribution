package typings.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WidgetTypedInputTypeDefinition extends StObject {
  
  /** Set to false if there is no value associated with the type. */
  var hasValue: js.UndefOr[Boolean] = js.undefined
  
  /** An icon to display in the type menu */
  var icon: js.UndefOr[String] = js.undefined
  
  /** A label to display in the type menu */
  var label: js.UndefOr[String] = js.undefined
  
  /** If the type has a fixed set of values, this is an array of string options for the value. For example, ["true","false"] for the boolean type. */
  var options: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A function to validate the value for the type. */
  var validate: js.UndefOr[(js.Function1[/* v */ String, Boolean]) | js.RegExp] = js.undefined
  
  /** The identifier for the type */
  var value: String
}
object WidgetTypedInputTypeDefinition {
  
  inline def apply(value: String): WidgetTypedInputTypeDefinition = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetTypedInputTypeDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WidgetTypedInputTypeDefinition] (val x: Self) extends AnyVal {
    
    inline def setHasValue(value: Boolean): Self = StObject.set(x, "hasValue", value.asInstanceOf[js.Any])
    
    inline def setHasValueUndefined: Self = StObject.set(x, "hasValue", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setValidate(value: (js.Function1[/* v */ String, Boolean]) | js.RegExp): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateFunction1(value: /* v */ String => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
