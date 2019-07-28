package typings.ol.geomSimpleGeometryMod

import typings.ol.geomGeometryLayoutMod.GeometryLayout
import typings.ol.transformMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/SimpleGeometry", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getStrideForLayout(layout: GeometryLayout): Double = js.native
  def transformGeom2D(simpleGeometry: SimpleGeometry, transform: Transform): js.Array[Double] = js.native
  def transformGeom2D(simpleGeometry: SimpleGeometry, transform: Transform, opt_dest: js.Array[Double]): js.Array[Double] = js.native
}

