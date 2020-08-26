package typings.ol.wmtsMod

import typings.ol.olTileMod.LoadFunction
import typings.ol.olTileMod.Tile
import typings.ol.pluggableMapMod.FrameState
import typings.ol.projMod.ProjectionLike
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.wmtsrequestencodingMod.WMTSRequestEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.native
  var cacheSize: js.UndefOr[Double] = js.native
  var crossOrigin: js.UndefOr[String] = js.native
  var dimensions: js.UndefOr[js.Any] = js.native
  var format: js.UndefOr[String] = js.native
  var layer: String = js.native
  var matrixSet: String = js.native
  var projection: js.UndefOr[ProjectionLike] = js.native
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.native
  var requestEncoding: js.UndefOr[WMTSRequestEncoding | String] = js.native
  var style: String = js.native
  var tileClass: js.UndefOr[typings.ol.imageTileMod.default] = js.native
  var tileGrid: typings.ol.tilegridWmtsMod.default = js.native
  var tileLoadFunction: js.UndefOr[LoadFunction] = js.native
  var tilePixelRatio: js.UndefOr[Double] = js.native
  var transition: js.UndefOr[Double] = js.native
  var url: js.UndefOr[String] = js.native
  var urls: js.UndefOr[js.Array[String]] = js.native
  var version: js.UndefOr[String] = js.native
  var wrapX: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(layer: String, matrixSet: String, style: String, tileGrid: typings.ol.tilegridWmtsMod.default): Options = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], matrixSet = matrixSet.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tileGrid = tileGrid.asInstanceOf[js.Any])
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
    def setLayer(value: String): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatrixSet(value: String): Self = this.set("matrixSet", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setTileGrid(value: typings.ol.tilegridWmtsMod.default): Self = this.set("tileGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributionsVarargs(value: String*): Self = this.set("attributions", js.Array(value :_*))
    @scala.inline
    def setAttributionsFunction1(value: /* p0 */ FrameState => String | js.Array[String]): Self = this.set("attributions", js.Any.fromFunction1(value))
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
    def setDimensions(value: js.Any): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setProjection(value: ProjectionLike): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setReprojectionErrorThreshold(value: Double): Self = this.set("reprojectionErrorThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReprojectionErrorThreshold: Self = this.set("reprojectionErrorThreshold", js.undefined)
    @scala.inline
    def setRequestEncoding(value: WMTSRequestEncoding | String): Self = this.set("requestEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestEncoding: Self = this.set("requestEncoding", js.undefined)
    @scala.inline
    def setTileClass(value: typings.ol.imageTileMod.default): Self = this.set("tileClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileClass: Self = this.set("tileClass", js.undefined)
    @scala.inline
    def setTileLoadFunction(value: (/* p0 */ Tile, /* p1 */ String) => Unit): Self = this.set("tileLoadFunction", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTileLoadFunction: Self = this.set("tileLoadFunction", js.undefined)
    @scala.inline
    def setTilePixelRatio(value: Double): Self = this.set("tilePixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTilePixelRatio: Self = this.set("tilePixelRatio", js.undefined)
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
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setWrapX(value: Boolean): Self = this.set("wrapX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapX: Self = this.set("wrapX", js.undefined)
  }
  
}

