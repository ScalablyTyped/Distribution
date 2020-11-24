package typings.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRoundRectangleOptions extends js.Object {
  
  var resolution: js.UndefOr[Double] = js.native
  
  var roundradius: Double = js.native
}
object IRoundRectangleOptions {
  
  @scala.inline
  def apply(roundradius: Double): IRoundRectangleOptions = {
    val __obj = js.Dynamic.literal(roundradius = roundradius.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRoundRectangleOptions]
  }
  
  @scala.inline
  implicit class IRoundRectangleOptionsOps[Self <: IRoundRectangleOptions] (val x: Self) extends AnyVal {
    
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
    def setRoundradius(value: Double): Self = this.set("roundradius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolution(value: Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
  }
}
