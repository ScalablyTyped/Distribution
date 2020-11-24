package typings.officeUiFabricReact.ratingBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRatingState extends js.Object {
  
  var rating: js.UndefOr[Double | Null] = js.native
}
object IRatingState {
  
  @scala.inline
  def apply(): IRatingState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRatingState]
  }
  
  @scala.inline
  implicit class IRatingStateOps[Self <: IRatingState] (val x: Self) extends AnyVal {
    
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
    def setRating(value: Double): Self = this.set("rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRating: Self = this.set("rating", js.undefined)
    
    @scala.inline
    def setRatingNull: Self = this.set("rating", null)
  }
}
