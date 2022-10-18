package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelParseExceptionMod {
  
  @JSImport("sap/ui/model/ParseException", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ParseException {
    /**
      * Creates a new ParseException.
      * See:
      * 	sap.ui.model.SimpleType#formatValue
      */
    def this(/**
      * A message explaining why the parsing of a value failed; this message is language dependent as it may
      * be displayed on the UI
      */
    message: String) = this()
  }
  
  trait ParseException extends StObject
}
