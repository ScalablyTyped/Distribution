package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SheetsChartReferenceSuggestionState extends StObject {
  
  /** Indicates if there was a suggested change to chart_id. */
  var chartIdSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to spreadsheet_id. */
  var spreadsheetIdSuggested: js.UndefOr[Boolean] = js.undefined
}
object SheetsChartReferenceSuggestionState {
  
  @scala.inline
  def apply(): SheetsChartReferenceSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetsChartReferenceSuggestionState]
  }
  
  @scala.inline
  implicit class SheetsChartReferenceSuggestionStateMutableBuilder[Self <: SheetsChartReferenceSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChartIdSuggested(value: Boolean): Self = StObject.set(x, "chartIdSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartIdSuggestedUndefined: Self = StObject.set(x, "chartIdSuggested", js.undefined)
    
    @scala.inline
    def setSpreadsheetIdSuggested(value: Boolean): Self = StObject.set(x, "spreadsheetIdSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetIdSuggestedUndefined: Self = StObject.set(x, "spreadsheetIdSuggested", js.undefined)
  }
}
