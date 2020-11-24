package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectionOperators extends js.Object {
  
  /** https://docs.mongodb.com/manual/reference/operator/projection/elemMatch/#proj._S_elemMatch */
  @JSName("$elemMatch")
  var $elemMatch: js.UndefOr[js.Object] = js.native
  
  @JSName("$meta")
  var $meta: js.UndefOr[MetaProjectionOperators] = js.native
  
  /** https://docs.mongodb.com/manual/reference/operator/projection/slice/#proj._S_slice */
  @JSName("$slice")
  var $slice: js.UndefOr[scala.Double | (js.Tuple2[scala.Double, scala.Double])] = js.native
}
object ProjectionOperators {
  
  @scala.inline
  def apply(): ProjectionOperators = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectionOperators]
  }
  
  @scala.inline
  implicit class ProjectionOperatorsOps[Self <: ProjectionOperators] (val x: Self) extends AnyVal {
    
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
    def set$elemMatch(value: js.Object): Self = this.set("$elemMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$elemMatch: Self = this.set("$elemMatch", js.undefined)
    
    @scala.inline
    def set$meta(value: MetaProjectionOperators): Self = this.set("$meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$meta: Self = this.set("$meta", js.undefined)
    
    @scala.inline
    def set$slice(value: scala.Double | (js.Tuple2[scala.Double, scala.Double])): Self = this.set("$slice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$slice: Self = this.set("$slice", js.undefined)
  }
}
