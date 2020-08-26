package typings.ol.graticuleMod

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var className: js.UndefOr[String] = js.native
  var extent: js.UndefOr[Extent] = js.native
  var intervals: js.UndefOr[js.Array[Double]] = js.native
  var latLabelFormatter: js.UndefOr[js.Function1[/* p0 */ Double, String]] = js.native
  var latLabelPosition: js.UndefOr[Double] = js.native
  var latLabelStyle: js.UndefOr[typings.ol.textMod.default] = js.native
  var lonLabelFormatter: js.UndefOr[js.Function1[/* p0 */ Double, String]] = js.native
  var lonLabelPosition: js.UndefOr[Double] = js.native
  var lonLabelStyle: js.UndefOr[typings.ol.textMod.default] = js.native
  var maxLines: js.UndefOr[Double] = js.native
  var maxResolution: js.UndefOr[Double] = js.native
  var maxZoom: js.UndefOr[Double] = js.native
  var minResolution: js.UndefOr[Double] = js.native
  var minZoom: js.UndefOr[Double] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var showLabels: js.UndefOr[Boolean] = js.native
  var strokeStyle: js.UndefOr[typings.ol.strokeMod.default] = js.native
  var targetSize: js.UndefOr[Double] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var wrapX: js.UndefOr[Boolean] = js.native
  var zIndex: js.UndefOr[Double] = js.native
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setExtent(value: Extent): Self = this.set("extent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    @scala.inline
    def setIntervalsVarargs(value: Double*): Self = this.set("intervals", js.Array(value :_*))
    @scala.inline
    def setIntervals(value: js.Array[Double]): Self = this.set("intervals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntervals: Self = this.set("intervals", js.undefined)
    @scala.inline
    def setLatLabelFormatter(value: /* p0 */ Double => String): Self = this.set("latLabelFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLatLabelFormatter: Self = this.set("latLabelFormatter", js.undefined)
    @scala.inline
    def setLatLabelPosition(value: Double): Self = this.set("latLabelPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatLabelPosition: Self = this.set("latLabelPosition", js.undefined)
    @scala.inline
    def setLatLabelStyle(value: typings.ol.textMod.default): Self = this.set("latLabelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatLabelStyle: Self = this.set("latLabelStyle", js.undefined)
    @scala.inline
    def setLonLabelFormatter(value: /* p0 */ Double => String): Self = this.set("lonLabelFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLonLabelFormatter: Self = this.set("lonLabelFormatter", js.undefined)
    @scala.inline
    def setLonLabelPosition(value: Double): Self = this.set("lonLabelPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLonLabelPosition: Self = this.set("lonLabelPosition", js.undefined)
    @scala.inline
    def setLonLabelStyle(value: typings.ol.textMod.default): Self = this.set("lonLabelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLonLabelStyle: Self = this.set("lonLabelStyle", js.undefined)
    @scala.inline
    def setMaxLines(value: Double): Self = this.set("maxLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLines: Self = this.set("maxLines", js.undefined)
    @scala.inline
    def setMaxResolution(value: Double): Self = this.set("maxResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResolution: Self = this.set("maxResolution", js.undefined)
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    @scala.inline
    def setMinResolution(value: Double): Self = this.set("minResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinResolution: Self = this.set("minResolution", js.undefined)
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setShowLabels(value: Boolean): Self = this.set("showLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLabels: Self = this.set("showLabels", js.undefined)
    @scala.inline
    def setStrokeStyle(value: typings.ol.strokeMod.default): Self = this.set("strokeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeStyle: Self = this.set("strokeStyle", js.undefined)
    @scala.inline
    def setTargetSize(value: Double): Self = this.set("targetSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetSize: Self = this.set("targetSize", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWrapX(value: Boolean): Self = this.set("wrapX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapX: Self = this.set("wrapX", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

