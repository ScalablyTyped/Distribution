package typings.openlayers.global.ol

import typings.openlayers.mod.Tile.State
import typings.openlayers.mod.TileCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ol.Tile")
@js.native
open class Tile protected ()
  extends typings.openlayers.mod.Tile {
  /**
    * @classdesc
    * Base class for tiles.
    *
    * @param tileCoord Tile coordinate.
    * @param state State.
    */
  def this(tileCoord: TileCoord, state: State) = this()
}
