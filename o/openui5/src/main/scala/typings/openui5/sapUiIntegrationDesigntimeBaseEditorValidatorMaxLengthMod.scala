package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiIntegrationDesigntimeBaseEditorValidatorMaxLengthMod extends Shortcut {
  
  @JSImport("sap/ui/integration/designtime/baseEditor/validator/MaxLength", JSImport.Default)
  @js.native
  val default: MaxLength = js.native
  
  /**
    * @SINCE 1.81
    * @EXPERIMENTAL - 1.81
    *
    * Validates if the provided value doesn't exceed the maximum length.
    */
  @js.native
  trait MaxLength extends StObject {
    
    def validate(/**
      * Value to validate
      */
    vValue: String): Boolean = js.native
    /**
      * Validator function
      *
      * @returns Validation result
      */
    def validate(/**
      * Value to validate
      */
    vValue: Boolean): Boolean = js.native
  }
  
  type _To = MaxLength
  
  /* This means you don't have to write `default`, but can instead just say `sapUiIntegrationDesigntimeBaseEditorValidatorMaxLengthMod.foo` */
  override def _to: MaxLength = default
}
