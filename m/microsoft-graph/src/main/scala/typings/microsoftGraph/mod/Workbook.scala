package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Workbook
  extends StObject
     with Entity {
  
  var application: js.UndefOr[NullableOption[WorkbookApplication]] = js.undefined
  
  var comments: js.UndefOr[NullableOption[js.Array[WorkbookComment]]] = js.undefined
  
  var functions: js.UndefOr[NullableOption[WorkbookFunctions]] = js.undefined
  
  // Represents a collection of workbooks scoped named items (named ranges and constants). Read-only.
  var names: js.UndefOr[NullableOption[js.Array[WorkbookNamedItem]]] = js.undefined
  
  /**
    * The status of workbook operations. Getting an operation collection is not supported, but you can get the status of a
    * long-running operation if the Location header is returned in the response. Read-only.
    */
  var operations: js.UndefOr[NullableOption[js.Array[WorkbookOperation]]] = js.undefined
  
  // Represents a collection of tables associated with the workbook. Read-only.
  var tables: js.UndefOr[NullableOption[js.Array[WorkbookTable]]] = js.undefined
  
  // Represents a collection of worksheets associated with the workbook. Read-only.
  var worksheets: js.UndefOr[NullableOption[js.Array[WorkbookWorksheet]]] = js.undefined
}
object Workbook {
  
  inline def apply(): Workbook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Workbook]
  }
  
  extension [Self <: Workbook](x: Self) {
    
    inline def setApplication(value: NullableOption[WorkbookApplication]): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationNull: Self = StObject.set(x, "application", null)
    
    inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    inline def setComments(value: NullableOption[js.Array[WorkbookComment]]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: WorkbookComment*): Self = StObject.set(x, "comments", js.Array(value*))
    
    inline def setFunctions(value: NullableOption[WorkbookFunctions]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    inline def setFunctionsNull: Self = StObject.set(x, "functions", null)
    
    inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    
    inline def setNames(value: NullableOption[js.Array[WorkbookNamedItem]]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesNull: Self = StObject.set(x, "names", null)
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: WorkbookNamedItem*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setOperations(value: NullableOption[js.Array[WorkbookOperation]]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsNull: Self = StObject.set(x, "operations", null)
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: WorkbookOperation*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setTables(value: NullableOption[js.Array[WorkbookTable]]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    inline def setTablesNull: Self = StObject.set(x, "tables", null)
    
    inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    inline def setTablesVarargs(value: WorkbookTable*): Self = StObject.set(x, "tables", js.Array(value*))
    
    inline def setWorksheets(value: NullableOption[js.Array[WorkbookWorksheet]]): Self = StObject.set(x, "worksheets", value.asInstanceOf[js.Any])
    
    inline def setWorksheetsNull: Self = StObject.set(x, "worksheets", null)
    
    inline def setWorksheetsUndefined: Self = StObject.set(x, "worksheets", js.undefined)
    
    inline def setWorksheetsVarargs(value: WorkbookWorksheet*): Self = StObject.set(x, "worksheets", js.Array(value*))
  }
}
