package typings.ol.topoJSONMod

import typings.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var dataProjection: js.UndefOr[ProjectionLike] = js.native
  var layerName: js.UndefOr[String] = js.native
  var layers: js.UndefOr[js.Array[String]] = js.native
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
    def setLayerName(value: String): Self = this.set("layerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerName: Self = this.set("layerName", js.undefined)
    @scala.inline
    def setLayersVarargs(value: String*): Self = this.set("layers", js.Array(value :_*))
    @scala.inline
    def setLayers(value: js.Array[String]): Self = this.set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
  }
  
}

