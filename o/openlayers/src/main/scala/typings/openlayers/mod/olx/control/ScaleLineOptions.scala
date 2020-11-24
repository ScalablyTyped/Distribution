package typings.openlayers.mod.olx.control

import typings.openlayers.mod.MapEvent
import typings.openlayers.mod.control.ScaleLine.Units
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleLineOptions extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var minWidth: js.UndefOr[Double] = js.native
  
  var render: js.UndefOr[js.Function1[/* event */ MapEvent, _]] = js.native
  
  var target: js.UndefOr[Element] = js.native
  
  var units: js.UndefOr[Units | String] = js.native
}
object ScaleLineOptions {
  
  @scala.inline
  def apply(): ScaleLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleLineOptions]
  }
  
  @scala.inline
  implicit class ScaleLineOptionsOps[Self <: ScaleLineOptions] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setRender(value: /* event */ MapEvent => _): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setTarget(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setUnits(value: Units | String): Self = this.set("units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnits: Self = this.set("units", js.undefined)
  }
}
