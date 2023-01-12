package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiIntegrationDesigntimeBaseEditorValidatorIsUniqueListMod extends Shortcut {
  
  @JSImport("sap/ui/integration/designtime/baseEditor/validator/IsUniqueList", JSImport.Default)
  @js.native
  val default: IsUniqueList = js.native
  
  /**
    * @SINCE 1.81
    * @EXPERIMENTAL - 1.81
    *
    * Validates if the provided list contains no duplicates.
    */
  trait IsUniqueList extends StObject {
    
    /**
      * Validator function
      *
      * @returns Validation result
      */
    def validate(/**
      * List to validate
      */
    aValue: String): Boolean
  }
  object IsUniqueList {
    
    inline def apply(validate: String => Boolean): IsUniqueList = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[IsUniqueList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsUniqueList] (val x: Self) extends AnyVal {
      
      inline def setValidate(value: String => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    }
  }
  
  type _To = IsUniqueList
  
  /* This means you don't have to write `default`, but can instead just say `sapUiIntegrationDesigntimeBaseEditorValidatorIsUniqueListMod.foo` */
  override def _to: IsUniqueList = default
}
