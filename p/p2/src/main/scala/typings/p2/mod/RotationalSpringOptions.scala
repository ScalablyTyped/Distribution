package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RotationalSpringOptions extends SpringOptions {
  
  var restAngle: js.UndefOr[Double] = js.native
}
object RotationalSpringOptions {
  
  @scala.inline
  def apply(): RotationalSpringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotationalSpringOptions]
  }
  
  @scala.inline
  implicit class RotationalSpringOptionsOps[Self <: RotationalSpringOptions] (val x: Self) extends AnyVal {
    
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
    def setRestAngle(value: Double): Self = this.set("restAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestAngle: Self = this.set("restAngle", js.undefined)
  }
}
