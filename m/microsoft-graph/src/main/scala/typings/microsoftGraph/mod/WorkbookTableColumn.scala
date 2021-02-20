package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookTableColumn extends Entity {
  
  // Retrieve the filter applied to the column. Read-only.
  var filter: js.UndefOr[NullableOption[WorkbookFilter]] = js.native
  
  // Returns the index number of the column within the columns collection of the table. Zero-indexed. Read-only.
  var index: js.UndefOr[Double] = js.native
  
  // Returns the name of the table column.
  var name: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cell
    * that contain an error will return the error string.
    */
  var values: js.UndefOr[NullableOption[_]] = js.native
}
object WorkbookTableColumn {
  
  @scala.inline
  def apply(): WorkbookTableColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookTableColumn]
  }
  
  @scala.inline
  implicit class WorkbookTableColumnMutableBuilder[Self <: WorkbookTableColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: NullableOption[WorkbookFilter]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterNull: Self = StObject.set(x, "filter", null)
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValues(value: NullableOption[_]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesNull: Self = StObject.set(x, "values", null)
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
