package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tileQueueMod {
  import typings.ol.coordinateMod.Coordinate

  type PriorityFunction = js.Function4[
    /* p0 */ typings.ol.tileMod.default, 
    /* p1 */ String, 
    /* p2 */ Coordinate, 
    /* p3 */ Double, 
    Double
  ]
}
