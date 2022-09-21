package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.invalid
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.polite
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.valid
import typings.react.mod.Context
import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldContextMod {
  
  @JSImport("@orbit-ui/react-components/dist/field/src/FieldContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ClearFieldContext(hasChildren: ClearFieldContextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearFieldContext")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/field/src/FieldContext", "FieldContext")
  @js.native
  val FieldContext: Context[FieldContextType] = js.native
  
  inline def useFieldContext(): js.Tuple2[FieldContextType, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFieldContext")().asInstanceOf[js.Tuple2[FieldContextType, Boolean]]
  
  inline def useFieldInputProps(): js.Tuple2[UseFieldInputPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFieldInputProps")().asInstanceOf[js.Tuple2[UseFieldInputPropsReturn, Boolean]]
  
  inline def useFieldLabelProps(hasAsProp: UseFieldLabelProps_): js.Tuple2[UseFieldLabelPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFieldLabelProps")(hasAsProp.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[UseFieldLabelPropsReturn, Boolean]]
  
  inline def useFieldMessageProps(): js.Tuple2[UseFieldMessagePropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFieldMessageProps")().asInstanceOf[js.Tuple2[UseFieldMessagePropsReturn, Boolean]]
  
  trait ClearFieldContextProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object ClearFieldContextProps {
    
    inline def apply(): ClearFieldContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearFieldContextProps]
    }
    
    extension [Self <: ClearFieldContextProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait FieldContextType extends StObject {
    
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
  object FieldContextType {
    
    inline def apply(): FieldContextType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldContextType]
    }
    
    extension [Self <: FieldContextType](x: Self) {
      
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
  
  trait UseFieldInputPropsReturn extends StObject {
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var validationState: js.UndefOr[valid | invalid] = js.undefined
  }
  object UseFieldInputPropsReturn {
    
    inline def apply(): UseFieldInputPropsReturn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseFieldInputPropsReturn]
    }
    
    extension [Self <: UseFieldInputPropsReturn](x: Self) {
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setValidationState(value: valid | invalid): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
    }
  }
  
  trait UseFieldLabelPropsReturn extends StObject {
    
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var htmlFor: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
  }
  object UseFieldLabelPropsReturn {
    
    inline def apply(): UseFieldLabelPropsReturn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseFieldLabelPropsReturn]
    }
    
    extension [Self <: UseFieldLabelPropsReturn](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
      
      inline def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    }
  }
  
  trait UseFieldLabelProps_ extends StObject {
    
    var as: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object UseFieldLabelProps_ {
    
    inline def apply(): UseFieldLabelProps_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseFieldLabelProps_]
    }
    
    extension [Self <: UseFieldLabelProps_](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    }
  }
  
  trait UseFieldMessagePropsReturn extends StObject {
    
    var `aria-live`: js.UndefOr[polite] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var validationState: js.UndefOr[valid | invalid] = js.undefined
  }
  object UseFieldMessagePropsReturn {
    
    inline def apply(): UseFieldMessagePropsReturn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseFieldMessagePropsReturn]
    }
    
    extension [Self <: UseFieldMessagePropsReturn](x: Self) {
      
      inline def `setAria-live`(value: polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setValidationState(value: valid | invalid): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
    }
  }
}
