package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.anon.AllowPlainStrings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiIntegrationDesigntimeBaseEditorValidatorIsValidBindingMod extends Shortcut {
  
  @JSImport("sap/ui/integration/designtime/baseEditor/validator/IsValidBinding", JSImport.Default)
  @js.native
  val default: IsValidBinding = js.native
  
  /**
    * @since 1.81
    * @experimental - 1.81
    *
    * Validates if the provided value is a valid binding.
    */
  trait IsValidBinding extends StObject {
    
    /**
      * Validator function
      *
      * @returns Validation result
      */
    def validate(
      /**
      * Value to validate
      */
    sValue: String,
      /**
      * Validator config
      */
    oConfig: AllowPlainStrings
    ): Boolean
  }
  object IsValidBinding {
    
    inline def apply(validate: (String, AllowPlainStrings) => Boolean): IsValidBinding = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction2(validate))
      __obj.asInstanceOf[IsValidBinding]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsValidBinding] (val x: Self) extends AnyVal {
      
      inline def setValidate(value: (String, AllowPlainStrings) => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
    }
  }
  
  type _To = IsValidBinding
  
  /* This means you don't have to write `default`, but can instead just say `sapUiIntegrationDesigntimeBaseEditorValidatorIsValidBindingMod.foo` */
  override def _to: IsValidBinding = default
}
