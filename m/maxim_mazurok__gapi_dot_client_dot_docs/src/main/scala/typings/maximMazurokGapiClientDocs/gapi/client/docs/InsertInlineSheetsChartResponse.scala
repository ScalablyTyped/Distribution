package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertInlineSheetsChartResponse extends StObject {
  
  /** The object ID of the inserted chart. */
  var objectId: js.UndefOr[String] = js.undefined
}
object InsertInlineSheetsChartResponse {
  
  inline def apply(): InsertInlineSheetsChartResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertInlineSheetsChartResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsertInlineSheetsChartResponse] (val x: Self) extends AnyVal {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
