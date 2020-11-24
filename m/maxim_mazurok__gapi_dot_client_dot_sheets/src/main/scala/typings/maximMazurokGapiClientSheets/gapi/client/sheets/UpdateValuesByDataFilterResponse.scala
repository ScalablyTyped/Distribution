package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateValuesByDataFilterResponse extends js.Object {
  
  /** The data filter that selected the range that was updated. */
  var dataFilter: js.UndefOr[DataFilter] = js.native
  
  /** The number of cells updated. */
  var updatedCells: js.UndefOr[Double] = js.native
  
  /** The number of columns where at least one cell in the column was updated. */
  var updatedColumns: js.UndefOr[Double] = js.native
  
  /** The values of the cells in the range matched by the dataFilter after all updates were applied. This is only included if the request's `includeValuesInResponse` field was `true`. */
  var updatedData: js.UndefOr[ValueRange] = js.native
  
  /** The range (in A1 notation) that updates were applied to. */
  var updatedRange: js.UndefOr[String] = js.native
  
  /** The number of rows where at least one cell in the row was updated. */
  var updatedRows: js.UndefOr[Double] = js.native
}
object UpdateValuesByDataFilterResponse {
  
  @scala.inline
  def apply(): UpdateValuesByDataFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateValuesByDataFilterResponse]
  }
  
  @scala.inline
  implicit class UpdateValuesByDataFilterResponseOps[Self <: UpdateValuesByDataFilterResponse] (val x: Self) extends AnyVal {
    
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
    def setDataFilter(value: DataFilter): Self = this.set("dataFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataFilter: Self = this.set("dataFilter", js.undefined)
    
    @scala.inline
    def setUpdatedCells(value: Double): Self = this.set("updatedCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedCells: Self = this.set("updatedCells", js.undefined)
    
    @scala.inline
    def setUpdatedColumns(value: Double): Self = this.set("updatedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedColumns: Self = this.set("updatedColumns", js.undefined)
    
    @scala.inline
    def setUpdatedData(value: ValueRange): Self = this.set("updatedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedData: Self = this.set("updatedData", js.undefined)
    
    @scala.inline
    def setUpdatedRange(value: String): Self = this.set("updatedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedRange: Self = this.set("updatedRange", js.undefined)
    
    @scala.inline
    def setUpdatedRows(value: Double): Self = this.set("updatedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedRows: Self = this.set("updatedRows", js.undefined)
  }
}
