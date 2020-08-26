package typings.openlayers.mod.olx

import typings.openlayers.mod.Coordinate_
import typings.openlayers.mod.Extent_
import typings.openlayers.mod.proj.Units
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object literal with config options for the projection.
  */
@js.native
trait ProjectionOptions extends js.Object {
  var axisOrientation: js.UndefOr[String] = js.native
  var code: String = js.native
  var extent: js.UndefOr[Extent_] = js.native
  var getPointResolution: js.UndefOr[js.Function2[/* resolution */ Double, /* coords */ Coordinate_, Double]] = js.native
  var global: js.UndefOr[Boolean] = js.native
  var metersPerUnit: js.UndefOr[Double] = js.native
  var units: js.UndefOr[Units | String] = js.native
  var worldExtent: js.UndefOr[Extent_] = js.native
}

object ProjectionOptions {
  @scala.inline
  def apply(code: String): ProjectionOptions = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectionOptions]
  }
  @scala.inline
  implicit class ProjectionOptionsOps[Self <: ProjectionOptions] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setAxisOrientation(value: String): Self = this.set("axisOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisOrientation: Self = this.set("axisOrientation", js.undefined)
    @scala.inline
    def setExtent(value: Extent_): Self = this.set("extent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    @scala.inline
    def setGetPointResolution(value: (/* resolution */ Double, /* coords */ Coordinate_) => Double): Self = this.set("getPointResolution", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetPointResolution: Self = this.set("getPointResolution", js.undefined)
    @scala.inline
    def setGlobal(value: Boolean): Self = this.set("global", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    @scala.inline
    def setMetersPerUnit(value: Double): Self = this.set("metersPerUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetersPerUnit: Self = this.set("metersPerUnit", js.undefined)
    @scala.inline
    def setUnits(value: Units | String): Self = this.set("units", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnits: Self = this.set("units", js.undefined)
    @scala.inline
    def setWorldExtent(value: Extent_): Self = this.set("worldExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorldExtent: Self = this.set("worldExtent", js.undefined)
  }
  
}

