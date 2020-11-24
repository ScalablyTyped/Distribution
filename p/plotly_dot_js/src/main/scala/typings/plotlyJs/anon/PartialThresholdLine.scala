package typings.plotlyJs.anon

import typings.plotlyJs.mod.GaugeLine
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Threshold> */
@js.native
trait PartialThresholdLine extends js.Object {
  
  var line: js.UndefOr[Partial[GaugeLine]] = js.native
  
  var thickness: js.UndefOr[Double] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object PartialThresholdLine {
  
  @scala.inline
  def apply(): PartialThresholdLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialThresholdLine]
  }
  
  @scala.inline
  implicit class PartialThresholdLineOps[Self <: PartialThresholdLine] (val x: Self) extends AnyVal {
    
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
    def setLine(value: Partial[GaugeLine]): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setThickness(value: Double): Self = this.set("thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThickness: Self = this.set("thickness", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
