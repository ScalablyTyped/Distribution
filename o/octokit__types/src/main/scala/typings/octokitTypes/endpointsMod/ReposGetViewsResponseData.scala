package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposGetViewsResponseData extends js.Object {
  
  var count: Double = js.native
  
  var uniques: Double = js.native
  
  var views: js.Array[Count] = js.native
}
object ReposGetViewsResponseData {
  
  @scala.inline
  def apply(count: Double, uniques: Double, views: js.Array[Count]): ReposGetViewsResponseData = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], uniques = uniques.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetViewsResponseData]
  }
  
  @scala.inline
  implicit class ReposGetViewsResponseDataOps[Self <: ReposGetViewsResponseData] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniques(value: Double): Self = this.set("uniques", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewsVarargs(value: Count*): Self = this.set("views", js.Array(value :_*))
    
    @scala.inline
    def setViews(value: js.Array[Count]): Self = this.set("views", value.asInstanceOf[js.Any])
  }
}
