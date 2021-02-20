package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTableRowPropertiesRequest extends StObject {
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `tableRowProperties` is implied and should not be specified. A single `"*"` can be used as
    * short-hand for listing every field. For example to update the minimum row height, set `fields` to `"min_row_height"`. If '"min_row_height"' is included in the field mask but the
    * property is left unset, the minimum row height will default to 0.
    */
  var fields: js.UndefOr[String] = js.native
  
  /** The object ID of the table. */
  var objectId: js.UndefOr[String] = js.native
  
  /** The list of zero-based indices specifying which rows to update. If no indices are provided, all rows in the table will be updated. */
  var rowIndices: js.UndefOr[js.Array[Double]] = js.native
  
  /** The table row properties to update. */
  var tableRowProperties: js.UndefOr[TableRowProperties] = js.native
}
object UpdateTableRowPropertiesRequest {
  
  @scala.inline
  def apply(): UpdateTableRowPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTableRowPropertiesRequest]
  }
  
  @scala.inline
  implicit class UpdateTableRowPropertiesRequestMutableBuilder[Self <: UpdateTableRowPropertiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setRowIndices(value: js.Array[Double]): Self = StObject.set(x, "rowIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndicesUndefined: Self = StObject.set(x, "rowIndices", js.undefined)
    
    @scala.inline
    def setRowIndicesVarargs(value: Double*): Self = StObject.set(x, "rowIndices", js.Array(value :_*))
    
    @scala.inline
    def setTableRowProperties(value: TableRowProperties): Self = StObject.set(x, "tableRowProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableRowPropertiesUndefined: Self = StObject.set(x, "tableRowProperties", js.undefined)
  }
}
