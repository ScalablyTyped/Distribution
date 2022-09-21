package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookWorksheet
  extends StObject
     with Entity {
  
  // Returns collection of charts that are part of the worksheet. Read-only.
  var charts: js.UndefOr[NullableOption[js.Array[WorkbookChart]]] = js.undefined
  
  // The display name of the worksheet.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Returns collection of names that are associated with the worksheet. Read-only.
  var names: js.UndefOr[NullableOption[js.Array[WorkbookNamedItem]]] = js.undefined
  
  // Collection of PivotTables that are part of the worksheet.
  var pivotTables: js.UndefOr[NullableOption[js.Array[WorkbookPivotTable]]] = js.undefined
  
  // The zero-based position of the worksheet within the workbook.
  var position: js.UndefOr[Double] = js.undefined
  
  // Returns sheet protection object for a worksheet. Read-only.
  var protection: js.UndefOr[NullableOption[WorkbookWorksheetProtection]] = js.undefined
  
  // Collection of tables that are part of the worksheet. Read-only.
  var tables: js.UndefOr[NullableOption[js.Array[WorkbookTable]]] = js.undefined
  
  // The Visibility of the worksheet. The possible values are: Visible, Hidden, VeryHidden.
  var visibility: js.UndefOr[String] = js.undefined
}
object WorkbookWorksheet {
  
  inline def apply(): WorkbookWorksheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookWorksheet]
  }
  
  extension [Self <: WorkbookWorksheet](x: Self) {
    
    inline def setCharts(value: NullableOption[js.Array[WorkbookChart]]): Self = StObject.set(x, "charts", value.asInstanceOf[js.Any])
    
    inline def setChartsNull: Self = StObject.set(x, "charts", null)
    
    inline def setChartsUndefined: Self = StObject.set(x, "charts", js.undefined)
    
    inline def setChartsVarargs(value: WorkbookChart*): Self = StObject.set(x, "charts", js.Array(value*))
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNames(value: NullableOption[js.Array[WorkbookNamedItem]]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesNull: Self = StObject.set(x, "names", null)
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: WorkbookNamedItem*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setPivotTables(value: NullableOption[js.Array[WorkbookPivotTable]]): Self = StObject.set(x, "pivotTables", value.asInstanceOf[js.Any])
    
    inline def setPivotTablesNull: Self = StObject.set(x, "pivotTables", null)
    
    inline def setPivotTablesUndefined: Self = StObject.set(x, "pivotTables", js.undefined)
    
    inline def setPivotTablesVarargs(value: WorkbookPivotTable*): Self = StObject.set(x, "pivotTables", js.Array(value*))
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setProtection(value: NullableOption[WorkbookWorksheetProtection]): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    inline def setProtectionNull: Self = StObject.set(x, "protection", null)
    
    inline def setProtectionUndefined: Self = StObject.set(x, "protection", js.undefined)
    
    inline def setTables(value: NullableOption[js.Array[WorkbookTable]]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    inline def setTablesNull: Self = StObject.set(x, "tables", null)
    
    inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    inline def setTablesVarargs(value: WorkbookTable*): Self = StObject.set(x, "tables", js.Array(value*))
    
    inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
