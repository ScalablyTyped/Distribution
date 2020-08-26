package typings.openlayers.mod.olx

import typings.openlayers.mod.Map
import typings.openlayers.mod.style.Stroke
import typings.openlayers.mod.style.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraticuleOptions extends js.Object {
  var latLabelFormatter: js.UndefOr[js.Function1[/* lat */ Double, String]] = js.native
  var latLabelPosition: js.UndefOr[Double] = js.native
  var latLabelStyle: js.UndefOr[Text] = js.native
  var lonLabelFormatter: js.UndefOr[js.Function1[/* lon */ Double, String]] = js.native
  var lonLabelPosition: js.UndefOr[Double] = js.native
  var lonLabelStyle: js.UndefOr[Text] = js.native
  var map: js.UndefOr[Map] = js.native
  var maxLines: js.UndefOr[Double] = js.native
  var showLabels: js.UndefOr[Boolean] = js.native
  var strokeStyle: js.UndefOr[Stroke] = js.native
  var targetSize: js.UndefOr[Double] = js.native
}

object GraticuleOptions {
  @scala.inline
  def apply(): GraticuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraticuleOptions]
  }
  @scala.inline
  implicit class GraticuleOptionsOps[Self <: GraticuleOptions] (val x: Self) extends AnyVal {
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
    def setLatLabelFormatter(value: /* lat */ Double => String): Self = this.set("latLabelFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLatLabelFormatter: Self = this.set("latLabelFormatter", js.undefined)
    @scala.inline
    def setLatLabelPosition(value: Double): Self = this.set("latLabelPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatLabelPosition: Self = this.set("latLabelPosition", js.undefined)
    @scala.inline
    def setLatLabelStyle(value: Text): Self = this.set("latLabelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatLabelStyle: Self = this.set("latLabelStyle", js.undefined)
    @scala.inline
    def setLonLabelFormatter(value: /* lon */ Double => String): Self = this.set("lonLabelFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLonLabelFormatter: Self = this.set("lonLabelFormatter", js.undefined)
    @scala.inline
    def setLonLabelPosition(value: Double): Self = this.set("lonLabelPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLonLabelPosition: Self = this.set("lonLabelPosition", js.undefined)
    @scala.inline
    def setLonLabelStyle(value: Text): Self = this.set("lonLabelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLonLabelStyle: Self = this.set("lonLabelStyle", js.undefined)
    @scala.inline
    def setMap(value: Map): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setMaxLines(value: Double): Self = this.set("maxLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLines: Self = this.set("maxLines", js.undefined)
    @scala.inline
    def setShowLabels(value: Boolean): Self = this.set("showLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLabels: Self = this.set("showLabels", js.undefined)
    @scala.inline
    def setStrokeStyle(value: Stroke): Self = this.set("strokeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeStyle: Self = this.set("strokeStyle", js.undefined)
    @scala.inline
    def setTargetSize(value: Double): Self = this.set("targetSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetSize: Self = this.set("targetSize", js.undefined)
  }
  
}

