package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interactionDrawMod {
  type GeometryFunction = js.Function2[
    /* p0 */ SketchCoordType, 
    /* p1 */ js.UndefOr[olLib.geomSimpleGeometryMod.default], 
    olLib.geomSimpleGeometryMod.default
  ]
  type LineCoordType = js.Array[olLib.coordinateMod.Coordinate]
  type PointCoordType = olLib.coordinateMod.Coordinate
  type PolyCoordType = js.Array[js.Array[olLib.coordinateMod.Coordinate]]
  type SketchCoordType = PointCoordType | LineCoordType | PolyCoordType
}
