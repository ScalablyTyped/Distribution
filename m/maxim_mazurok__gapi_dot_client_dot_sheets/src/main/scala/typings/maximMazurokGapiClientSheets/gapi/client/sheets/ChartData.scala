package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartData extends StObject {
  
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
  implicit class ChartDataMutableBuilder[Self <: ChartData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregateType(value: String): Self = StObject.set(x, "aggregateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateTypeUndefined: Self = StObject.set(x, "aggregateType", js.undefined)
    
    @scala.inline
    def setColumnReference(value: DataSourceColumnReference): Self = StObject.set(x, "columnReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnReferenceUndefined: Self = StObject.set(x, "columnReference", js.undefined)
    
    @scala.inline
    def setGroupRule(value: ChartGroupRule): Self = StObject.set(x, "groupRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupRuleUndefined: Self = StObject.set(x, "groupRule", js.undefined)
    
    @scala.inline
    def setSourceRange(value: ChartSourceRange): Self = StObject.set(x, "sourceRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRangeUndefined: Self = StObject.set(x, "sourceRange", js.undefined)
  }
}
