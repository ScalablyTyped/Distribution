package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Table extends StObject {
  
  /** Number of columns in the table. It is possible for a table to be non-rectangular, so some rows may have a different number of cells. */
  var columns: js.UndefOr[Double] = js.native
  
  /** Number of rows in the table. */
  var rows: js.UndefOr[Double] = js.native
  
  /** The suggested deletion IDs. If empty, then there are no suggested deletions of this content. */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  
  /** The suggested insertion IDs. A Table may have multiple insertion IDs if it is a nested suggested change. If empty, then this is not a suggested insertion. */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.native
  
  /** The contents and style of each row. */
  var tableRows: js.UndefOr[js.Array[TableRow]] = js.native
  
  /** The style of the table. */
  var tableStyle: js.UndefOr[TableStyle] = js.native
}
object Table {
  
  @scala.inline
  def apply(): Table = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table]
  }
  
  @scala.inline
  implicit class TableMutableBuilder[Self <: Table] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
    
    @scala.inline
    def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value :_*))
    
    @scala.inline
    def setSuggestedInsertionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedInsertionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedInsertionIdsUndefined: Self = StObject.set(x, "suggestedInsertionIds", js.undefined)
    
    @scala.inline
    def setSuggestedInsertionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedInsertionIds", js.Array(value :_*))
    
    @scala.inline
    def setTableRows(value: js.Array[TableRow]): Self = StObject.set(x, "tableRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableRowsUndefined: Self = StObject.set(x, "tableRows", js.undefined)
    
    @scala.inline
    def setTableRowsVarargs(value: TableRow*): Self = StObject.set(x, "tableRows", js.Array(value :_*))
    
    @scala.inline
    def setTableStyle(value: TableStyle): Self = StObject.set(x, "tableStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableStyleUndefined: Self = StObject.set(x, "tableStyle", js.undefined)
  }
}
