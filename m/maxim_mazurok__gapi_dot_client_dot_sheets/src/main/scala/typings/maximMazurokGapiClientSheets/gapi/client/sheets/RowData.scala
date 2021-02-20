package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowData extends StObject {
  
  /** The values in the row, one per column. */
  var values: js.UndefOr[js.Array[CellData]] = js.native
}
object RowData {
  
  @scala.inline
  def apply(): RowData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowData]
  }
  
  @scala.inline
  implicit class RowDataMutableBuilder[Self <: RowData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[CellData]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: CellData*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
