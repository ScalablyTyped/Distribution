package typings.openlayers.mod.olx.source

import org.scalablytyped.runtime.StringDictionary
import typings.openlayers.mod.Attribution
import typings.openlayers.mod.AttributionLike
import typings.openlayers.mod.ProjectionLike
import typings.openlayers.mod.Tile
import typings.openlayers.mod.TileLoadFunctionType
import typings.openlayers.mod.olx.LogoOptions
import typings.openlayers.mod.tilegrid.TileGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileArcGISRestOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.native
  var cacheSize: js.UndefOr[Double] = js.native
  var crossOrigin: js.UndefOr[String] = js.native
  var logo: js.UndefOr[String | LogoOptions] = js.native
  var params: js.UndefOr[StringDictionary[js.Any]] = js.native
  var projection: js.UndefOr[ProjectionLike] = js.native
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.native
  var tileGrid: js.UndefOr[TileGrid] = js.native
  var tileLoadFunction: js.UndefOr[TileLoadFunctionType] = js.native
  var transition: js.UndefOr[Double] = js.native
  var url: js.UndefOr[String] = js.native
  var urls: js.UndefOr[js.Array[String]] = js.native
  var wrapX: js.UndefOr[Boolean] = js.native
}

object TileArcGISRestOptions {
  @scala.inline
  def apply(): TileArcGISRestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileArcGISRestOptions]
  }
  @scala.inline
  implicit class TileArcGISRestOptionsOps[Self <: TileArcGISRestOptions] (val x: Self) extends AnyVal {
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
    def setAttributionsVarargs(value: (Attribution | String)*): Self = this.set("attributions", js.Array(value :_*))
    @scala.inline
    def setAttributions(value: AttributionLike): Self = this.set("attributions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributions: Self = this.set("attributions", js.undefined)
    @scala.inline
    def setCacheSize(value: Double): Self = this.set("cacheSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheSize: Self = this.set("cacheSize", js.undefined)
    @scala.inline
    def setCrossOrigin(value: String): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    @scala.inline
    def setLogo(value: String | LogoOptions): Self = this.set("logo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogo: Self = this.set("logo", js.undefined)
    @scala.inline
    def setParams(value: StringDictionary[js.Any]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setProjection(value: ProjectionLike): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setReprojectionErrorThreshold(value: Double): Self = this.set("reprojectionErrorThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReprojectionErrorThreshold: Self = this.set("reprojectionErrorThreshold", js.undefined)
    @scala.inline
    def setTileGrid(value: TileGrid): Self = this.set("tileGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileGrid: Self = this.set("tileGrid", js.undefined)
    @scala.inline
    def setTileLoadFunction(value: (/* tile */ Tile, /* url */ String) => Unit): Self = this.set("tileLoadFunction", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTileLoadFunction: Self = this.set("tileLoadFunction", js.undefined)
    @scala.inline
    def setTransition(value: Double): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setUrlsVarargs(value: String*): Self = this.set("urls", js.Array(value :_*))
    @scala.inline
    def setUrls(value: js.Array[String]): Self = this.set("urls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
    @scala.inline
    def setWrapX(value: Boolean): Self = this.set("wrapX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapX: Self = this.set("wrapX", js.undefined)
  }
  
}

