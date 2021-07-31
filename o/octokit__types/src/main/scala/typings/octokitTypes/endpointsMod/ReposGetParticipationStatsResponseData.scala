package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposGetParticipationStatsResponseData extends StObject {
  
  var all: js.Array[Double]
  
  var owner: js.Array[Double]
}
object ReposGetParticipationStatsResponseData {
  
  @scala.inline
  def apply(all: js.Array[Double], owner: js.Array[Double]): ReposGetParticipationStatsResponseData = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetParticipationStatsResponseData]
  }
  
  @scala.inline
  implicit class ReposGetParticipationStatsResponseDataMutableBuilder[Self <: ReposGetParticipationStatsResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: js.Array[Double]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllVarargs(value: Double*): Self = StObject.set(x, "all", js.Array(value :_*))
    
    @scala.inline
    def setOwner(value: js.Array[Double]): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerVarargs(value: Double*): Self = StObject.set(x, "owner", js.Array(value :_*))
  }
}
