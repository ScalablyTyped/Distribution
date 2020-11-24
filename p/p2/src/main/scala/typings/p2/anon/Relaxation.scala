package typings.p2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Relaxation extends js.Object {
  
  var relaxation: js.UndefOr[Double] = js.native
  
  var stiffness: js.UndefOr[Double] = js.native
}
object Relaxation {
  
  @scala.inline
  def apply(): Relaxation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Relaxation]
  }
  
  @scala.inline
  implicit class RelaxationOps[Self <: Relaxation] (val x: Self) extends AnyVal {
    
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
    def setRelaxation(value: Double): Self = this.set("relaxation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelaxation: Self = this.set("relaxation", js.undefined)
    
    @scala.inline
    def setStiffness(value: Double): Self = this.set("stiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStiffness: Self = this.set("stiffness", js.undefined)
  }
}
