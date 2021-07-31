package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextToColumnsRequest extends StObject {
  
  /** The delimiter to use. Used only if delimiterType is CUSTOM. */
  var delimiter: js.UndefOr[String] = js.undefined
  
  /** The delimiter type to use. */
  var delimiterType: js.UndefOr[String] = js.undefined
  
  /** The source data range. This must span exactly one column. */
  var source: js.UndefOr[GridRange] = js.undefined
}
object TextToColumnsRequest {
  
  @scala.inline
  def apply(): TextToColumnsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextToColumnsRequest]
  }
  
  @scala.inline
  implicit class TextToColumnsRequestMutableBuilder[Self <: TextToColumnsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterType(value: String): Self = StObject.set(x, "delimiterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterTypeUndefined: Self = StObject.set(x, "delimiterType", js.undefined)
    
    @scala.inline
    def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    @scala.inline
    def setSource(value: GridRange): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
