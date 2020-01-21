package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object olTileMod {
  type LoadFunction = js.Function2[/* p0 */ typings.ol.olTileMod.Tile, /* p1 */ java.lang.String, scala.Unit]
  type UrlFunction = js.Function3[
    /* p0 */ typings.ol.tilecoordMod.TileCoord, 
    /* p1 */ scala.Double, 
    /* p2 */ typings.ol.projectionMod.default, 
    java.lang.String
  ]
}
