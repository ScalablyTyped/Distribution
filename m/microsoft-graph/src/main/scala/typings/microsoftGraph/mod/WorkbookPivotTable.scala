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
  
  inline def apply(): WorkbookPivotTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookPivotTable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkbookPivotTable] (val x: Self) extends AnyVal {
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setWorksheet(value: NullableOption[WorkbookWorksheet]): Self = StObject.set(x, "worksheet", value.asInstanceOf[js.Any])
    
    inline def setWorksheetNull: Self = StObject.set(x, "worksheet", null)
    
    inline def setWorksheetUndefined: Self = StObject.set(x, "worksheet", js.undefined)
  }
}
