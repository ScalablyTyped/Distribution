package typings.plotlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.MapboxCenter> */
@js.native
trait PartialMapboxCenter extends js.Object {
  var lat: js.UndefOr[Double] = js.native
  var lon: js.UndefOr[Double] = js.native
}

object PartialMapboxCenter {
  @scala.inline
  def apply(): PartialMapboxCenter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMapboxCenter]
  }
  @scala.inline
  implicit class PartialMapboxCenterOps[Self <: PartialMapboxCenter] (val x: Self) extends AnyVal {
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
    def setLat(value: Double): Self = this.set("lat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLat: Self = this.set("lat", js.undefined)
    @scala.inline
    def setLon(value: Double): Self = this.set("lon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLon: Self = this.set("lon", js.undefined)
  }
  
}

