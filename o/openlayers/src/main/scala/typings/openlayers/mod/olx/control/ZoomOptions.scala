package typings.openlayers.mod.olx.control

import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoomOptions extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var delta: js.UndefOr[Double] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var target: js.UndefOr[Element] = js.native
  
  var zoomInLabel: js.UndefOr[String | Node] = js.native
  
  var zoomInTipLabel: js.UndefOr[String] = js.native
  
  var zoomOutLabel: js.UndefOr[String | Node] = js.native
  
  var zoomOutTipLabel: js.UndefOr[String] = js.native
}
object ZoomOptions {
  
  @scala.inline
  def apply(): ZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomOptions]
  }
  
  @scala.inline
  implicit class ZoomOptionsOps[Self <: ZoomOptions] (val x: Self) extends AnyVal {
    
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
    def setDelta(value: Double): Self = this.set("delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelta: Self = this.set("delta", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setTarget(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setZoomInLabel(value: String | Node): Self = this.set("zoomInLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomInLabel: Self = this.set("zoomInLabel", js.undefined)
    
    @scala.inline
    def setZoomInTipLabel(value: String): Self = this.set("zoomInTipLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomInTipLabel: Self = this.set("zoomInTipLabel", js.undefined)
    
    @scala.inline
    def setZoomOutLabel(value: String | Node): Self = this.set("zoomOutLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomOutLabel: Self = this.set("zoomOutLabel", js.undefined)
    
    @scala.inline
    def setZoomOutTipLabel(value: String): Self = this.set("zoomOutTipLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomOutTipLabel: Self = this.set("zoomOutTipLabel", js.undefined)
  }
}
