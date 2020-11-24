package typings.plotlyJs.anon

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.PlotNumber> */
@js.native
trait PartialPlotNumber extends js.Object {
  
  var font: js.UndefOr[Partial[typings.plotlyJs.mod.Font]] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var suffix: js.UndefOr[String] = js.native
  
  var valueformat: js.UndefOr[String] = js.native
}
object PartialPlotNumber {
  
  @scala.inline
  def apply(): PartialPlotNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPlotNumber]
  }
  
  @scala.inline
  implicit class PartialPlotNumberOps[Self <: PartialPlotNumber] (val x: Self) extends AnyVal {
    
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
    def setFont(value: Partial[typings.plotlyJs.mod.Font]): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    
    @scala.inline
    def setValueformat(value: String): Self = this.set("valueformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueformat: Self = this.set("valueformat", js.undefined)
  }
}
