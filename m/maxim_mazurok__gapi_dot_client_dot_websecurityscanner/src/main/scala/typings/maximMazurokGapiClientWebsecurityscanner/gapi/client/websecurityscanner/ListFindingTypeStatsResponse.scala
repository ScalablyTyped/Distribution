package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFindingTypeStatsResponse extends StObject {
  
  /** The list of FindingTypeStats returned. */
  var findingTypeStats: js.UndefOr[js.Array[FindingTypeStats]] = js.native
}
object ListFindingTypeStatsResponse {
  
  @scala.inline
  def apply(): ListFindingTypeStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFindingTypeStatsResponse]
  }
  
  @scala.inline
  implicit class ListFindingTypeStatsResponseMutableBuilder[Self <: ListFindingTypeStatsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindingTypeStats(value: js.Array[FindingTypeStats]): Self = StObject.set(x, "findingTypeStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingTypeStatsUndefined: Self = StObject.set(x, "findingTypeStats", js.undefined)
    
    @scala.inline
    def setFindingTypeStatsVarargs(value: FindingTypeStats*): Self = StObject.set(x, "findingTypeStats", js.Array(value :_*))
  }
}
