package typings.ol.sphereMod

import typings.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SphereMetricOptions extends js.Object {
  var projection: js.UndefOr[ProjectionLike] = js.native
  var radius: js.UndefOr[Double] = js.native
}

object SphereMetricOptions {
  @scala.inline
  def apply(): SphereMetricOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SphereMetricOptions]
  }
  @scala.inline
  implicit class SphereMetricOptionsOps[Self <: SphereMetricOptions] (val x: Self) extends AnyVal {
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
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
  }
  
}

