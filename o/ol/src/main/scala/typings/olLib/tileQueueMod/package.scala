package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tileQueueMod {
  type PriorityFunction = js.Function4[
    /* param0 */ olLib.tileMod.default, 
    /* param1 */ java.lang.String, 
    /* param2 */ olLib.coordinateMod.Coordinate, 
    /* param3 */ scala.Double, 
    scala.Double
  ]
}
