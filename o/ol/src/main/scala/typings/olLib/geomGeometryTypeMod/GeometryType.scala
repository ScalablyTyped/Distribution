package typings
package olLib.geomGeometryTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GeometryType extends js.Object

@JSImport("ol/geom/GeometryType", "GeometryType")
@js.native
object GeometryType extends js.Object {
  @js.native
  sealed trait CIRCLE
    extends olLib.geomGeometryTypeMod.GeometryType
  
  @js.native
  sealed trait GEOMETRY_COLLECTION
    extends olLib.geomGeometryTypeMod.GeometryType
  
  @js.native
  sealed trait LINEAR_RING
    extends olLib.geomGeometryTypeMod.GeometryType
  
  @js.native
  sealed trait LINE_STRING
    extends olLib.geomGeometryTypeMod.GeometryType
  
  @js.native
  sealed trait MULTI_LINE_STRING
    extends olLib.geomGeometryTypeMod.GeometryType
  
  @js.native
  sealed trait MULTI_POINT
    extends olLib.geomGeometryTypeMod.GeometryType
  
  @js.native
  sealed trait MULTI_POLYGON
    extends olLib.geomGeometryTypeMod.GeometryType
  
  @js.native
  sealed trait POINT
    extends olLib.geomGeometryTypeMod.GeometryType
  
  @js.native
  sealed trait POLYGON
    extends olLib.geomGeometryTypeMod.GeometryType
  
}

