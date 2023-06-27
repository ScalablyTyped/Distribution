package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.anon.Keys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiIntegrationDesigntimeBaseEditorValidatorIsSelectedKeyMod extends Shortcut {
  
  @JSImport("sap/ui/integration/designtime/baseEditor/validator/IsSelectedKey", JSImport.Default)
  @js.native
  val default: IsSelectedKey = js.native
  
  /**
    * @since 1.81
    * @experimental - 1.81
    *
    * Validates if the provided value is one of the given keys.
    */
  trait IsSelectedKey extends StObject {
    
    /**
      * Validator function
      *
      * @returns Validation result
      */
    def validate(/**
      * Key to validate
      */
    sValue: String, /**
      * Validator config
      */
    oConfig: Keys): Boolean
  }
  object IsSelectedKey {
    
    inline def apply(validate: (String, Keys) => Boolean): IsSelectedKey = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction2(validate))
      __obj.asInstanceOf[IsSelectedKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsSelectedKey] (val x: Self) extends AnyVal {
      
      inline def setValidate(value: (String, Keys) => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
    }
  }
  
  type _To = IsSelectedKey
  
  /* This means you don't have to write `default`, but can instead just say `sapUiIntegrationDesigntimeBaseEditorValidatorIsSelectedKeyMod.foo` */
  override def _to: IsSelectedKey = default
}
