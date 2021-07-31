package typings.maximMazurokGapiClientSqladmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Columns extends StObject {
  
  /** The columns to which CSV data is imported. If not specified, all columns of the database table are loaded with CSV data. */
  var columns: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The table to which CSV data is imported. */
  var table: js.UndefOr[String] = js.undefined
}
object Columns {
  
  @scala.inline
  def apply(): Columns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Columns]
  }
  
  @scala.inline
  implicit class ColumnsMutableBuilder[Self <: Columns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
