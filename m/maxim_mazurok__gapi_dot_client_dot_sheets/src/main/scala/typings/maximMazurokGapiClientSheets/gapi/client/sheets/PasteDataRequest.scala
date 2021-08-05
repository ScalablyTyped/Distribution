package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasteDataRequest extends StObject {
  
  /** The coordinate at which the data should start being inserted. */
  var coordinate: js.UndefOr[GridCoordinate] = js.undefined
  
  /** The data to insert. */
  var data: js.UndefOr[String] = js.undefined
  
  /** The delimiter in the data. */
  var delimiter: js.UndefOr[String] = js.undefined
  
  /** True if the data is HTML. */
  var html: js.UndefOr[Boolean] = js.undefined
  
  /** How the data should be pasted. */
  var `type`: js.UndefOr[String] = js.undefined
}
object PasteDataRequest {
  
  inline def apply(): PasteDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasteDataRequest]
  }
  
  extension [Self <: PasteDataRequest](x: Self) {
    
    inline def setCoordinate(value: GridCoordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    inline def setCoordinateUndefined: Self = StObject.set(x, "coordinate", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
