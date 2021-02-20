package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestedTableCellStyle extends StObject {
  
  /**
    * A TableCellStyle that only includes the changes made in this suggestion. This can be used along with the table_cell_style_suggestion_state to see which fields have changed and their
    * new values.
    */
  var tableCellStyle: js.UndefOr[TableCellStyle] = js.native
  
  /** A mask that indicates which of the fields on the base TableCellStyle have been changed in this suggestion. */
  var tableCellStyleSuggestionState: js.UndefOr[TableCellStyleSuggestionState] = js.native
}
object SuggestedTableCellStyle {
  
  @scala.inline
  def apply(): SuggestedTableCellStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedTableCellStyle]
  }
  
  @scala.inline
  implicit class SuggestedTableCellStyleMutableBuilder[Self <: SuggestedTableCellStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableCellStyle(value: TableCellStyle): Self = StObject.set(x, "tableCellStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableCellStyleSuggestionState(value: TableCellStyleSuggestionState): Self = StObject.set(x, "tableCellStyleSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableCellStyleSuggestionStateUndefined: Self = StObject.set(x, "tableCellStyleSuggestionState", js.undefined)
    
    @scala.inline
    def setTableCellStyleUndefined: Self = StObject.set(x, "tableCellStyle", js.undefined)
  }
}
