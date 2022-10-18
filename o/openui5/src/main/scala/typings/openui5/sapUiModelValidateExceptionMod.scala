package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelValidateExceptionMod {
  
  @JSImport("sap/ui/model/ValidateException", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ValidateException {
    /**
      * Creates a new ValidateException.
      * See:
      * 	sap.ui.model.SimpleType#validateValue
      */
    def this(/**
      * A message explaining why the validation failed; this message is language dependent as it may be displayed
      * on the UI
      */
    message: String) = this()
    def this(
      /**
      * A message explaining why the validation failed; this message is language dependent as it may be displayed
      * on the UI
      */
    message: String,
      /**
      * Names of the constraints that are violated; the names should be the same as documented in the type's
      * constructor
      */
    violatedConstraints: js.Array[String]
    ) = this()
  }
  
  trait ValidateException extends StObject
}
