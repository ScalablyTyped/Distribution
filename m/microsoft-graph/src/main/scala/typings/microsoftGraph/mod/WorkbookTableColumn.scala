package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookTableColumn
  extends StObject
     with Entity {
  
  // Retrieve the filter applied to the column. Read-only.
  var filter: js.UndefOr[NullableOption[WorkbookFilter]] = js.undefined
  
  // Returns the index number of the column within the columns collection of the table. Zero-indexed. Read-only.
  var index: js.UndefOr[Double] = js.undefined
  
  // Returns the name of the table column.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cell
    * that contain an error will return the error string.
    */
  var values: js.UndefOr[NullableOption[js.Any]] = js.undefined
}
object WorkbookTableColumn {
  
  inline def apply(): WorkbookTableColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookTableColumn]
  }
  
  extension [Self <: WorkbookTableColumn](x: Self) {
    
    inline def setFilter(value: NullableOption[WorkbookFilter]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValues(value: NullableOption[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
