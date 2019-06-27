package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tileQueueMod {
  type PriorityFunction = js.Function4[
    /* p0 */ olLib.tileMod.default, 
    /* p1 */ java.lang.String, 
    /* p2 */ olLib.coordinateMod.Coordinate, 
    /* p3 */ scala.Double, 
    scala.Double
  ]
}
