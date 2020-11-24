package typings.momentRange.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Adjacent extends js.Object {
  
  var adjacent: js.UndefOr[Boolean] = js.native
}
object Adjacent {
  
  @scala.inline
  def apply(): Adjacent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Adjacent]
  }
  
  @scala.inline
  implicit class AdjacentOps[Self <: Adjacent] (val x: Self) extends AnyVal {
    
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
    def setAdjacent(value: Boolean): Self = this.set("adjacent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjacent: Self = this.set("adjacent", js.undefined)
  }
}
