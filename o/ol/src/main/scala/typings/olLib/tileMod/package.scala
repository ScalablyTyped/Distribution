package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tileMod {
  type LoadFunction = js.Function2[/* p0 */ Tile, /* p1 */ java.lang.String, scala.Unit]
  type UrlFunction = js.Function3[
    /* p0 */ olLib.tilecoordMod.TileCoord, 
    /* p1 */ scala.Double, 
    /* p2 */ olLib.projProjectionMod.default, 
    java.lang.String
  ]
}
