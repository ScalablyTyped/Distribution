package typings.nivoScales.mod

import typings.nivoScales.nivoScalesStrings.auto
import typings.nivoScales.nivoScalesStrings.symlog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SymlogScale extends Scale {
  
  var constant: js.UndefOr[Double] = js.native
  
  var max: js.UndefOr[auto | Double] = js.native
  
  var min: js.UndefOr[auto | Double] = js.native
  
  var `type`: symlog = js.native
}
object SymlogScale {
  
  @scala.inline
  def apply(`type`: symlog): SymlogScale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymlogScale]
  }
  
  @scala.inline
  implicit class SymlogScaleOps[Self <: SymlogScale] (val x: Self) extends AnyVal {
    
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
    def setType(value: symlog): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstant(value: Double): Self = this.set("constant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstant: Self = this.set("constant", js.undefined)
    
    @scala.inline
    def setMax(value: auto | Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: auto | Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
}
