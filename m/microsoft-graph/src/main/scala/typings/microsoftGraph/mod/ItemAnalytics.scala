package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemAnalytics extends Entity {
  
  var allTime: js.UndefOr[NullableOption[ItemActivityStat]] = js.native
  
  var itemActivityStats: js.UndefOr[NullableOption[js.Array[ItemActivityStat]]] = js.native
  
  var lastSevenDays: js.UndefOr[NullableOption[ItemActivityStat]] = js.native
}
object ItemAnalytics {
  
  @scala.inline
  def apply(): ItemAnalytics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemAnalytics]
  }
  
  @scala.inline
  implicit class ItemAnalyticsMutableBuilder[Self <: ItemAnalytics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllTime(value: NullableOption[ItemActivityStat]): Self = StObject.set(x, "allTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllTimeNull: Self = StObject.set(x, "allTime", null)
    
    @scala.inline
    def setAllTimeUndefined: Self = StObject.set(x, "allTime", js.undefined)
    
    @scala.inline
    def setItemActivityStats(value: NullableOption[js.Array[ItemActivityStat]]): Self = StObject.set(x, "itemActivityStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemActivityStatsNull: Self = StObject.set(x, "itemActivityStats", null)
    
    @scala.inline
    def setItemActivityStatsUndefined: Self = StObject.set(x, "itemActivityStats", js.undefined)
    
    @scala.inline
    def setItemActivityStatsVarargs(value: ItemActivityStat*): Self = StObject.set(x, "itemActivityStats", js.Array(value :_*))
    
    @scala.inline
    def setLastSevenDays(value: NullableOption[ItemActivityStat]): Self = StObject.set(x, "lastSevenDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSevenDaysNull: Self = StObject.set(x, "lastSevenDays", null)
    
    @scala.inline
    def setLastSevenDaysUndefined: Self = StObject.set(x, "lastSevenDays", js.undefined)
  }
}
