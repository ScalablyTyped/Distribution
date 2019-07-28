package typings.ol

import typings.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tileQueueMod {
  type PriorityFunction = js.Function4[
    /* p0 */ typings.ol.tileMod.default, 
    /* p1 */ String, 
    /* p2 */ Coordinate, 
    /* p3 */ Double, 
    Double
  ]
}
