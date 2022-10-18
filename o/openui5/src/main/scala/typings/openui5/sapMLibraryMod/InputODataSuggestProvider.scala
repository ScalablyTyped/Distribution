package typings.openui5.sapMLibraryMod

import typings.openui5.int
import typings.openui5.sapUiBaseEventMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InputODataSuggestProvider {
  
  @JSImport("sap/m/library", "InputODataSuggestProvider")
  @js.native
  val ^ : js.Any = js.native
  
  inline def suggest(
    oEvent: default,
    /**
    * SuggestProvider resolves all input parameters for the data query
    */
  bResolveInput: Boolean,
    /**
    * SuggestProvider writes back all output parameters.
    */
  bResolveOutput: Boolean,
    /**
    * If iLength is provided only these number of entries will be requested.
    */
  iLength: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("suggest")(oEvent.asInstanceOf[js.Any], bResolveInput.asInstanceOf[js.Any], bResolveOutput.asInstanceOf[js.Any], iLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
