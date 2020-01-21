package typings.ol.sourceVectorTileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorTile
  extends typings.ol.urlTileMod.default {
  var tileClass: typings.ol.olVectorTileMod.default = js.native
  def addSourceTiles(
    tile: typings.ol.vectorRenderTileMod.default,
    sourceTiles: js.Array[typings.ol.olVectorTileMod.default]
  ): Unit = js.native
  def getOverlaps(): Boolean = js.native
  def getSourceTiles(
    pixelRatio: Double,
    projection: typings.ol.projectionMod.default,
    tile: typings.ol.vectorRenderTileMod.default
  ): js.Array[typings.ol.olVectorTileMod.default] = js.native
  def removeSourceTiles(tile: typings.ol.vectorRenderTileMod.default): Unit = js.native
}

