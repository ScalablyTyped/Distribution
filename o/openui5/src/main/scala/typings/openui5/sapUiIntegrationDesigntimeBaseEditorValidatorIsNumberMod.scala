package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiIntegrationDesigntimeBaseEditorValidatorIsNumberMod extends Shortcut {
  
  @JSImport("sap/ui/integration/designtime/baseEditor/validator/IsNumber", JSImport.Default)
  @js.native
  val default: IsNumber = js.native
  
  /**
    * @SINCE 1.81
    * @EXPERIMENTAL
    *
    * Validates if the provided value is a number or binding string.
    */
  @js.native
  trait IsNumber extends StObject {
    
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
  
  type _To = IsNumber
  
  /* This means you don't have to write `default`, but can instead just say `sapUiIntegrationDesigntimeBaseEditorValidatorIsNumberMod.foo` */
  override def _to: IsNumber = default
}
