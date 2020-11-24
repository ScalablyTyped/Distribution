package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object drawMod {
  
  type GeometryFunction = js.Function3[
    /* p0 */ typings.ol.drawMod.SketchCoordType, 
    /* p1 */ js.UndefOr[typings.ol.simpleGeometryMod.default], 
    /* p2 */ js.UndefOr[typings.ol.projectionMod.default], 
    typings.ol.simpleGeometryMod.default
  ]
  
  type LineCoordType = js.Array[typings.ol.coordinateMod.Coordinate]
  
  type PointCoordType = typings.ol.coordinateMod.Coordinate
  
  type PolyCoordType = js.Array[js.Array[typings.ol.coordinateMod.Coordinate]]
  
  type SketchCoordType = typings.ol.drawMod.PointCoordType | typings.ol.drawMod.LineCoordType | typings.ol.drawMod.PolyCoordType
}
