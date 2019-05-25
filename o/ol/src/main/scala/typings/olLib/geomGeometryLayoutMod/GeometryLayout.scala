package typings
package olLib.geomGeometryLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GeometryLayout extends js.Object

@JSImport("ol/geom/GeometryLayout", "GeometryLayout")
@js.native
object GeometryLayout extends js.Object {
  @js.native
  sealed trait XY
    extends olLib.geomGeometryLayoutMod.GeometryLayout
  
  @js.native
  sealed trait XYM
    extends olLib.geomGeometryLayoutMod.GeometryLayout
  
  @js.native
  sealed trait XYZ
    extends olLib.geomGeometryLayoutMod.GeometryLayout
  
  @js.native
  sealed trait XYZM
    extends olLib.geomGeometryLayoutMod.GeometryLayout
  
}

