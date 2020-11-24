package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSource extends js.Object {
  
  /** All calculated columns in the data source. */
  var calculatedColumns: js.UndefOr[js.Array[DataSourceColumn]] = js.native
  
  /** The spreadsheet-scoped unique ID that identifies the data source. Example: 1080547365. */
  var dataSourceId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Sheet connected with the data source. The field cannot be changed once set. When creating a data source, an associated DATA_SOURCE sheet is also created, if the field
    * is not specified, the ID of the created sheet will be randomly generated.
    */
  var sheetId: js.UndefOr[Double] = js.native
  
  /** The DataSourceSpec for the data source connected with this spreadsheet. */
  var spec: js.UndefOr[DataSourceSpec] = js.native
}
object DataSource {
  
  @scala.inline
  def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  
  @scala.inline
  implicit class DataSourceOps[Self <: DataSource] (val x: Self) extends AnyVal {
    
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
    def setCalculatedColumnsVarargs(value: DataSourceColumn*): Self = this.set("calculatedColumns", js.Array(value :_*))
    
    @scala.inline
    def setCalculatedColumns(value: js.Array[DataSourceColumn]): Self = this.set("calculatedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalculatedColumns: Self = this.set("calculatedColumns", js.undefined)
    
    @scala.inline
    def setDataSourceId(value: String): Self = this.set("dataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceId: Self = this.set("dataSourceId", js.undefined)
    
    @scala.inline
    def setSheetId(value: Double): Self = this.set("sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetId: Self = this.set("sheetId", js.undefined)
    
    @scala.inline
    def setSpec(value: DataSourceSpec): Self = this.set("spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpec: Self = this.set("spec", js.undefined)
  }
}
