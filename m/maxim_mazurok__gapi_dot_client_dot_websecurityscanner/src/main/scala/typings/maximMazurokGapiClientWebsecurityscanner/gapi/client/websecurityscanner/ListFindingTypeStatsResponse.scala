package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFindingTypeStatsResponse extends StObject {
  
  /** The list of FindingTypeStats returned. */
  var findingTypeStats: js.UndefOr[js.Array[FindingTypeStats]] = js.undefined
}
object ListFindingTypeStatsResponse {
  
  inline def apply(): ListFindingTypeStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFindingTypeStatsResponse]
  }
  
  extension [Self <: ListFindingTypeStatsResponse](x: Self) {
    
    inline def setFindingTypeStats(value: js.Array[FindingTypeStats]): Self = StObject.set(x, "findingTypeStats", value.asInstanceOf[js.Any])
    
    inline def setFindingTypeStatsUndefined: Self = StObject.set(x, "findingTypeStats", js.undefined)
    
    inline def setFindingTypeStatsVarargs(value: FindingTypeStats*): Self = StObject.set(x, "findingTypeStats", js.Array(value*))
  }
}
