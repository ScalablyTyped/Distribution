package typings
package olLib.sourceTileImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileImage
  extends olLib.sourceUrlTileMod.default {
  var crossOrigin: java.lang.String = js.native
  var tileCacheForProjection: org.scalablytyped.runtime.StringDictionary[olLib.tileCacheMod.default] = js.native
  var tileClass: olLib.imageTileMod.default = js.native
  var tileGridForProjection: org.scalablytyped.runtime.StringDictionary[olLib.tilegridTileGridMod.default] = js.native
  def getGutter(): scala.Double = js.native
  /* protected */ def getTileInternal(
    z: scala.Double,
    x: scala.Double,
    y: scala.Double,
    pixelRatio: scala.Double,
    projection: olLib.projProjectionMod.default
  ): olLib.tileMod.default = js.native
  def setRenderReprojectionEdges(render: scala.Boolean): scala.Unit = js.native
  def setTileGridForProjection(projection: olLib.projMod.ProjectionLike, tilegrid: olLib.tilegridTileGridMod.default): scala.Unit = js.native
}

