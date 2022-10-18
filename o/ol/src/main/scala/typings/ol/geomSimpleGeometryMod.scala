package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryLayoutMod.GeometryLayout
import typings.ol.transformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomSimpleGeometryMod {
  
  @JSImport("ol/geom/SimpleGeometry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("ol/geom/SimpleGeometry", JSImport.Default)
  @js.native
  open class default () extends SimpleGeometry
  
  inline def getStrideForLayout(layout: GeometryLayout): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStrideForLayout")(layout.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def transformGeom2D(simpleGeometry: SimpleGeometry, transform: Transform): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformGeom2D")(simpleGeometry.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def transformGeom2D(simpleGeometry: SimpleGeometry, transform: Transform, opt_dest: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformGeom2D")(simpleGeometry.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], opt_dest.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @js.native
  trait SimpleGeometry
    extends typings.ol.geomGeometryMod.default {
    
    /* protected */ var flatCoordinates: js.Array[Double] = js.native
    
    def getCoordinates(): js.Array[Any] = js.native
    
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
    
    /* protected */ var layout: GeometryLayout = js.native
    
    def setCoordinates(coordinates: js.Array[Any]): Unit = js.native
    def setCoordinates(coordinates: js.Array[Any], opt_layout: GeometryLayout): Unit = js.native
    
    def setFlatCoordinates(layout: GeometryLayout, flatCoordinates: js.Array[Double]): Unit = js.native
    
    /* protected */ def setLayout(layout: Unit, coordinates: js.Array[Any], nesting: Double): Unit = js.native
    /* protected */ def setLayout(layout: GeometryLayout, coordinates: js.Array[Any], nesting: Double): Unit = js.native
    
    /* protected */ var stride: Double = js.native
  }
}
