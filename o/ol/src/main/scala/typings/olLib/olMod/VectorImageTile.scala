package typings
package olLib.olMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "VectorImageTile")
@js.native
class VectorImageTile protected ()
  extends olLib.vectorImageTileMod.default {
  def this(tileCoord: olLib.tilecoordMod.TileCoord, state: olLib.tileStateMod.TileState, sourceRevision: scala.Double, format: olLib.formatFeatureMod.default, tileLoadFunction: olLib.tileMod.LoadFunction, urlTileCoord: olLib.tilecoordMod.TileCoord, tileUrlFunction: olLib.tileMod.UrlFunction, sourceTileGrid: olLib.tilegridTileGridMod.default, tileGrid: olLib.tilegridTileGridMod.default, sourceTiles: org.scalablytyped.runtime.StringDictionary[olLib.vectorTileMod.default], pixelRatio: scala.Double, projection: olLib.projProjectionMod.default, tileClass: olLib.vectorTileMod.default, handleTileChange: js.ThisFunction1[
      /* this */ olLib.sourceVectorTileMod.default, 
      /* p1 */ olLib.eventsEventMod.default, 
      scala.Unit
    ], zoom: scala.Double) = this()
}

