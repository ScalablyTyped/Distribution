package typings.orbitUiReactComponents

import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formContextMod {
  
  @JSImport("@orbit-ui/react-components/dist/form/src/FormContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/form/src/FormContext", "FormContext")
  @js.native
  val FormContext: Context[FormContextType] = js.native
  
  inline def useFormContext(): js.Tuple2[FormContextType, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormContext")().asInstanceOf[js.Tuple2[FormContextType, Boolean]]
  
  trait FormContextType extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var fluid: js.UndefOr[Boolean] = js.undefined
  }
  object FormContextType {
    
    inline def apply(): FormContextType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormContextType]
    }
    
    extension [Self <: FormContextType](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
    }
  }
}
