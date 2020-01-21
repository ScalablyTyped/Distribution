package typings.ol.tileImageMod

import org.scalablytyped.runtime.StringDictionary
import typings.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileImage
  extends typings.ol.urlTileMod.default {
  var crossOrigin: String = js.native
  var tileCacheForProjection: StringDictionary[typings.ol.tileCacheMod.default] = js.native
  var tileClass: typings.ol.imageTileMod.default = js.native
  var tileGridForProjection: StringDictionary[typings.ol.tilegridTileGridMod.default] = js.native
  def getGutter(): Double = js.native
  /* protected */ def getTileInternal(z: Double, x: Double, y: Double, pixelRatio: Double, projection: typings.ol.projectionMod.default): typings.ol.olTileMod.default = js.native
  def setRenderReprojectionEdges(render: Boolean): Unit = js.native
  def setTileGridForProjection(projection: ProjectionLike, tilegrid: typings.ol.tilegridTileGridMod.default): Unit = js.native
}

