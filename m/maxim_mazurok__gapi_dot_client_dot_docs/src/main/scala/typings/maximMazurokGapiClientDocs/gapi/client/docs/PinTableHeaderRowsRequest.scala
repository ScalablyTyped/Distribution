package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PinTableHeaderRowsRequest extends StObject {
  
  /** The number of table rows to pin, where 0 implies that all rows are unpinned. */
  var pinnedHeaderRowsCount: js.UndefOr[Double] = js.undefined
  
  /** The location where the table starts in the document. */
  var tableStartLocation: js.UndefOr[Location] = js.undefined
}
object PinTableHeaderRowsRequest {
  
  inline def apply(): PinTableHeaderRowsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PinTableHeaderRowsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PinTableHeaderRowsRequest] (val x: Self) extends AnyVal {
    
    inline def setPinnedHeaderRowsCount(value: Double): Self = StObject.set(x, "pinnedHeaderRowsCount", value.asInstanceOf[js.Any])
    
    inline def setPinnedHeaderRowsCountUndefined: Self = StObject.set(x, "pinnedHeaderRowsCount", js.undefined)
    
    inline def setTableStartLocation(value: Location): Self = StObject.set(x, "tableStartLocation", value.asInstanceOf[js.Any])
    
    inline def setTableStartLocationUndefined: Self = StObject.set(x, "tableStartLocation", js.undefined)
  }
}
