package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CutPasteRequest extends StObject {
  
  /** The top-left coordinate where the data should be pasted. */
  var destination: js.UndefOr[GridCoordinate] = js.undefined
  
  /** What kind of data to paste. All the source data will be cut, regardless of what is pasted. */
  var pasteType: js.UndefOr[String] = js.undefined
  
  /** The source data to cut. */
  var source: js.UndefOr[GridRange] = js.undefined
}
object CutPasteRequest {
  
  @scala.inline
  def apply(): CutPasteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CutPasteRequest]
  }
  
  @scala.inline
  implicit class CutPasteRequestMutableBuilder[Self <: CutPasteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: GridCoordinate): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setPasteType(value: String): Self = StObject.set(x, "pasteType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasteTypeUndefined: Self = StObject.set(x, "pasteType", js.undefined)
    
    @scala.inline
    def setSource(value: GridRange): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
