package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookWorksheet extends Entity {
  
  // Returns collection of charts that are part of the worksheet. Read-only.
  var charts: js.UndefOr[NullableOption[js.Array[WorkbookChart]]] = js.native
  
  // The display name of the worksheet.
  var name: js.UndefOr[NullableOption[String]] = js.native
  
  // Returns collection of names that are associated with the worksheet. Read-only.
  var names: js.UndefOr[NullableOption[js.Array[WorkbookNamedItem]]] = js.native
  
  // Collection of PivotTables that are part of the worksheet.
  var pivotTables: js.UndefOr[NullableOption[js.Array[WorkbookPivotTable]]] = js.native
  
  // The zero-based position of the worksheet within the workbook.
  var position: js.UndefOr[Double] = js.native
  
  // Returns sheet protection object for a worksheet. Read-only.
  var protection: js.UndefOr[NullableOption[WorkbookWorksheetProtection]] = js.native
  
  // Collection of tables that are part of the worksheet. Read-only.
  var tables: js.UndefOr[NullableOption[js.Array[WorkbookTable]]] = js.native
  
  // The Visibility of the worksheet. The possible values are: Visible, Hidden, VeryHidden.
  var visibility: js.UndefOr[String] = js.native
}
object WorkbookWorksheet {
  
  @scala.inline
  def apply(): WorkbookWorksheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookWorksheet]
  }
  
  @scala.inline
  implicit class WorkbookWorksheetMutableBuilder[Self <: WorkbookWorksheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharts(value: NullableOption[js.Array[WorkbookChart]]): Self = StObject.set(x, "charts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartsNull: Self = StObject.set(x, "charts", null)
    
    @scala.inline
    def setChartsUndefined: Self = StObject.set(x, "charts", js.undefined)
    
    @scala.inline
    def setChartsVarargs(value: WorkbookChart*): Self = StObject.set(x, "charts", js.Array(value :_*))
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNames(value: NullableOption[js.Array[WorkbookNamedItem]]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesNull: Self = StObject.set(x, "names", null)
    
    @scala.inline
    def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: WorkbookNamedItem*): Self = StObject.set(x, "names", js.Array(value :_*))
    
    @scala.inline
    def setPivotTables(value: NullableOption[js.Array[WorkbookPivotTable]]): Self = StObject.set(x, "pivotTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotTablesNull: Self = StObject.set(x, "pivotTables", null)
    
    @scala.inline
    def setPivotTablesUndefined: Self = StObject.set(x, "pivotTables", js.undefined)
    
    @scala.inline
    def setPivotTablesVarargs(value: WorkbookPivotTable*): Self = StObject.set(x, "pivotTables", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setProtection(value: NullableOption[WorkbookWorksheetProtection]): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionNull: Self = StObject.set(x, "protection", null)
    
    @scala.inline
    def setProtectionUndefined: Self = StObject.set(x, "protection", js.undefined)
    
    @scala.inline
    def setTables(value: NullableOption[js.Array[WorkbookTable]]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesNull: Self = StObject.set(x, "tables", null)
    
    @scala.inline
    def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    @scala.inline
    def setTablesVarargs(value: WorkbookTable*): Self = StObject.set(x, "tables", js.Array(value :_*))
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
