package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTableRowPropertiesRequest extends StObject {
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `tableRowProperties` is implied and should not be specified. A single `"*"` can be used as
    * short-hand for listing every field. For example to update the minimum row height, set `fields` to `"min_row_height"`. If '"min_row_height"' is included in the field mask but the
    * property is left unset, the minimum row height will default to 0.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /** The object ID of the table. */
  var objectId: js.UndefOr[String] = js.undefined
  
  /** The list of zero-based indices specifying which rows to update. If no indices are provided, all rows in the table will be updated. */
  var rowIndices: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** The table row properties to update. */
  var tableRowProperties: js.UndefOr[TableRowProperties] = js.undefined
}
object UpdateTableRowPropertiesRequest {
  
  inline def apply(): UpdateTableRowPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTableRowPropertiesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTableRowPropertiesRequest] (val x: Self) extends AnyVal {
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setRowIndices(value: js.Array[Double]): Self = StObject.set(x, "rowIndices", value.asInstanceOf[js.Any])
    
    inline def setRowIndicesUndefined: Self = StObject.set(x, "rowIndices", js.undefined)
    
    inline def setRowIndicesVarargs(value: Double*): Self = StObject.set(x, "rowIndices", js.Array(value*))
    
    inline def setTableRowProperties(value: TableRowProperties): Self = StObject.set(x, "tableRowProperties", value.asInstanceOf[js.Any])
    
    inline def setTableRowPropertiesUndefined: Self = StObject.set(x, "tableRowProperties", js.undefined)
  }
}
