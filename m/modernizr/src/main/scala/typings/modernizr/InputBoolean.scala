package typings.modernizr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputBoolean extends StObject {
  
  var autocomplete: Boolean = js.native
  
  var autofocus: Boolean = js.native
  
  var list: Boolean = js.native
  
  var max: Boolean = js.native
  
  var min: Boolean = js.native
  
  var multiple: Boolean = js.native
  
  var pattern: Boolean = js.native
  
  var placeholder: Boolean = js.native
  
  var required: Boolean = js.native
  
  var step: Boolean = js.native
}
object InputBoolean {
  
  @scala.inline
  def apply(
    autocomplete: Boolean,
    autofocus: Boolean,
    list: Boolean,
    max: Boolean,
    min: Boolean,
    multiple: Boolean,
    pattern: Boolean,
    placeholder: Boolean,
    required: Boolean,
    step: Boolean
  ): InputBoolean = {
    val __obj = js.Dynamic.literal(autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputBoolean]
  }
  
  @scala.inline
  implicit class InputBooleanMutableBuilder[Self <: InputBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutocomplete(value: Boolean): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setList(value: Boolean): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Boolean): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Boolean): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: Boolean): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholder(value: Boolean): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Boolean): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
