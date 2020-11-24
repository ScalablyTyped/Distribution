package typings.plotlyJs.anon

import typings.plotlyJs.mod.Dash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.ShapeLine> */
@js.native
trait PartialShapeLine extends js.Object {
  
  var color: js.UndefOr[String] = js.native
  
  var dash: js.UndefOr[Dash] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object PartialShapeLine {
  
  @scala.inline
  def apply(): PartialShapeLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialShapeLine]
  }
  
  @scala.inline
  implicit class PartialShapeLineOps[Self <: PartialShapeLine] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDash(value: Dash): Self = this.set("dash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDash: Self = this.set("dash", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
