package typings.openlayers.mod.olx

import typings.openlayers.mod.ProjectionLike
import typings.std.PositionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeolocationOptions extends js.Object {
  var projection: ProjectionLike = js.native
  var tracking: js.UndefOr[Boolean] = js.native
  var trackingOptions: js.UndefOr[PositionOptions] = js.native
}

object GeolocationOptions {
  @scala.inline
  def apply(): GeolocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeolocationOptions]
  }
  @scala.inline
  implicit class GeolocationOptionsOps[Self <: GeolocationOptions] (val x: Self) extends AnyVal {
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
    def setProjection(value: ProjectionLike): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setTracking(value: Boolean): Self = this.set("tracking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracking: Self = this.set("tracking", js.undefined)
    @scala.inline
    def setTrackingOptions(value: PositionOptions): Self = this.set("trackingOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackingOptions: Self = this.set("trackingOptions", js.undefined)
  }
  
}

