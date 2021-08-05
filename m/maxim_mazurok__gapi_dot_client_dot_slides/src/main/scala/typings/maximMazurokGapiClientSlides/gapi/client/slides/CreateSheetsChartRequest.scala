package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSheetsChartRequest extends StObject {
  
  /** The ID of the specific chart in the Google Sheets spreadsheet. */
  var chartId: js.UndefOr[Double] = js.undefined
  
  /**
    * The element properties for the chart. When the aspect ratio of the provided size does not match the chart aspect ratio, the chart is scaled and centered with respect to the size in
    * order to maintain aspect ratio. The provided transform is applied after this operation.
    */
  var elementProperties: js.UndefOr[PageElementProperties] = js.undefined
  
  /** The mode with which the chart is linked to the source spreadsheet. When not specified, the chart will be an image that is not linked. */
  var linkingMode: js.UndefOr[String] = js.undefined
  
  /**
    * A user-supplied object ID. If specified, the ID must be unique among all pages and page elements in the presentation. The ID should start with a word character [a-zA-Z0-9_] and then
    * followed by any number of the following characters [a-zA-Z0-9_-:]. The length of the ID should not be less than 5 or greater than 50. If empty, a unique identifier will be
    * generated.
    */
  var objectId: js.UndefOr[String] = js.undefined
  
  /** The ID of the Google Sheets spreadsheet that contains the chart. */
  var spreadsheetId: js.UndefOr[String] = js.undefined
}
object CreateSheetsChartRequest {
  
  inline def apply(): CreateSheetsChartRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSheetsChartRequest]
  }
  
  extension [Self <: CreateSheetsChartRequest](x: Self) {
    
    inline def setChartId(value: Double): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
    
    inline def setChartIdUndefined: Self = StObject.set(x, "chartId", js.undefined)
    
    inline def setElementProperties(value: PageElementProperties): Self = StObject.set(x, "elementProperties", value.asInstanceOf[js.Any])
    
    inline def setElementPropertiesUndefined: Self = StObject.set(x, "elementProperties", js.undefined)
    
    inline def setLinkingMode(value: String): Self = StObject.set(x, "linkingMode", value.asInstanceOf[js.Any])
    
    inline def setLinkingModeUndefined: Self = StObject.set(x, "linkingMode", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    inline def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
  }
}
