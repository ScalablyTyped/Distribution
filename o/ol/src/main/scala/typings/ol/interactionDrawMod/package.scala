package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interactionDrawMod {
  import typings.ol.coordinateMod.Coordinate

  type GeometryFunction = js.Function2[
    /* p0 */ SketchCoordType, 
    /* p1 */ js.UndefOr[typings.ol.geomSimpleGeometryMod.default], 
    typings.ol.geomSimpleGeometryMod.default
  ]
  type LineCoordType = js.Array[Coordinate]
  type PointCoordType = Coordinate
  type PolyCoordType = js.Array[js.Array[Coordinate]]
  type SketchCoordType = PointCoordType | LineCoordType | PolyCoordType
}
