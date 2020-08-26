package typings.ol.overlayMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.overlayPositioningMod.OverlayPositioning
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var autoPan: js.UndefOr[PanIntoViewOptions | Boolean] = js.native
  var autoPanAnimation: js.UndefOr[PanOptions] = js.native
  var autoPanMargin: js.UndefOr[Double] = js.native
  var autoPanOptions: js.UndefOr[PanIntoViewOptions] = js.native
  var className: js.UndefOr[String] = js.native
  var element: js.UndefOr[HTMLElement] = js.native
  var id: js.UndefOr[Double | String] = js.native
  var insertFirst: js.UndefOr[Boolean] = js.native
  var offset: js.UndefOr[js.Array[Double]] = js.native
  var position: js.UndefOr[Coordinate] = js.native
  var positioning: js.UndefOr[OverlayPositioning] = js.native
  var stopEvent: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAutoPan(value: PanIntoViewOptions | Boolean): Self = this.set("autoPan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPan: Self = this.set("autoPan", js.undefined)
    @scala.inline
    def setAutoPanAnimation(value: PanOptions): Self = this.set("autoPanAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPanAnimation: Self = this.set("autoPanAnimation", js.undefined)
    @scala.inline
    def setAutoPanMargin(value: Double): Self = this.set("autoPanMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPanMargin: Self = this.set("autoPanMargin", js.undefined)
    @scala.inline
    def setAutoPanOptions(value: PanIntoViewOptions): Self = this.set("autoPanOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPanOptions: Self = this.set("autoPanOptions", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setId(value: Double | String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInsertFirst(value: Boolean): Self = this.set("insertFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertFirst: Self = this.set("insertFirst", js.undefined)
    @scala.inline
    def setOffsetVarargs(value: Double*): Self = this.set("offset", js.Array(value :_*))
    @scala.inline
    def setOffset(value: js.Array[Double]): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPositionVarargs(value: Double*): Self = this.set("position", js.Array(value :_*))
    @scala.inline
    def setPosition(value: Coordinate): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setPositioning(value: OverlayPositioning): Self = this.set("positioning", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositioning: Self = this.set("positioning", js.undefined)
    @scala.inline
    def setStopEvent(value: Boolean): Self = this.set("stopEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopEvent: Self = this.set("stopEvent", js.undefined)
  }
  
}

