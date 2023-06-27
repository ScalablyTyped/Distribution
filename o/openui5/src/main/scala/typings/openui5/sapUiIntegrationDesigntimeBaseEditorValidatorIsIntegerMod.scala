package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiIntegrationDesigntimeBaseEditorValidatorIsIntegerMod extends Shortcut {
  
  @JSImport("sap/ui/integration/designtime/baseEditor/validator/IsInteger", JSImport.Default)
  @js.native
  val default: IsInteger = js.native
  
  /**
    * @since 1.81
    * @experimental - 1.81
    *
    * Validates if the provided value is an integer or binding string.
    */
  @js.native
  trait IsInteger extends StObject {
    
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
    vValue: Double): Boolean = js.native
  }
  
  type _To = IsInteger
  
  /* This means you don't have to write `default`, but can instead just say `sapUiIntegrationDesigntimeBaseEditorValidatorIsIntegerMod.foo` */
  override def _to: IsInteger = default
}
