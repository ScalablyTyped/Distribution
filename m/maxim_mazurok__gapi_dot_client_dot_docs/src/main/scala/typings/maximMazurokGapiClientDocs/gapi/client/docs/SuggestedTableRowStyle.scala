package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestedTableRowStyle extends StObject {
  
  /**
    * A TableRowStyle that only includes the changes made in this suggestion. This can be used along with the table_row_style_suggestion_state to see which fields have changed and their
    * new values.
    */
  var tableRowStyle: js.UndefOr[TableRowStyle] = js.undefined
  
  /** A mask that indicates which of the fields on the base TableRowStyle have been changed in this suggestion. */
  var tableRowStyleSuggestionState: js.UndefOr[TableRowStyleSuggestionState] = js.undefined
}
object SuggestedTableRowStyle {
  
  @scala.inline
  def apply(): SuggestedTableRowStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedTableRowStyle]
  }
  
  @scala.inline
  implicit class SuggestedTableRowStyleMutableBuilder[Self <: SuggestedTableRowStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableRowStyle(value: TableRowStyle): Self = StObject.set(x, "tableRowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableRowStyleSuggestionState(value: TableRowStyleSuggestionState): Self = StObject.set(x, "tableRowStyleSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableRowStyleSuggestionStateUndefined: Self = StObject.set(x, "tableRowStyleSuggestionState", js.undefined)
    
    @scala.inline
    def setTableRowStyleUndefined: Self = StObject.set(x, "tableRowStyle", js.undefined)
  }
}
