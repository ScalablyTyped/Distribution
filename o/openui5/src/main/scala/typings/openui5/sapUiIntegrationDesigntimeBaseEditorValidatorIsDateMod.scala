package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiIntegrationDesigntimeBaseEditorValidatorIsDateMod extends Shortcut {
  
  @JSImport("sap/ui/integration/designtime/baseEditor/validator/IsDate", JSImport.Default)
  @js.native
  val default: IsDate = js.native
  
  /**
    * @SINCE 1.81
    * @EXPERIMENTAL
    *
    * Validates if the provided value can be parsed to a valid date.
    */
  trait IsDate extends StObject {
    
    /**
      * Validator function
      *
      * @returns Validation result
      */
    def validate(/**
      * Date string to validate
      */
    sDateString: String): Boolean
  }
  object IsDate {
    
    inline def apply(validate: String => Boolean): IsDate = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[IsDate]
    }
    
    extension [Self <: IsDate](x: Self) {
      
      inline def setValidate(value: String => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    }
  }
  
  type _To = IsDate
  
  /* This means you don't have to write `default`, but can instead just say `sapUiIntegrationDesigntimeBaseEditorValidatorIsDateMod.foo` */
  override def _to: IsDate = default
}
