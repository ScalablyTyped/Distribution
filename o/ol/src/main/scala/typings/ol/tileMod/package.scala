package typings.ol

import typings.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tileMod {
  type LoadFunction = js.Function2[/* p0 */ Tile, /* p1 */ String, Unit]
  type UrlFunction = js.Function3[
    /* p0 */ TileCoord, 
    /* p1 */ Double, 
    /* p2 */ typings.ol.projProjectionMod.default, 
    String
  ]
}
