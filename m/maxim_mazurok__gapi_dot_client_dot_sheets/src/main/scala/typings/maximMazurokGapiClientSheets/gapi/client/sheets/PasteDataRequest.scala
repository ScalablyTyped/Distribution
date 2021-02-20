package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PasteDataRequest extends StObject {
  
  /** The coordinate at which the data should start being inserted. */
  var coordinate: js.UndefOr[GridCoordinate] = js.native
  
  /** The data to insert. */
  var data: js.UndefOr[String] = js.native
  
  /** The delimiter in the data. */
  var delimiter: js.UndefOr[String] = js.native
  
  /** True if the data is HTML. */
  var html: js.UndefOr[Boolean] = js.native
  
  /** How the data should be pasted. */
  var `type`: js.UndefOr[String] = js.native
}
object PasteDataRequest {
  
  @scala.inline
  def apply(): PasteDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasteDataRequest]
  }
  
  @scala.inline
  implicit class PasteDataRequestMutableBuilder[Self <: PasteDataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinate(value: GridCoordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinateUndefined: Self = StObject.set(x, "coordinate", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    @scala.inline
    def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
