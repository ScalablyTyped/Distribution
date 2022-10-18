package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelFormatExceptionMod {
  
  @JSImport("sap/ui/model/FormatException", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with FormatException {
    /**
      * Creates a new FormatException.
      * See:
      * 	sap.ui.model.SimpleType#formatValue
      */
    def this(/**
      * A message explaining why the formatting of a value failed
      */
    message: String) = this()
  }
  
  trait FormatException extends StObject
}
