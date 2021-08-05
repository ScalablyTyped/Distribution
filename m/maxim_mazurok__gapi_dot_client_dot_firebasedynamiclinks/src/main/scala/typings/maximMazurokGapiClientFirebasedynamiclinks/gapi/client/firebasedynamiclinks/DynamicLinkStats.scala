package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicLinkStats extends StObject {
  
  /** Dynamic Link event stats. */
  var linkEventStats: js.UndefOr[js.Array[DynamicLinkEventStat]] = js.undefined
}
object DynamicLinkStats {
  
  inline def apply(): DynamicLinkStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicLinkStats]
  }
  
  extension [Self <: DynamicLinkStats](x: Self) {
    
    inline def setLinkEventStats(value: js.Array[DynamicLinkEventStat]): Self = StObject.set(x, "linkEventStats", value.asInstanceOf[js.Any])
    
    inline def setLinkEventStatsUndefined: Self = StObject.set(x, "linkEventStats", js.undefined)
    
    inline def setLinkEventStatsVarargs(value: DynamicLinkEventStat*): Self = StObject.set(x, "linkEventStats", js.Array(value :_*))
  }
}
