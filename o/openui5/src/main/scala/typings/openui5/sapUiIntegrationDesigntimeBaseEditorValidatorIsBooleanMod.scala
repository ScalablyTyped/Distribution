package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiIntegrationDesigntimeBaseEditorValidatorIsBooleanMod extends Shortcut {
  
  @JSImport("sap/ui/integration/designtime/baseEditor/validator/IsBoolean", JSImport.Default)
  @js.native
  val default: IsBoolean = js.native
  
  /**
    * @since 1.81
    * @experimental - 1.81
    *
    * Validates if the provided value is a boolean or binding string.
    */
  @js.native
  trait IsBoolean extends StObject {
    
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
  
  type _To = IsBoolean
  
  /* This means you don't have to write `default`, but can instead just say `sapUiIntegrationDesigntimeBaseEditorValidatorIsBooleanMod.foo` */
  override def _to: IsBoolean = default
}
