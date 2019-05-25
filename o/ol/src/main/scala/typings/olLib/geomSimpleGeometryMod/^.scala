package typings
package olLib.geomSimpleGeometryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/SimpleGeometry", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getStrideForLayout(layout: olLib.geomGeometryLayoutMod.GeometryLayout): scala.Double = js.native
  def transformGeom2D(simpleGeometry: SimpleGeometry, transform: olLib.transformMod.Transform): js.Array[scala.Double] = js.native
  def transformGeom2D(
    simpleGeometry: SimpleGeometry,
    transform: olLib.transformMod.Transform,
    opt_dest: js.Array[scala.Double]
  ): js.Array[scala.Double] = js.native
}

