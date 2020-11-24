package typings.p2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptimalDecomp extends js.Object {
  
  var optimalDecomp: js.UndefOr[Boolean] = js.native
  
  var removeCollinearPoints: js.UndefOr[Boolean | Double] = js.native
  
  var skipSimpleCheck: js.UndefOr[Boolean] = js.native
}
object OptimalDecomp {
  
  @scala.inline
  def apply(): OptimalDecomp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptimalDecomp]
  }
  
  @scala.inline
  implicit class OptimalDecompOps[Self <: OptimalDecomp] (val x: Self) extends AnyVal {
    
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
    def setOptimalDecomp(value: Boolean): Self = this.set("optimalDecomp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimalDecomp: Self = this.set("optimalDecomp", js.undefined)
    
    @scala.inline
    def setRemoveCollinearPoints(value: Boolean | Double): Self = this.set("removeCollinearPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveCollinearPoints: Self = this.set("removeCollinearPoints", js.undefined)
    
    @scala.inline
    def setSkipSimpleCheck(value: Boolean): Self = this.set("skipSimpleCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipSimpleCheck: Self = this.set("skipSimpleCheck", js.undefined)
  }
}
