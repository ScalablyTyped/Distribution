package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tileMod {
  type LoadFunction = js.Function2[/* param0 */ Tile, /* param1 */ java.lang.String, scala.Unit]
  type UrlFunction = js.Function3[
    /* param0 */ olLib.tilecoordMod.TileCoord, 
    /* param1 */ scala.Double, 
    /* param2 */ olLib.projProjectionMod.default, 
    java.lang.String
  ]
}
