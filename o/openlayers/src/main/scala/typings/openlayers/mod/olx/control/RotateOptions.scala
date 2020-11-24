package typings.openlayers.mod.olx.control

import typings.openlayers.mod.MapEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RotateOptions extends js.Object {
  
  var autoHide: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var label: js.UndefOr[String | Element] = js.native
  
  var render: js.UndefOr[js.Function1[/* event */ MapEvent, _]] = js.native
  
  var resetNorth: js.UndefOr[js.Function0[_]] = js.native
  
  var target: js.UndefOr[Element] = js.native
  
  var tipLabel: js.UndefOr[String] = js.native
}
object RotateOptions {
  
  @scala.inline
  def apply(): RotateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotateOptions]
  }
  
  @scala.inline
  implicit class RotateOptionsOps[Self <: RotateOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoHide(value: Boolean): Self = this.set("autoHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHide: Self = this.set("autoHide", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setLabel(value: String | Element): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setRender(value: /* event */ MapEvent => _): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setResetNorth(value: () => _): Self = this.set("resetNorth", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteResetNorth: Self = this.set("resetNorth", js.undefined)
    
    @scala.inline
    def setTarget(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTipLabel(value: String): Self = this.set("tipLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTipLabel: Self = this.set("tipLabel", js.undefined)
  }
}
