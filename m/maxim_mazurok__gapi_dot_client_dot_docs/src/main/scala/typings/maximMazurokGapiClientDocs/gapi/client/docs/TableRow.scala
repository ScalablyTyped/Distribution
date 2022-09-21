package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableRow extends StObject {
  
  /** The zero-based end index of this row, exclusive, in UTF-16 code units. */
  var endIndex: js.UndefOr[Double] = js.undefined
  
  /** The zero-based start index of this row, in UTF-16 code units. */
  var startIndex: js.UndefOr[Double] = js.undefined
  
  /** The suggested deletion IDs. If empty, then there are no suggested deletions of this content. */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The suggested insertion IDs. A TableRow may have multiple insertion IDs if it is a nested suggested change. If empty, then this is not a suggested insertion. */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The suggested style changes to this row, keyed by suggestion ID. */
  var suggestedTableRowStyleChanges: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedTableRowStyle}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.TableRow & TopLevel[Any]
  ] = js.undefined
  
  /**
    * The contents and style of each cell in this row. It is possible for a table to be non-rectangular, so some rows may have a different number of cells than other rows in the same
    * table.
    */
  var tableCells: js.UndefOr[js.Array[TableCell]] = js.undefined
  
  /** The style of the table row. */
  var tableRowStyle: js.UndefOr[TableRowStyle] = js.undefined
}
object TableRow {
  
  inline def apply(): TableRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRow]
  }
  
  extension [Self <: TableRow](x: Self) {
    
    inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
    
    inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value*))
    
    inline def setSuggestedInsertionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedInsertionIds", value.asInstanceOf[js.Any])
    
    inline def setSuggestedInsertionIdsUndefined: Self = StObject.set(x, "suggestedInsertionIds", js.undefined)
    
    inline def setSuggestedInsertionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedInsertionIds", js.Array(value*))
    
    inline def setSuggestedTableRowStyleChanges(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedTableRowStyle}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.TableRow & TopLevel[Any]
    ): Self = StObject.set(x, "suggestedTableRowStyleChanges", value.asInstanceOf[js.Any])
    
    inline def setSuggestedTableRowStyleChangesUndefined: Self = StObject.set(x, "suggestedTableRowStyleChanges", js.undefined)
    
    inline def setTableCells(value: js.Array[TableCell]): Self = StObject.set(x, "tableCells", value.asInstanceOf[js.Any])
    
    inline def setTableCellsUndefined: Self = StObject.set(x, "tableCells", js.undefined)
    
    inline def setTableCellsVarargs(value: TableCell*): Self = StObject.set(x, "tableCells", js.Array(value*))
    
    inline def setTableRowStyle(value: TableRowStyle): Self = StObject.set(x, "tableRowStyle", value.asInstanceOf[js.Any])
    
    inline def setTableRowStyleUndefined: Self = StObject.set(x, "tableRowStyle", js.undefined)
  }
}
