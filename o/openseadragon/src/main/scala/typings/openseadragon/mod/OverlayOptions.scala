package typings.openseadragon.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayOptions extends js.Object {
  var checkResize: js.UndefOr[Boolean] = js.native
  var element: HTMLElement = js.native
  var height: js.UndefOr[Double] = js.native
  var location: Point | Rect = js.native
  var onDraw: js.UndefOr[OnDrawCallback] = js.native
  var placement: js.UndefOr[Placement] = js.native
  var rotationMode: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
}

object OverlayOptions {
  @scala.inline
  def apply(element: HTMLElement, location: Point | Rect): OverlayOptions = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayOptions]
  }
  @scala.inline
  implicit class OverlayOptionsOps[Self <: OverlayOptions] (val x: Self) extends AnyVal {
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
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: Point | Rect): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckResize(value: Boolean): Self = this.set("checkResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckResize: Self = this.set("checkResize", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setOnDraw(value: (/* position */ Point, /* size */ Point, /* element */ HTMLElement) => Unit): Self = this.set("onDraw", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnDraw: Self = this.set("onDraw", js.undefined)
    @scala.inline
    def setPlacement(value: Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setRotationMode(value: Boolean): Self = this.set("rotationMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotationMode: Self = this.set("rotationMode", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

