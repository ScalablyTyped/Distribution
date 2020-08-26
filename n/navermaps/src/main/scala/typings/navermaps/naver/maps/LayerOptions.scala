package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerOptions extends js.Object {
  var hd: Boolean = js.native
  var overlayMap: js.UndefOr[Boolean] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object LayerOptions {
  @scala.inline
  def apply(hd: Boolean): LayerOptions = {
    val __obj = js.Dynamic.literal(hd = hd.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerOptions]
  }
  @scala.inline
  implicit class LayerOptionsOps[Self <: LayerOptions] (val x: Self) extends AnyVal {
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
    def setHd(value: Boolean): Self = this.set("hd", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverlayMap(value: Boolean): Self = this.set("overlayMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayMap: Self = this.set("overlayMap", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

