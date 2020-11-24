package typings.mongoose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lean extends js.Object {
  
  /** return the raw object instead of the Mongoose Model */
  var lean: js.UndefOr[Boolean] = js.native
  
  /** The maximum number of results to return */
  var limit: js.UndefOr[Double] = js.native
  
  /** the maximum distance from the point near that a result can be */
  var maxDistance: Double = js.native
  
  /** x,y point to search for */
  var near: js.Array[Double] = js.native
}
object Lean {
  
  @scala.inline
  def apply(maxDistance: Double, near: js.Array[Double]): Lean = {
    val __obj = js.Dynamic.literal(maxDistance = maxDistance.asInstanceOf[js.Any], near = near.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lean]
  }
  
  @scala.inline
  implicit class LeanOps[Self <: Lean] (val x: Self) extends AnyVal {
    
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
    def setMaxDistance(value: Double): Self = this.set("maxDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearVarargs(value: Double*): Self = this.set("near", js.Array(value :_*))
    
    @scala.inline
    def setNear(value: js.Array[Double]): Self = this.set("near", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLean(value: Boolean): Self = this.set("lean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLean: Self = this.set("lean", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
  }
}
