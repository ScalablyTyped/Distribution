package typings.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkedContentReferenceSuggestionState extends js.Object {
  
  /** A mask that indicates which of the fields in sheets_chart_reference have been changed in this suggestion. */
  var sheetsChartReferenceSuggestionState: js.UndefOr[SheetsChartReferenceSuggestionState] = js.native
}
object LinkedContentReferenceSuggestionState {
  
  @scala.inline
  def apply(): LinkedContentReferenceSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedContentReferenceSuggestionState]
  }
  
  @scala.inline
  implicit class LinkedContentReferenceSuggestionStateOps[Self <: LinkedContentReferenceSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSheetsChartReferenceSuggestionState(value: SheetsChartReferenceSuggestionState): Self = this.set("sheetsChartReferenceSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetsChartReferenceSuggestionState: Self = this.set("sheetsChartReferenceSuggestionState", js.undefined)
  }
}
