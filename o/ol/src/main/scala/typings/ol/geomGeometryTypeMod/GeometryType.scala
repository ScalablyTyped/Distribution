package typings.ol.geomGeometryTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GeometryType extends js.Object

@JSImport("ol/geom/GeometryType", "GeometryType")
@js.native
object GeometryType extends js.Object {
  @js.native
  sealed trait CIRCLE extends GeometryType
  
  @js.native
  sealed trait GEOMETRY_COLLECTION extends GeometryType
  
  @js.native
  sealed trait LINEAR_RING extends GeometryType
  
  @js.native
  sealed trait LINE_STRING extends GeometryType
  
  @js.native
  sealed trait MULTI_LINE_STRING extends GeometryType
  
  @js.native
  sealed trait MULTI_POINT extends GeometryType
  
  @js.native
  sealed trait MULTI_POLYGON extends GeometryType
  
  @js.native
  sealed trait POINT extends GeometryType
  
  @js.native
  sealed trait POLYGON extends GeometryType
  
}

