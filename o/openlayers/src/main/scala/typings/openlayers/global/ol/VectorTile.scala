package typings.openlayers.global.ol

import typings.openlayers.mod.Tile.State
import typings.openlayers.mod.TileCoord
import typings.openlayers.mod.TileLoadFunctionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ol.VectorTile")
@js.native
class VectorTile protected ()
  extends typings.openlayers.mod.VectorTile {
  /**
    * @param tileCoord Tile coordinate.
    * @param state State.
    * @param src Data source url.
    * @param format Feature format.
    * @param tileLoadFunction Tile load function.
    */
  def this(
    tileCoord: TileCoord,
    state: State,
    src: String,
    format: typings.openlayers.mod.format.Feature,
    tileLoadFunction: TileLoadFunctionType
  ) = this()
}
