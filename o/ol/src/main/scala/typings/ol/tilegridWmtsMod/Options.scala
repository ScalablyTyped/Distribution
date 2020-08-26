package typings.ol.tilegridWmtsMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.sizeMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var extent: js.UndefOr[Extent] = js.native
  var matrixIds: js.Array[String] = js.native
  var origin: js.UndefOr[Coordinate] = js.native
  var origins: js.UndefOr[js.Array[Coordinate]] = js.native
  var resolutions: js.Array[Double] = js.native
  var sizes: js.UndefOr[js.Array[Size]] = js.native
  var tileSize: js.UndefOr[Double | Size] = js.native
  var tileSizes: js.UndefOr[js.Array[Size]] = js.native
}

object Options {
  @scala.inline
  def apply(matrixIds: js.Array[String], resolutions: js.Array[Double]): Options = {
    val __obj = js.Dynamic.literal(matrixIds = matrixIds.asInstanceOf[js.Any], resolutions = resolutions.asInstanceOf[js.Any])
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
    def setMatrixIdsVarargs(value: String*): Self = this.set("matrixIds", js.Array(value :_*))
    @scala.inline
    def setMatrixIds(value: js.Array[String]): Self = this.set("matrixIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolutionsVarargs(value: Double*): Self = this.set("resolutions", js.Array(value :_*))
    @scala.inline
    def setResolutions(value: js.Array[Double]): Self = this.set("resolutions", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtent(value: Extent): Self = this.set("extent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    @scala.inline
    def setOriginVarargs(value: Double*): Self = this.set("origin", js.Array(value :_*))
    @scala.inline
    def setOrigin(value: Coordinate): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setOriginsVarargs(value: Coordinate*): Self = this.set("origins", js.Array(value :_*))
    @scala.inline
    def setOrigins(value: js.Array[Coordinate]): Self = this.set("origins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigins: Self = this.set("origins", js.undefined)
    @scala.inline
    def setSizesVarargs(value: Size*): Self = this.set("sizes", js.Array(value :_*))
    @scala.inline
    def setSizes(value: js.Array[Size]): Self = this.set("sizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
    @scala.inline
    def setTileSize(value: Double | Size): Self = this.set("tileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileSize: Self = this.set("tileSize", js.undefined)
    @scala.inline
    def setTileSizesVarargs(value: Size*): Self = this.set("tileSizes", js.Array(value :_*))
    @scala.inline
    def setTileSizes(value: js.Array[Size]): Self = this.set("tileSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileSizes: Self = this.set("tileSizes", js.undefined)
  }
  
}

