package typings.plotlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  visible :boolean,   width :number,   fillcolor :plotly.js.plotly.js.Color,   line :std.Partial<{  color :plotly.js.plotly.js.Color,   width :number}>}> */
@js.native
trait Partialvisiblebooleanwidt extends js.Object {
  
  var fillcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  
  var line: js.UndefOr[PartialcolorColorwidthnumColor] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object Partialvisiblebooleanwidt {
  
  @scala.inline
  def apply(): Partialvisiblebooleanwidt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialvisiblebooleanwidt]
  }
  
  @scala.inline
  implicit class PartialvisiblebooleanwidtOps[Self <: Partialvisiblebooleanwidt] (val x: Self) extends AnyVal {
    
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
    def setFillcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("fillcolor", js.Array(value :_*))
    
    @scala.inline
    def setFillcolor(value: typings.plotlyJs.mod.Color): Self = this.set("fillcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillcolor: Self = this.set("fillcolor", js.undefined)
    
    @scala.inline
    def setLine(value: PartialcolorColorwidthnumColor): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
