package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposGetClonesResponseData extends js.Object {
  
  var clones: js.Array[Count] = js.native
  
  var count: Double = js.native
  
  var uniques: Double = js.native
}
object ReposGetClonesResponseData {
  
  @scala.inline
  def apply(clones: js.Array[Count], count: Double, uniques: Double): ReposGetClonesResponseData = {
    val __obj = js.Dynamic.literal(clones = clones.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], uniques = uniques.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetClonesResponseData]
  }
  
  @scala.inline
  implicit class ReposGetClonesResponseDataOps[Self <: ReposGetClonesResponseData] (val x: Self) extends AnyVal {
    
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
    def setClonesVarargs(value: Count*): Self = this.set("clones", js.Array(value :_*))
    
    @scala.inline
    def setClones(value: js.Array[Count]): Self = this.set("clones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniques(value: Double): Self = this.set("uniques", value.asInstanceOf[js.Any])
  }
}
