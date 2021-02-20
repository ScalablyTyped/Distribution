package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Workbook extends Entity {
  
  var application: js.UndefOr[NullableOption[WorkbookApplication]] = js.native
  
  var comments: js.UndefOr[NullableOption[js.Array[WorkbookComment]]] = js.native
  
  var functions: js.UndefOr[NullableOption[WorkbookFunctions]] = js.native
  
  // Represents a collection of workbook scoped named items (named ranges and constants). Read-only.
  var names: js.UndefOr[NullableOption[js.Array[WorkbookNamedItem]]] = js.native
  
  /**
    * The status of workbook operations. Getting an operation collection is not supported, but you can get the status of a
    * long-running operation if the Location header is returned in the response. Read-only.
    */
  var operations: js.UndefOr[NullableOption[js.Array[WorkbookOperation]]] = js.native
  
  // Represents a collection of tables associated with the workbook. Read-only.
  var tables: js.UndefOr[NullableOption[js.Array[WorkbookTable]]] = js.native
  
  // Represents a collection of worksheets associated with the workbook. Read-only.
  var worksheets: js.UndefOr[NullableOption[js.Array[WorkbookWorksheet]]] = js.native
}
object Workbook {
  
  @scala.inline
  def apply(): Workbook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Workbook]
  }
  
  @scala.inline
  implicit class WorkbookMutableBuilder[Self <: Workbook] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: NullableOption[WorkbookApplication]): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationNull: Self = StObject.set(x, "application", null)
    
    @scala.inline
    def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    @scala.inline
    def setComments(value: NullableOption[js.Array[WorkbookComment]]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: WorkbookComment*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setFunctions(value: NullableOption[WorkbookFunctions]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionsNull: Self = StObject.set(x, "functions", null)
    
    @scala.inline
    def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    
    @scala.inline
    def setNames(value: NullableOption[js.Array[WorkbookNamedItem]]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesNull: Self = StObject.set(x, "names", null)
    
    @scala.inline
    def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: WorkbookNamedItem*): Self = StObject.set(x, "names", js.Array(value :_*))
    
    @scala.inline
    def setOperations(value: NullableOption[js.Array[WorkbookOperation]]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsNull: Self = StObject.set(x, "operations", null)
    
    @scala.inline
    def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    @scala.inline
    def setOperationsVarargs(value: WorkbookOperation*): Self = StObject.set(x, "operations", js.Array(value :_*))
    
    @scala.inline
    def setTables(value: NullableOption[js.Array[WorkbookTable]]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesNull: Self = StObject.set(x, "tables", null)
    
    @scala.inline
    def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    @scala.inline
    def setTablesVarargs(value: WorkbookTable*): Self = StObject.set(x, "tables", js.Array(value :_*))
    
    @scala.inline
    def setWorksheets(value: NullableOption[js.Array[WorkbookWorksheet]]): Self = StObject.set(x, "worksheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetsNull: Self = StObject.set(x, "worksheets", null)
    
    @scala.inline
    def setWorksheetsUndefined: Self = StObject.set(x, "worksheets", js.undefined)
    
    @scala.inline
    def setWorksheetsVarargs(value: WorkbookWorksheet*): Self = StObject.set(x, "worksheets", js.Array(value :_*))
  }
}
