package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkedContentReferenceSuggestionState extends StObject {
  
  /** A mask that indicates which of the fields in sheets_chart_reference have been changed in this suggestion. */
  var sheetsChartReferenceSuggestionState: js.UndefOr[SheetsChartReferenceSuggestionState] = js.undefined
}
object LinkedContentReferenceSuggestionState {
  
  @scala.inline
  def apply(): LinkedContentReferenceSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedContentReferenceSuggestionState]
  }
  
  @scala.inline
  implicit class LinkedContentReferenceSuggestionStateMutableBuilder[Self <: LinkedContentReferenceSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSheetsChartReferenceSuggestionState(value: SheetsChartReferenceSuggestionState): Self = StObject.set(x, "sheetsChartReferenceSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetsChartReferenceSuggestionStateUndefined: Self = StObject.set(x, "sheetsChartReferenceSuggestionState", js.undefined)
  }
}
