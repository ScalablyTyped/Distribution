package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestedTableCellStyle extends StObject {
  
  /**
    * A TableCellStyle that only includes the changes made in this suggestion. This can be used along with the table_cell_style_suggestion_state to see which fields have changed and their
    * new values.
    */
  var tableCellStyle: js.UndefOr[TableCellStyle] = js.undefined
  
  /** A mask that indicates which of the fields on the base TableCellStyle have been changed in this suggestion. */
  var tableCellStyleSuggestionState: js.UndefOr[TableCellStyleSuggestionState] = js.undefined
}
object SuggestedTableCellStyle {
  
  inline def apply(): SuggestedTableCellStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedTableCellStyle]
  }
  
  extension [Self <: SuggestedTableCellStyle](x: Self) {
    
    inline def setTableCellStyle(value: TableCellStyle): Self = StObject.set(x, "tableCellStyle", value.asInstanceOf[js.Any])
    
    inline def setTableCellStyleSuggestionState(value: TableCellStyleSuggestionState): Self = StObject.set(x, "tableCellStyleSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setTableCellStyleSuggestionStateUndefined: Self = StObject.set(x, "tableCellStyleSuggestionState", js.undefined)
    
    inline def setTableCellStyleUndefined: Self = StObject.set(x, "tableCellStyle", js.undefined)
  }
}
