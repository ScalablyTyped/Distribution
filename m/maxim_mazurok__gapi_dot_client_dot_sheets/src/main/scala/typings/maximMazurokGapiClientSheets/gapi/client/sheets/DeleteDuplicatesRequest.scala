package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDuplicatesRequest extends js.Object {
  
  /** The columns in the range to analyze for duplicate values. If no columns are selected then all columns are analyzed for duplicates. */
  var comparisonColumns: js.UndefOr[js.Array[DimensionRange]] = js.native
  
  /** The range to remove duplicates rows from. */
  var range: js.UndefOr[GridRange] = js.native
}
object DeleteDuplicatesRequest {
  
  @scala.inline
  def apply(): DeleteDuplicatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDuplicatesRequest]
  }
  
  @scala.inline
  implicit class DeleteDuplicatesRequestOps[Self <: DeleteDuplicatesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComparisonColumnsVarargs(value: DimensionRange*): Self = this.set("comparisonColumns", js.Array(value :_*))
    
    @scala.inline
    def setComparisonColumns(value: js.Array[DimensionRange]): Self = this.set("comparisonColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparisonColumns: Self = this.set("comparisonColumns", js.undefined)
    
    @scala.inline
    def setRange(value: GridRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
