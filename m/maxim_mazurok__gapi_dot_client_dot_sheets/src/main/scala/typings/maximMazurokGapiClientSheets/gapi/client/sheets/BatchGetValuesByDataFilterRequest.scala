package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetValuesByDataFilterRequest extends js.Object {
  
  /** The data filters used to match the ranges of values to retrieve. Ranges that match any of the specified data filters are included in the response. */
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.native
  
  /**
    * How dates, times, and durations should be represented in the output. This is ignored if value_render_option is FORMATTED_VALUE. The default dateTime render option is
    * [DateTimeRenderOption.SERIAL_NUMBER].
    */
  var dateTimeRenderOption: js.UndefOr[String] = js.native
  
  /**
    * The major dimension that results should use. For example, if the spreadsheet data is: `A1=1,B1=2,A2=3,B2=4`, then a request that selects that range and sets `majorDimension=ROWS`
    * returns `[[1,2],[3,4]]`, whereas a request that sets `majorDimension=COLUMNS` returns `[[1,3],[2,4]]`.
    */
  var majorDimension: js.UndefOr[String] = js.native
  
  /** How values should be represented in the output. The default render option is ValueRenderOption.FORMATTED_VALUE. */
  var valueRenderOption: js.UndefOr[String] = js.native
}
object BatchGetValuesByDataFilterRequest {
  
  @scala.inline
  def apply(): BatchGetValuesByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetValuesByDataFilterRequest]
  }
  
  @scala.inline
  implicit class BatchGetValuesByDataFilterRequestOps[Self <: BatchGetValuesByDataFilterRequest] (val x: Self) extends AnyVal {
    
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
    def setDataFiltersVarargs(value: DataFilter*): Self = this.set("dataFilters", js.Array(value :_*))
    
    @scala.inline
    def setDataFilters(value: js.Array[DataFilter]): Self = this.set("dataFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataFilters: Self = this.set("dataFilters", js.undefined)
    
    @scala.inline
    def setDateTimeRenderOption(value: String): Self = this.set("dateTimeRenderOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateTimeRenderOption: Self = this.set("dateTimeRenderOption", js.undefined)
    
    @scala.inline
    def setMajorDimension(value: String): Self = this.set("majorDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorDimension: Self = this.set("majorDimension", js.undefined)
    
    @scala.inline
    def setValueRenderOption(value: String): Self = this.set("valueRenderOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueRenderOption: Self = this.set("valueRenderOption", js.undefined)
  }
}
