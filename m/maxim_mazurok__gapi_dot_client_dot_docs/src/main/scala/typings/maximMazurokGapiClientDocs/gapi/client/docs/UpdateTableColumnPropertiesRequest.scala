package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTableColumnPropertiesRequest extends StObject {
  
  /** The list of zero-based column indices whose property should be updated. If no indices are specified, all columns will be updated. */
  var columnIndices: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `tableColumnProperties` is implied and should not be specified. A single `"*"` can be used as
    * short-hand for listing every field. For example to update the column width, set `fields` to `"width"`.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /** The table column properties to update. If the value of `table_column_properties#width` is less than 5 points (5/72 inch), a 400 bad request error is returned. */
  var tableColumnProperties: js.UndefOr[TableColumnProperties] = js.undefined
  
  /** The location where the table starts in the document. */
  var tableStartLocation: js.UndefOr[Location] = js.undefined
}
object UpdateTableColumnPropertiesRequest {
  
  inline def apply(): UpdateTableColumnPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTableColumnPropertiesRequest]
  }
  
  extension [Self <: UpdateTableColumnPropertiesRequest](x: Self) {
    
    inline def setColumnIndices(value: js.Array[Double]): Self = StObject.set(x, "columnIndices", value.asInstanceOf[js.Any])
    
    inline def setColumnIndicesUndefined: Self = StObject.set(x, "columnIndices", js.undefined)
    
    inline def setColumnIndicesVarargs(value: Double*): Self = StObject.set(x, "columnIndices", js.Array(value*))
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setTableColumnProperties(value: TableColumnProperties): Self = StObject.set(x, "tableColumnProperties", value.asInstanceOf[js.Any])
    
    inline def setTableColumnPropertiesUndefined: Self = StObject.set(x, "tableColumnProperties", js.undefined)
    
    inline def setTableStartLocation(value: Location): Self = StObject.set(x, "tableStartLocation", value.asInstanceOf[js.Any])
    
    inline def setTableStartLocationUndefined: Self = StObject.set(x, "tableStartLocation", js.undefined)
  }
}
