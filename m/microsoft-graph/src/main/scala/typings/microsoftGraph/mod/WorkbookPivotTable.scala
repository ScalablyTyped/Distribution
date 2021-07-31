package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookPivotTable
  extends StObject
     with Entity {
  
  // Name of the PivotTable.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The worksheet containing the current PivotTable. Read-only.
  var worksheet: js.UndefOr[NullableOption[WorkbookWorksheet]] = js.undefined
}
object WorkbookPivotTable {
  
  @scala.inline
  def apply(): WorkbookPivotTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookPivotTable]
  }
  
  @scala.inline
  implicit class WorkbookPivotTableMutableBuilder[Self <: WorkbookPivotTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setWorksheet(value: NullableOption[WorkbookWorksheet]): Self = StObject.set(x, "worksheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetNull: Self = StObject.set(x, "worksheet", null)
    
    @scala.inline
    def setWorksheetUndefined: Self = StObject.set(x, "worksheet", js.undefined)
  }
}
