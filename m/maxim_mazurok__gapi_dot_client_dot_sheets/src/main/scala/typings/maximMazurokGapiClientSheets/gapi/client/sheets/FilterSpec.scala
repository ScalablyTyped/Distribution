package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterSpec extends js.Object {
  
  /** The column index. */
  var columnIndex: js.UndefOr[Double] = js.native
  
  /** Reference to a data source column. */
  var dataSourceColumnReference: js.UndefOr[DataSourceColumnReference] = js.native
  
  /** The criteria for the column. */
  var filterCriteria: js.UndefOr[FilterCriteria] = js.native
}
object FilterSpec {
  
  @scala.inline
  def apply(): FilterSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterSpec]
  }
  
  @scala.inline
  implicit class FilterSpecOps[Self <: FilterSpec] (val x: Self) extends AnyVal {
    
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
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnIndex: Self = this.set("columnIndex", js.undefined)
    
    @scala.inline
    def setDataSourceColumnReference(value: DataSourceColumnReference): Self = this.set("dataSourceColumnReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceColumnReference: Self = this.set("dataSourceColumnReference", js.undefined)
    
    @scala.inline
    def setFilterCriteria(value: FilterCriteria): Self = this.set("filterCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterCriteria: Self = this.set("filterCriteria", js.undefined)
  }
}
