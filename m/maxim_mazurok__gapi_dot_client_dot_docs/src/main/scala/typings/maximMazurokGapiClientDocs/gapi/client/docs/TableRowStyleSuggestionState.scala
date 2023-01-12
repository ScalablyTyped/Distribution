package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableRowStyleSuggestionState extends StObject {
  
  /** Indicates if there was a suggested change to min_row_height. */
  var minRowHeightSuggested: js.UndefOr[Boolean] = js.undefined
}
object TableRowStyleSuggestionState {
  
  inline def apply(): TableRowStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowStyleSuggestionState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableRowStyleSuggestionState] (val x: Self) extends AnyVal {
    
    inline def setMinRowHeightSuggested(value: Boolean): Self = StObject.set(x, "minRowHeightSuggested", value.asInstanceOf[js.Any])
    
    inline def setMinRowHeightSuggestedUndefined: Self = StObject.set(x, "minRowHeightSuggested", js.undefined)
  }
}
