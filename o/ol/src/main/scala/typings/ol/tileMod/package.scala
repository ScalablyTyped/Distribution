package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tileMod {
  import typings.ol.tilecoordMod.TileCoord

  type LoadFunction = js.Function2[/* p0 */ Tile, /* p1 */ String, Unit]
  type UrlFunction = js.Function3[
    /* p0 */ TileCoord, 
    /* p1 */ Double, 
    /* p2 */ typings.ol.projProjectionMod.default, 
    js.UndefOr[String]
  ]
}
