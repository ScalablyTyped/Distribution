package typings.openlayers.mod.olx.format

import typings.openlayers.mod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoJSONOptions extends js.Object {
  var defaultDataProjection: ProjectionLike = js.native
  var featureProjection: ProjectionLike = js.native
  var geometryName: js.UndefOr[String] = js.native
}

object GeoJSONOptions {
  @scala.inline
  def apply(): GeoJSONOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoJSONOptions]
  }
  @scala.inline
  implicit class GeoJSONOptionsOps[Self <: GeoJSONOptions] (val x: Self) extends AnyVal {
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
    def setDefaultDataProjection(value: ProjectionLike): Self = this.set("defaultDataProjection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDataProjection: Self = this.set("defaultDataProjection", js.undefined)
    @scala.inline
    def setFeatureProjection(value: ProjectionLike): Self = this.set("featureProjection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureProjection: Self = this.set("featureProjection", js.undefined)
    @scala.inline
    def setGeometryName(value: String): Self = this.set("geometryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometryName: Self = this.set("geometryName", js.undefined)
  }
  
}

