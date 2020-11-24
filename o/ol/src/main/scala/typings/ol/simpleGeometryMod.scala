package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geometryLayoutMod.GeometryLayout
import typings.ol.olMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/geom/SimpleGeometry", JSImport.Namespace)
@js.native
object simpleGeometryMod extends js.Object {
  
  def getStrideForLayout(layout: GeometryLayout): Double = js.native
  
  def transformGeom2D(simpleGeometry: SimpleGeometry, transform: Transform): js.Array[Double] = js.native
  def transformGeom2D(simpleGeometry: SimpleGeometry, transform: Transform, opt_dest: js.Array[Double]): js.Array[Double] = js.native
  
  @js.native
  trait SimpleGeometry
    extends typings.ol.geometryMod.default {
    
    var flatCoordinates: js.Array[Double] = js.native
    
    def getCoordinates(): js.Array[_] = js.native
    
    /**
      * Return the first coordinate of the geometry.
      */
    def getFirstCoordinate(): Coordinate = js.native
    
    def getFlatCoordinates(): js.Array[Double] = js.native
    
    /**
      * Return the last coordinate of the geometry.
      */
    def getLastCoordinate(): Coordinate = js.native
    
    /**
      * Return the {@link module:ol/geom/GeometryLayout layout} of the geometry.
      */
    def getLayout(): GeometryLayout = js.native
    
    /* protected */ def getSimplifiedGeometryInternal(squaredTolerance: Double): SimpleGeometry = js.native
    
    def getStride(): Double = js.native
    
    var layout: GeometryLayout = js.native
    
    def setCoordinates(coordinates: js.Array[_]): Unit = js.native
    def setCoordinates(coordinates: js.Array[_], opt_layout: GeometryLayout): Unit = js.native
    
    def setFlatCoordinates(layout: GeometryLayout, flatCoordinates: js.Array[Double]): Unit = js.native
    
    /* protected */ def setLayout(layout: js.UndefOr[scala.Nothing], coordinates: js.Array[_], nesting: Double): Unit = js.native
    /* protected */ def setLayout(layout: GeometryLayout, coordinates: js.Array[_], nesting: Double): Unit = js.native
    
    var stride: Double = js.native
  }
  
  @js.native
  abstract class default () extends SimpleGeometry
}
