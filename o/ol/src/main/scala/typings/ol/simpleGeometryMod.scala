package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geometryLayoutMod.GeometryLayout
import typings.ol.olMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/SimpleGeometry", JSImport.Namespace)
@js.native
object simpleGeometryMod extends js.Object {
  @js.native
  trait SimpleGeometry
    extends typings.ol.geometryMod.default {
    var flatCoordinates: js.Array[Double] = js.native
    var layout: GeometryLayout = js.native
    var stride: Double = js.native
    def getCoordinates(): js.Array[_] = js.native
    def getFirstCoordinate(): Coordinate = js.native
    def getFlatCoordinates(): js.Array[Double] = js.native
    def getLastCoordinate(): Coordinate = js.native
    def getLayout(): GeometryLayout = js.native
    /* protected */ def getSimplifiedGeometryInternal(squaredTolerance: Double): SimpleGeometry = js.native
    def getStride(): Double = js.native
    def setCoordinates(coordinates: js.Array[_]): Unit = js.native
    def setCoordinates(coordinates: js.Array[_], opt_layout: GeometryLayout): Unit = js.native
    def setFlatCoordinates(layout: GeometryLayout, flatCoordinates: js.Array[Double]): Unit = js.native
    /* protected */ def setLayout(layout: js.UndefOr[GeometryLayout], coordinates: js.Array[_], nesting: Double): Unit = js.native
  }
  
  @js.native
  abstract class default () extends SimpleGeometry
  
  def getStrideForLayout(layout: GeometryLayout): Double = js.native
  def transformGeom2D(simpleGeometry: SimpleGeometry, transform: Transform): js.Array[Double] = js.native
  def transformGeom2D(simpleGeometry: SimpleGeometry, transform: Transform, opt_dest: js.Array[Double]): js.Array[Double] = js.native
}

