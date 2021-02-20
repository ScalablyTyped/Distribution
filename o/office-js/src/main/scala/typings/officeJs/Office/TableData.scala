package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the data in a table or an {@link Office.TableBinding}.
  */
@js.native
trait TableData extends StObject {
  
  /**
    * Gets or sets the headers of the table.
    * 
    * @remarks
    *
    * To specify headers, you must specify an array of arrays that corresponds to the structure of the table. For example, to specify headers 
    * for a two-column table you would set the header property to [['header1', 'header2']].
    *
    * If you specify null for the headers property (or leaving the property empty when you construct a TableData object), the following results 
    * occur when your code executes:
    *
    * - If you insert a new table, the default column headers for the table are created.
    *
    * - If you overwrite or update an existing table, the existing headers are not altered.
    */
  var headers: js.Array[_] = js.native
  
  /**
    * Gets or sets the rows in the table. Returns an array of arrays that contains the data in the table. 
    * Returns an empty array if there are no rows.
    * 
    * @remarks
    *
    * To specify rows, you must specify an array of arrays that corresponds to the structure of the table. For example, to specify two rows of 
    * string values in a two-column table you would set the rows property to [['a', 'b'], ['c', 'd']].
    *
    * If you specify null for the rows property (or leave the property empty when you construct a TableData object), the following results occur 
    * when your code executes:
    *
    * - If you insert a new table, a blank row will be inserted.
    *
    * - If you overwrite or update an existing table, the existing rows are not altered.
    */
  var rows: js.Array[js.Array[_]] = js.native
}
object TableData {
  
  @scala.inline
  def apply(headers: js.Array[_], rows: js.Array[js.Array[_]]): TableData = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableData]
  }
  
  @scala.inline
  implicit class TableDataMutableBuilder[Self <: TableData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Array[_]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersVarargs(value: js.Any*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[js.Array[_]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
