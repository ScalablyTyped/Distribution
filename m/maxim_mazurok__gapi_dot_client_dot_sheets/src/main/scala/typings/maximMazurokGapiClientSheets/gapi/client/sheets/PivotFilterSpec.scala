package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotFilterSpec extends js.Object {
  
  /** The column offset of the source range. */
  var columnOffsetIndex: js.UndefOr[Double] = js.native
  
  /** The reference to the data source column. */
  var dataSourceColumnReference: js.UndefOr[DataSourceColumnReference] = js.native
  
  /** The criteria for the column. */
  var filterCriteria: js.UndefOr[PivotFilterCriteria] = js.native
}
object PivotFilterSpec {
  
  @scala.inline
  def apply(): PivotFilterSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotFilterSpec]
  }
  
  @scala.inline
  implicit class PivotFilterSpecOps[Self <: PivotFilterSpec] (val x: Self) extends AnyVal {
    
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
    def setColumnOffsetIndex(value: Double): Self = this.set("columnOffsetIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnOffsetIndex: Self = this.set("columnOffsetIndex", js.undefined)
    
    @scala.inline
    def setDataSourceColumnReference(value: DataSourceColumnReference): Self = this.set("dataSourceColumnReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceColumnReference: Self = this.set("dataSourceColumnReference", js.undefined)
    
    @scala.inline
    def setFilterCriteria(value: PivotFilterCriteria): Self = this.set("filterCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterCriteria: Self = this.set("filterCriteria", js.undefined)
  }
}
