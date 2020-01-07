package typings.ol.sourceVectorTileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorTile
  extends typings.ol.sourceUrlTileMod.default {
  var tileClass: typings.ol.vectorTileMod.default = js.native
  def addSourceTiles(
    tile: typings.ol.vectorRenderTileMod.default,
    sourceTiles: js.Array[typings.ol.vectorTileMod.default]
  ): Unit = js.native
  def getOverlaps(): Boolean = js.native
  def getSourceTiles(
    pixelRatio: Double,
    projection: typings.ol.projProjectionMod.default,
    tile: typings.ol.vectorRenderTileMod.default
  ): js.Array[typings.ol.vectorTileMod.default] = js.native
  def removeSourceTiles(tile: typings.ol.vectorRenderTileMod.default): Unit = js.native
}

