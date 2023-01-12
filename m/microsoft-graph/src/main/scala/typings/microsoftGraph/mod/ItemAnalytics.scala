package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemAnalytics
  extends StObject
     with Entity {
  
  var allTime: js.UndefOr[NullableOption[ItemActivityStat]] = js.undefined
  
  var itemActivityStats: js.UndefOr[NullableOption[js.Array[ItemActivityStat]]] = js.undefined
  
  var lastSevenDays: js.UndefOr[NullableOption[ItemActivityStat]] = js.undefined
}
object ItemAnalytics {
  
  inline def apply(): ItemAnalytics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemAnalytics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemAnalytics] (val x: Self) extends AnyVal {
    
    inline def setAllTime(value: NullableOption[ItemActivityStat]): Self = StObject.set(x, "allTime", value.asInstanceOf[js.Any])
    
    inline def setAllTimeNull: Self = StObject.set(x, "allTime", null)
    
    inline def setAllTimeUndefined: Self = StObject.set(x, "allTime", js.undefined)
    
    inline def setItemActivityStats(value: NullableOption[js.Array[ItemActivityStat]]): Self = StObject.set(x, "itemActivityStats", value.asInstanceOf[js.Any])
    
    inline def setItemActivityStatsNull: Self = StObject.set(x, "itemActivityStats", null)
    
    inline def setItemActivityStatsUndefined: Self = StObject.set(x, "itemActivityStats", js.undefined)
    
    inline def setItemActivityStatsVarargs(value: ItemActivityStat*): Self = StObject.set(x, "itemActivityStats", js.Array(value*))
    
    inline def setLastSevenDays(value: NullableOption[ItemActivityStat]): Self = StObject.set(x, "lastSevenDays", value.asInstanceOf[js.Any])
    
    inline def setLastSevenDaysNull: Self = StObject.set(x, "lastSevenDays", null)
    
    inline def setLastSevenDaysUndefined: Self = StObject.set(x, "lastSevenDays", js.undefined)
  }
}
