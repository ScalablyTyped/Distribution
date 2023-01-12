package typings.orbitUiReactComponents.anon

import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.invalid
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@orbit-ui/react-components.@orbit-ui/react-components/dist/field/src/FieldContext.FieldContextType> */
trait PartialFieldContextType extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var fluid: js.UndefOr[Boolean] = js.undefined
  
  var hasLabel: js.UndefOr[Boolean] = js.undefined
  
  var hasMessage: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var inputClassName: js.UndefOr[String] = js.undefined
  
  var inputId: js.UndefOr[String] = js.undefined
  
  var isGroup: js.UndefOr[Boolean] = js.undefined
  
  var labelClassName: js.UndefOr[String] = js.undefined
  
  var labelId: js.UndefOr[String] = js.undefined
  
  var messageClassName: js.UndefOr[String] = js.undefined
  
  var messageId: js.UndefOr[String] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var validationState: js.UndefOr[valid | invalid] = js.undefined
}
object PartialFieldContextType {
  
  inline def apply(): PartialFieldContextType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFieldContextType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialFieldContextType] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
    
    inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
    
    inline def setHasLabel(value: Boolean): Self = StObject.set(x, "hasLabel", value.asInstanceOf[js.Any])
    
    inline def setHasLabelUndefined: Self = StObject.set(x, "hasLabel", js.undefined)
    
    inline def setHasMessage(value: Boolean): Self = StObject.set(x, "hasMessage", value.asInstanceOf[js.Any])
    
    inline def setHasMessageUndefined: Self = StObject.set(x, "hasMessage", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInputClassName(value: String): Self = StObject.set(x, "inputClassName", value.asInstanceOf[js.Any])
    
    inline def setInputClassNameUndefined: Self = StObject.set(x, "inputClassName", js.undefined)
    
    inline def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
    
    inline def setInputIdUndefined: Self = StObject.set(x, "inputId", js.undefined)
    
    inline def setIsGroup(value: Boolean): Self = StObject.set(x, "isGroup", value.asInstanceOf[js.Any])
    
    inline def setIsGroupUndefined: Self = StObject.set(x, "isGroup", js.undefined)
    
    inline def setLabelClassName(value: String): Self = StObject.set(x, "labelClassName", value.asInstanceOf[js.Any])
    
    inline def setLabelClassNameUndefined: Self = StObject.set(x, "labelClassName", js.undefined)
    
    inline def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
    
    inline def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
    
    inline def setMessageClassName(value: String): Self = StObject.set(x, "messageClassName", value.asInstanceOf[js.Any])
    
    inline def setMessageClassNameUndefined: Self = StObject.set(x, "messageClassName", js.undefined)
    
    inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setValidationState(value: valid | invalid): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
    
    inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
  }
}
