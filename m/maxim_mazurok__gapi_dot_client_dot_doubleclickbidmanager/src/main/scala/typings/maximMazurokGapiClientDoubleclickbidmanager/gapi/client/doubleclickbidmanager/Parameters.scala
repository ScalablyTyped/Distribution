package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters extends StObject {
  
  /** Filters used to match traffic data in your report. */
  var filters: js.UndefOr[js.Array[FilterPair]] = js.undefined
  
  /** Data is grouped by the filters listed in this field. */
  var groupBys: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Deprecated. This field is no longer in use. */
  var includeInviteData: js.UndefOr[Boolean] = js.undefined
  
  /** Metrics to include as columns in your report. */
  var metrics: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Additional query options. */
  var options: js.UndefOr[Options] = js.undefined
  
  /** Report type. */
  var `type`: js.UndefOr[String] = js.undefined
}
object Parameters {
  
  inline def apply(): Parameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameters]
  }
  
  extension [Self <: Parameters](x: Self) {
    
    inline def setFilters(value: js.Array[FilterPair]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: FilterPair*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    inline def setGroupBys(value: js.Array[String]): Self = StObject.set(x, "groupBys", value.asInstanceOf[js.Any])
    
    inline def setGroupBysUndefined: Self = StObject.set(x, "groupBys", js.undefined)
    
    inline def setGroupBysVarargs(value: String*): Self = StObject.set(x, "groupBys", js.Array(value :_*))
    
    inline def setIncludeInviteData(value: Boolean): Self = StObject.set(x, "includeInviteData", value.asInstanceOf[js.Any])
    
    inline def setIncludeInviteDataUndefined: Self = StObject.set(x, "includeInviteData", js.undefined)
    
    inline def setMetrics(value: js.Array[String]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: String*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
    inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
