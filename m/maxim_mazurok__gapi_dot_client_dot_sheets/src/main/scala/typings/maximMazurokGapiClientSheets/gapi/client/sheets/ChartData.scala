package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartData extends StObject {
  
  /** The aggregation type for the series of a data source chart. Not supported for regular charts. */
  var aggregateType: js.UndefOr[String] = js.undefined
  
  /** The reference to the data source column that the data reads from. */
  var columnReference: js.UndefOr[DataSourceColumnReference] = js.undefined
  
  /** The rule to group the data by if the ChartData backs the domain of a data source chart. Not supported for regular charts. */
  var groupRule: js.UndefOr[ChartGroupRule] = js.undefined
  
  /** The source ranges of the data. */
  var sourceRange: js.UndefOr[ChartSourceRange] = js.undefined
}
object ChartData {
  
  inline def apply(): ChartData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartData]
  }
  
  extension [Self <: ChartData](x: Self) {
    
    inline def setAggregateType(value: String): Self = StObject.set(x, "aggregateType", value.asInstanceOf[js.Any])
    
    inline def setAggregateTypeUndefined: Self = StObject.set(x, "aggregateType", js.undefined)
    
    inline def setColumnReference(value: DataSourceColumnReference): Self = StObject.set(x, "columnReference", value.asInstanceOf[js.Any])
    
    inline def setColumnReferenceUndefined: Self = StObject.set(x, "columnReference", js.undefined)
    
    inline def setGroupRule(value: ChartGroupRule): Self = StObject.set(x, "groupRule", value.asInstanceOf[js.Any])
    
    inline def setGroupRuleUndefined: Self = StObject.set(x, "groupRule", js.undefined)
    
    inline def setSourceRange(value: ChartSourceRange): Self = StObject.set(x, "sourceRange", value.asInstanceOf[js.Any])
    
    inline def setSourceRangeUndefined: Self = StObject.set(x, "sourceRange", js.undefined)
  }
}
