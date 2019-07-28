package typings.ol.geomGeometryLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GeometryLayout extends js.Object

@JSImport("ol/geom/GeometryLayout", "GeometryLayout")
@js.native
object GeometryLayout extends js.Object {
  @js.native
  sealed trait XY extends GeometryLayout
  
  @js.native
  sealed trait XYM extends GeometryLayout
  
  @js.native
  sealed trait XYZ extends GeometryLayout
  
  @js.native
  sealed trait XYZM extends GeometryLayout
  
}

