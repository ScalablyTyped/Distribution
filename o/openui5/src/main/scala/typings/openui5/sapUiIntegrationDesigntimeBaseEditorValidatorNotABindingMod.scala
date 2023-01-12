package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiIntegrationDesigntimeBaseEditorValidatorNotABindingMod extends Shortcut {
  
  @JSImport("sap/ui/integration/designtime/baseEditor/validator/NotABinding", JSImport.Default)
  @js.native
  val default: NotABinding = js.native
  
  /**
    * @SINCE 1.81
    * @EXPERIMENTAL - 1.81
    *
    * Validates if the provided value doesn't contain a binding.
    */
  trait NotABinding extends StObject {
    
    /**
      * Validator function
      *
      * @returns Validation result
      */
    def validate(/**
      * Value to validate
      */
    sValue: String): Boolean
  }
  object NotABinding {
    
    inline def apply(validate: String => Boolean): NotABinding = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[NotABinding]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotABinding] (val x: Self) extends AnyVal {
      
      inline def setValidate(value: String => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    }
  }
  
  type _To = NotABinding
  
  /* This means you don't have to write `default`, but can instead just say `sapUiIntegrationDesigntimeBaseEditorValidatorNotABindingMod.foo` */
  override def _to: NotABinding = default
}
