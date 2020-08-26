package typings.openlayers.mod.olx.source

import typings.openlayers.mod.Tile
import typings.openlayers.mod.TileLoadFunctionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapQuestOptions extends js.Object {
  var cacheSize: js.UndefOr[Double] = js.native
  var layer: String = js.native
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.native
  var tileLoadFunction: js.UndefOr[TileLoadFunctionType] = js.native
  var url: js.UndefOr[String] = js.native
}

object MapQuestOptions {
  @scala.inline
  def apply(layer: String): MapQuestOptions = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapQuestOptions]
  }
  @scala.inline
  implicit class MapQuestOptionsOps[Self <: MapQuestOptions] (val x: Self) extends AnyVal {
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
    def setLayer(value: String): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheSize(value: Double): Self = this.set("cacheSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheSize: Self = this.set("cacheSize", js.undefined)
    @scala.inline
    def setReprojectionErrorThreshold(value: Double): Self = this.set("reprojectionErrorThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReprojectionErrorThreshold: Self = this.set("reprojectionErrorThreshold", js.undefined)
    @scala.inline
    def setTileLoadFunction(value: (/* tile */ Tile, /* url */ String) => Unit): Self = this.set("tileLoadFunction", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTileLoadFunction: Self = this.set("tileLoadFunction", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

