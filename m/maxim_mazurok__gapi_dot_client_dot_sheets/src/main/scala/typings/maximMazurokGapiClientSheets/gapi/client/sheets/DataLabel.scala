package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataLabel extends StObject {
  
  /**
    * Data to use for custom labels. Only used if type is set to CUSTOM. This data must be the same length as the series or other element this data label is applied to. In addition, if
    * the series is split into multiple source ranges, this source data must come from the next column in the source data. For example, if the series is B2:B4,E6:E8 then this data must
    * come from C2:C4,F6:F8.
    */
  var customLabelData: js.UndefOr[ChartData] = js.undefined
  
  /** The placement of the data label relative to the labeled data. */
  var placement: js.UndefOr[String] = js.undefined
  
  /** The text format used for the data label. The link field is not supported. */
  var textFormat: js.UndefOr[TextFormat] = js.undefined
  
  /** The type of the data label. */
  var `type`: js.UndefOr[String] = js.undefined
}
object DataLabel {
  
  inline def apply(): DataLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataLabel] (val x: Self) extends AnyVal {
    
    inline def setCustomLabelData(value: ChartData): Self = StObject.set(x, "customLabelData", value.asInstanceOf[js.Any])
    
    inline def setCustomLabelDataUndefined: Self = StObject.set(x, "customLabelData", js.undefined)
    
    inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setTextFormat(value: TextFormat): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
    
    inline def setTextFormatUndefined: Self = StObject.set(x, "textFormat", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
