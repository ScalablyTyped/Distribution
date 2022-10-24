package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.Id
import typings.orbitUiReactComponents.anon.PartialFieldContextType
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.invalid
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.valid
import typings.react.mod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFieldSrcUseFieldMod {
  
  @JSImport("@orbit-ui/react-components/dist/field/src/useField", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useField(param0: UseFieldProps): UseFieldReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("useField")(param0.asInstanceOf[js.Any]).asInstanceOf[UseFieldReturn]
  
  trait UseFieldProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    var forwardedRef: js.UndefOr[ForwardedRef[Any]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var validationState: js.UndefOr[valid | invalid] = js.undefined
  }
  object UseFieldProps {
    
    inline def apply(): UseFieldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseFieldProps]
    }
    
    extension [Self <: UseFieldProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setValidationState(value: valid | invalid): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
    }
  }
  
  trait UseFieldReturn extends StObject {
    
    var fieldContext: PartialFieldContextType
    
    var fieldId: String
    
    var fieldProps: Id
  }
  object UseFieldReturn {
    
    inline def apply(fieldContext: PartialFieldContextType, fieldId: String, fieldProps: Id): UseFieldReturn = {
      val __obj = js.Dynamic.literal(fieldContext = fieldContext.asInstanceOf[js.Any], fieldId = fieldId.asInstanceOf[js.Any], fieldProps = fieldProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseFieldReturn]
    }
    
    extension [Self <: UseFieldReturn](x: Self) {
      
      inline def setFieldContext(value: PartialFieldContextType): Self = StObject.set(x, "fieldContext", value.asInstanceOf[js.Any])
      
      inline def setFieldId(value: String): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
      
      inline def setFieldProps(value: Id): Self = StObject.set(x, "fieldProps", value.asInstanceOf[js.Any])
    }
  }
}
