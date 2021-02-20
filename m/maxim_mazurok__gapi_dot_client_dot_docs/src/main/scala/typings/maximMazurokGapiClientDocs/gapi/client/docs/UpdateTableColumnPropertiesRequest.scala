package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTableColumnPropertiesRequest extends StObject {
  
  /** The list of zero-based column indices whose property should be updated. If no indices are specified, all columns will be updated. */
  var columnIndices: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `tableColumnProperties` is implied and should not be specified. A single `"*"` can be used as
    * short-hand for listing every field. For example to update the column width, set `fields` to `"width"`.
    */
  var fields: js.UndefOr[String] = js.native
  
  /** The table column properties to update. If the value of `table_column_properties#width` is less than 5 points (5/72 inch), a 400 bad request error is returned. */
  var tableColumnProperties: js.UndefOr[TableColumnProperties] = js.native
  
  /** The location where the table starts in the document. */
  var tableStartLocation: js.UndefOr[Location] = js.native
}
object UpdateTableColumnPropertiesRequest {
  
  @scala.inline
  def apply(): UpdateTableColumnPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTableColumnPropertiesRequest]
  }
  
  @scala.inline
  implicit class UpdateTableColumnPropertiesRequestMutableBuilder[Self <: UpdateTableColumnPropertiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnIndices(value: js.Array[Double]): Self = StObject.set(x, "columnIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndicesUndefined: Self = StObject.set(x, "columnIndices", js.undefined)
    
    @scala.inline
    def setColumnIndicesVarargs(value: Double*): Self = StObject.set(x, "columnIndices", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setTableColumnProperties(value: TableColumnProperties): Self = StObject.set(x, "tableColumnProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableColumnPropertiesUndefined: Self = StObject.set(x, "tableColumnProperties", js.undefined)
    
    @scala.inline
    def setTableStartLocation(value: Location): Self = StObject.set(x, "tableStartLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableStartLocationUndefined: Self = StObject.set(x, "tableStartLocation", js.undefined)
  }
}
