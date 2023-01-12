package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distFormSrcFormContextMod.FormContextType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFormSrcUseFormFieldMod {
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormFieldProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
}
