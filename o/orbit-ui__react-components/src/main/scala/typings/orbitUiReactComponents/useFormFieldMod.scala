package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.formContextMod.FormContextType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFormFieldMod {
  
  @JSImport("@orbit-ui/react-components/dist/form/src/useFormField", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useFormField(): js.Tuple2[FormFieldProps, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormField")().asInstanceOf[js.Tuple2[FormFieldProps, Boolean]]
  
  trait FormFieldProps
    extends StObject
       with FormContextType {
    
    var className: js.UndefOr[String] = js.undefined
  }
  object FormFieldProps {
    
    inline def apply(): FormFieldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormFieldProps]
    }
    
    extension [Self <: FormFieldProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
}
