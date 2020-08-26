package typings.navermaps.naver.maps

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapPanes extends js.Object {
  var floatPane: HTMLElement = js.native
  var overlayImage: HTMLElement = js.native
  var overlayLayer: HTMLElement = js.native
}

object MapPanes {
  @scala.inline
  def apply(floatPane: HTMLElement, overlayImage: HTMLElement, overlayLayer: HTMLElement): MapPanes = {
    val __obj = js.Dynamic.literal(floatPane = floatPane.asInstanceOf[js.Any], overlayImage = overlayImage.asInstanceOf[js.Any], overlayLayer = overlayLayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapPanes]
  }
  @scala.inline
  implicit class MapPanesOps[Self <: MapPanes] (val x: Self) extends AnyVal {
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
    def setFloatPane(value: HTMLElement): Self = this.set("floatPane", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverlayImage(value: HTMLElement): Self = this.set("overlayImage", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverlayLayer(value: HTMLElement): Self = this.set("overlayLayer", value.asInstanceOf[js.Any])
  }
  
}

