package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiIntegrationDesigntimeBaseEditorValidatorIsStringListMod extends Shortcut {
  
  @JSImport("sap/ui/integration/designtime/baseEditor/validator/IsStringList", JSImport.Default)
  @js.native
  val default: IsStringList = js.native
  
  /**
    * @SINCE 1.81
    * @EXPERIMENTAL - 1.81
    *
    * Validates if none of the provided values is an invalid binding.
    */
  trait IsStringList extends StObject {
    
    /**
      * Validator function
      *
      * @returns Validation result
      */
    def validate(/**
      * Strings to validate
      */
    aValue: js.Array[String]): Boolean
  }
  object IsStringList {
    
    inline def apply(validate: js.Array[String] => Boolean): IsStringList = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[IsStringList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsStringList] (val x: Self) extends AnyVal {
      
      inline def setValidate(value: js.Array[String] => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    }
  }
  
  type _To = IsStringList
  
  /* This means you don't have to write `default`, but can instead just say `sapUiIntegrationDesigntimeBaseEditorValidatorIsStringListMod.foo` */
  override def _to: IsStringList = default
}
