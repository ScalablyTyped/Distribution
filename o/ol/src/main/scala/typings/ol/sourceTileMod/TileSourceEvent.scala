package typings.ol.sourceTileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/source/Tile", "TileSourceEvent")
@js.native
class TileSourceEvent protected ()
  extends typings.ol.eventMod.default {
  def this(`type`: String, tile: typings.ol.olTileMod.default) = this()
  
  /**
    * The tile related to the event.
    */
  var tile: typings.ol.olTileMod.default = js.native
}
