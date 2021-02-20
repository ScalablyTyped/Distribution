package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SheetsChartReference extends StObject {
  
  /** The ID of the specific chart in the Google Sheets spreadsheet that is embedded. */
  var chartId: js.UndefOr[Double] = js.native
  
  /** The ID of the Google Sheets spreadsheet that contains the source chart. */
  var spreadsheetId: js.UndefOr[String] = js.native
}
object SheetsChartReference {
  
  @scala.inline
  def apply(): SheetsChartReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetsChartReference]
  }
  
  @scala.inline
  implicit class SheetsChartReferenceMutableBuilder[Self <: SheetsChartReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChartId(value: Double): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartIdUndefined: Self = StObject.set(x, "chartId", js.undefined)
    
    @scala.inline
    def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
  }
}
