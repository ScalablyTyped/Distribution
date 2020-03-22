package typings.ol.sourceVectorTileMod

import typings.ol.extentMod.Extent
import typings.ol.olFeatureMod.FeatureLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorTile
  extends typings.ol.urlTileMod.default {
  var tileClass: typings.ol.olVectorTileMod.default = js.native
  def getFeaturesInExtent(extent: Extent): js.Array[FeatureLike] = js.native
  def getOverlaps(): Boolean = js.native
  def getSourceTiles(
    pixelRatio: Double,
    projection: typings.ol.projectionMod.default,
    tile: typings.ol.vectorRenderTileMod.default
  ): js.Array[typings.ol.olVectorTileMod.default] = js.native
}

