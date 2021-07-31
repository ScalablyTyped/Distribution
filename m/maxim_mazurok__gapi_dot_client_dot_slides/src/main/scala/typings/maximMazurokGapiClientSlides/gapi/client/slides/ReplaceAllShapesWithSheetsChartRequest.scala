package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceAllShapesWithSheetsChartRequest extends StObject {
  
  /** The ID of the specific chart in the Google Sheets spreadsheet. */
  var chartId: js.UndefOr[Double] = js.undefined
  
  /** The criteria that the shapes must match in order to be replaced. The request will replace all of the shapes that contain the given text. */
  var containsText: js.UndefOr[SubstringMatchCriteria] = js.undefined
  
  /** The mode with which the chart is linked to the source spreadsheet. When not specified, the chart will be an image that is not linked. */
  var linkingMode: js.UndefOr[String] = js.undefined
  
  /**
    * If non-empty, limits the matches to page elements only on the given pages. Returns a 400 bad request error if given the page object ID of a notes page or a notes master, or if a
    * page with that object ID doesn't exist in the presentation.
    */
  var pageObjectIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The ID of the Google Sheets spreadsheet that contains the chart. */
  var spreadsheetId: js.UndefOr[String] = js.undefined
}
object ReplaceAllShapesWithSheetsChartRequest {
  
  @scala.inline
  def apply(): ReplaceAllShapesWithSheetsChartRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceAllShapesWithSheetsChartRequest]
  }
  
  @scala.inline
  implicit class ReplaceAllShapesWithSheetsChartRequestMutableBuilder[Self <: ReplaceAllShapesWithSheetsChartRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChartId(value: Double): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartIdUndefined: Self = StObject.set(x, "chartId", js.undefined)
    
    @scala.inline
    def setContainsText(value: SubstringMatchCriteria): Self = StObject.set(x, "containsText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsTextUndefined: Self = StObject.set(x, "containsText", js.undefined)
    
    @scala.inline
    def setLinkingMode(value: String): Self = StObject.set(x, "linkingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkingModeUndefined: Self = StObject.set(x, "linkingMode", js.undefined)
    
    @scala.inline
    def setPageObjectIds(value: js.Array[String]): Self = StObject.set(x, "pageObjectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageObjectIdsUndefined: Self = StObject.set(x, "pageObjectIds", js.undefined)
    
    @scala.inline
    def setPageObjectIdsVarargs(value: String*): Self = StObject.set(x, "pageObjectIds", js.Array(value :_*))
    
    @scala.inline
    def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
  }
}
