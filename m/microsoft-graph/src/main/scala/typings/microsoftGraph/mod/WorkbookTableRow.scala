package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookTableRow extends Entity {
  
  // Returns the index number of the row within the rows collection of the table. Zero-indexed. Read-only.
  var index: js.UndefOr[Double] = js.native
  
  /**
    * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cell
    * that contain an error will return the error string.
    */
  var values: js.UndefOr[NullableOption[_]] = js.native
}
object WorkbookTableRow {
  
  @scala.inline
  def apply(): WorkbookTableRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookTableRow]
  }
  
  @scala.inline
  implicit class WorkbookTableRowMutableBuilder[Self <: WorkbookTableRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setValues(value: NullableOption[_]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesNull: Self = StObject.set(x, "values", null)
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
