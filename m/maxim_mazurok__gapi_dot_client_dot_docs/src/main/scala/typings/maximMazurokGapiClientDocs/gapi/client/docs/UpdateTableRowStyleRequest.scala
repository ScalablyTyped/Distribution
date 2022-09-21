package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTableRowStyleRequest extends StObject {
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `tableRowStyle` is implied and should not be specified. A single `"*"` can be used as short-hand
    * for listing every field. For example to update the minimum row height, set `fields` to `"min_row_height"`.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /** The list of zero-based row indices whose style should be updated. If no indices are specified, all rows will be updated. */
  var rowIndices: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** The styles to be set on the rows. */
  var tableRowStyle: js.UndefOr[TableRowStyle] = js.undefined
  
  /** The location where the table starts in the document. */
  var tableStartLocation: js.UndefOr[Location] = js.undefined
}
object UpdateTableRowStyleRequest {
  
  inline def apply(): UpdateTableRowStyleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTableRowStyleRequest]
  }
  
  extension [Self <: UpdateTableRowStyleRequest](x: Self) {
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setRowIndices(value: js.Array[Double]): Self = StObject.set(x, "rowIndices", value.asInstanceOf[js.Any])
    
    inline def setRowIndicesUndefined: Self = StObject.set(x, "rowIndices", js.undefined)
    
    inline def setRowIndicesVarargs(value: Double*): Self = StObject.set(x, "rowIndices", js.Array(value*))
    
    inline def setTableRowStyle(value: TableRowStyle): Self = StObject.set(x, "tableRowStyle", value.asInstanceOf[js.Any])
    
    inline def setTableRowStyleUndefined: Self = StObject.set(x, "tableRowStyle", js.undefined)
    
    inline def setTableStartLocation(value: Location): Self = StObject.set(x, "tableStartLocation", value.asInstanceOf[js.Any])
    
    inline def setTableStartLocationUndefined: Self = StObject.set(x, "tableStartLocation", js.undefined)
  }
}
