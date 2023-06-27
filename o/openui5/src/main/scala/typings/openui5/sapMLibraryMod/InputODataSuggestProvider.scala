package typings.openui5.sapMLibraryMod

import typings.openui5.int
import typings.openui5.sapUiBaseEventMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @since 1.21.2
  *
  * Suggestion helper for `sap.m.Input` fields when used with an OData model.
  *
  * Creates a multi-column suggest list for an `sap.m.Input` field based on a `ValueList` annotation. The
  * `ValueList` annotation will be resolved via the binding information of the input field.
  *
  * If the annotation describes multiple input parameters, the suggest provider will resolve all of these
  * relative to the context of the input field and use them for the suggest query. The suggest provider will
  * write all values that are described as output parameters back to the model (relative to the context of
  * the input field). This can only be done if the model runs in "TwoWay" binding mode. Both features can
  * be switched off via the `bResolveInput/bResolveOutput` parameter of the suggest function.
  */
trait InputODataSuggestProvider extends StObject {
  
  def suggest(
    oEvent: default[js.Object],
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
    
    inline def setSuggest(value: (default[js.Object], Boolean, Boolean, int) => Unit): Self = StObject.set(x, "suggest", js.Any.fromFunction4(value))
  }
}
