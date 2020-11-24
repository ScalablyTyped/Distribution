package typings.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IArcOptions extends ICircleOptions {
  
  var endangle: js.UndefOr[Double] = js.native
  
  var maketangent: js.UndefOr[Boolean] = js.native
  
  var startangle: js.UndefOr[Double] = js.native
}
object IArcOptions {
  
  @scala.inline
  def apply(): IArcOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IArcOptions]
  }
  
  @scala.inline
  implicit class IArcOptionsOps[Self <: IArcOptions] (val x: Self) extends AnyVal {
    
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
    def setEndangle(value: Double): Self = this.set("endangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndangle: Self = this.set("endangle", js.undefined)
    
    @scala.inline
    def setMaketangent(value: Boolean): Self = this.set("maketangent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaketangent: Self = this.set("maketangent", js.undefined)
    
    @scala.inline
    def setStartangle(value: Double): Self = this.set("startangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartangle: Self = this.set("startangle", js.undefined)
  }
}
