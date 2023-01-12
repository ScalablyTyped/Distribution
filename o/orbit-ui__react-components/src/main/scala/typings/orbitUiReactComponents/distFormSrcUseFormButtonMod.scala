package typings.orbitUiReactComponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFormSrcUseFormButtonMod {
  
  @JSImport("@orbit-ui/react-components/dist/form/src/useFormButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useFormButton(): js.Tuple2[FormButtonProps, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormButton")().asInstanceOf[js.Tuple2[FormButtonProps, Boolean]]
  
  /* Inlined std.Omit<@orbit-ui/react-components.@orbit-ui/react-components/dist/form/src/FormContext.FormContextType, 'fluid'> */
  trait FormButtonProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
  }
  object FormButtonProps {
    
    inline def apply(): FormButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormButtonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormButtonProps] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
}
