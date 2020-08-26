package typings.ol.geoJSONMod

import typings.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var dataProjection: js.UndefOr[ProjectionLike] = js.native
  var extractGeometryName: js.UndefOr[Boolean] = js.native
  var featureProjection: js.UndefOr[ProjectionLike] = js.native
  var geometryName: js.UndefOr[String] = js.native
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
    def setDataProjection(value: ProjectionLike): Self = this.set("dataProjection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataProjection: Self = this.set("dataProjection", js.undefined)
    @scala.inline
    def setExtractGeometryName(value: Boolean): Self = this.set("extractGeometryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtractGeometryName: Self = this.set("extractGeometryName", js.undefined)
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

