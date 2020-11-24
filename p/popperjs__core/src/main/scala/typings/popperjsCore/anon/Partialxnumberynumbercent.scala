package typings.popperjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  x :number,   y :number,   centerOffset :number}> */
@js.native
trait Partialxnumberynumbercent extends js.Object {
  
  var centerOffset: js.UndefOr[Double] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object Partialxnumberynumbercent {
  
  @scala.inline
  def apply(): Partialxnumberynumbercent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialxnumberynumbercent]
  }
  
  @scala.inline
  implicit class PartialxnumberynumbercentOps[Self <: Partialxnumberynumbercent] (val x: Self) extends AnyVal {
    
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
    def setCenterOffset(value: Double): Self = this.set("centerOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterOffset: Self = this.set("centerOffset", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
