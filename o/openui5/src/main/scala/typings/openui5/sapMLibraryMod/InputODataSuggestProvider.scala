package typings.openui5.sapMLibraryMod

import typings.openui5.int
import typings.openui5.sapUiBaseEventMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputODataSuggestProvider extends StObject {
  
  def suggest(
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
  ): Unit
}
object InputODataSuggestProvider {
  
  @JSImport("sap/m/library", "InputODataSuggestProvider")
  @js.native
  val ^ : InputODataSuggestProvider = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputODataSuggestProvider] (val x: Self) extends AnyVal {
    
    inline def setSuggest(value: (default, Boolean, Boolean, int) => Unit): Self = StObject.set(x, "suggest", js.Any.fromFunction4(value))
  }
}
