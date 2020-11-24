package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposGetParticipationStatsResponseData extends js.Object {
  
  var all: js.Array[Double] = js.native
  
  var owner: js.Array[Double] = js.native
}
object ReposGetParticipationStatsResponseData {
  
  @scala.inline
  def apply(all: js.Array[Double], owner: js.Array[Double]): ReposGetParticipationStatsResponseData = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetParticipationStatsResponseData]
  }
  
  @scala.inline
  implicit class ReposGetParticipationStatsResponseDataOps[Self <: ReposGetParticipationStatsResponseData] (val x: Self) extends AnyVal {
    
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
    def setAllVarargs(value: Double*): Self = this.set("all", js.Array(value :_*))
    
    @scala.inline
    def setAll(value: js.Array[Double]): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerVarargs(value: Double*): Self = this.set("owner", js.Array(value :_*))
    
    @scala.inline
    def setOwner(value: js.Array[Double]): Self = this.set("owner", value.asInstanceOf[js.Any])
  }
}
