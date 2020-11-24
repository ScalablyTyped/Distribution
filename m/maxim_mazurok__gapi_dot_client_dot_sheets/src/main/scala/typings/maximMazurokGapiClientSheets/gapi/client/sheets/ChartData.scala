package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartData extends js.Object {
  
  /** The aggregation type for the series of a data source chart. Not supported for regular charts. */
  var aggregateType: js.UndefOr[String] = js.native
  
  /** The reference to the data source column that the data reads from. */
  var columnReference: js.UndefOr[DataSourceColumnReference] = js.native
  
  /** The rule to group the data by if the ChartData backs the domain of a data source chart. Not supported for regular charts. */
  var groupRule: js.UndefOr[ChartGroupRule] = js.native
  
  /** The source ranges of the data. */
  var sourceRange: js.UndefOr[ChartSourceRange] = js.native
}
object ChartData {
  
  @scala.inline
  def apply(): ChartData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartData]
  }
  
  @scala.inline
  implicit class ChartDataOps[Self <: ChartData] (val x: Self) extends AnyVal {
    
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
    def setAggregateType(value: String): Self = this.set("aggregateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregateType: Self = this.set("aggregateType", js.undefined)
    
    @scala.inline
    def setColumnReference(value: DataSourceColumnReference): Self = this.set("columnReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnReference: Self = this.set("columnReference", js.undefined)
    
    @scala.inline
    def setGroupRule(value: ChartGroupRule): Self = this.set("groupRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupRule: Self = this.set("groupRule", js.undefined)
    
    @scala.inline
    def setSourceRange(value: ChartSourceRange): Self = this.set("sourceRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceRange: Self = this.set("sourceRange", js.undefined)
  }
}
