package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryMod.GeometryLayout
import typings.ol.transformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomSimpleGeometryMod {
  
  @JSImport("ol/geom/SimpleGeometry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @classdesc
    * Abstract base class; only used for creating subclasses; do not instantiate
    * in apps, as cannot be rendered.
    *
    * @abstract
    * @api
    */
  @JSImport("ol/geom/SimpleGeometry", JSImport.Default)
  @js.native
  open class default () extends SimpleGeometry
  
  inline def getStrideForLayout(layout: GeometryLayout): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStrideForLayout")(layout.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def transformGeom2D(simpleGeometry: SimpleGeometry, transform: Transform): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformGeom2D")(simpleGeometry.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def transformGeom2D(simpleGeometry: SimpleGeometry, transform: Transform, dest: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformGeom2D")(simpleGeometry.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /**
    * @classdesc
    * Abstract base class; only used for creating subclasses; do not instantiate
    * in apps, as cannot be rendered.
    *
    * @abstract
    * @api
    */
  @js.native
  trait SimpleGeometry
    extends typings.ol.geomGeometryMod.default {
    
    /**
      * @protected
      * @type {Array<number>}
      */
    /* protected */ var flatCoordinates: js.Array[Double] = js.native
    
    /**
      * @abstract
      * @return {Array<*> | null} Coordinates.
      */
    def getCoordinates(): js.Array[Any] | Null = js.native
    
    /**
      * Return the first coordinate of the geometry.
      * @return {import("../coordinate.js").Coordinate} First coordinate.
      * @api
      */
    def getFirstCoordinate(): Coordinate = js.native
    
    /**
      * @return {Array<number>} Flat coordinates.
      */
    def getFlatCoordinates(): js.Array[Double] = js.native
    
    /**
      * Return the last coordinate of the geometry.
      * @return {import("../coordinate.js").Coordinate} Last point.
      * @api
      */
    def getLastCoordinate(): Coordinate = js.native
    
    /**
      * Return the {@link import("./Geometry.js").GeometryLayout layout} of the geometry.
      * @return {import("./Geometry.js").GeometryLayout} Layout.
      * @api
      */
    def getLayout(): GeometryLayout = js.native
    
    /**
      * @param {number} squaredTolerance Squared tolerance.
      * @return {SimpleGeometry} Simplified geometry.
      * @protected
      */
    /* protected */ def getSimplifiedGeometryInternal(squaredTolerance: Double): SimpleGeometry = js.native
    
    /**
      * @return {number} Stride.
      */
    def getStride(): Double = js.native
    
    /**
      * @protected
      * @type {import("./Geometry.js").GeometryLayout}
      */
    /* protected */ var layout: GeometryLayout = js.native
    
    /**
      * @abstract
      * @param {!Array<*>} coordinates Coordinates.
      * @param {import("./Geometry.js").GeometryLayout} [layout] Layout.
      */
    def setCoordinates(coordinates: js.Array[Any]): Unit = js.native
    def setCoordinates(coordinates: js.Array[Any], layout: GeometryLayout): Unit = js.native
    
    /**
      * @param {import("./Geometry.js").GeometryLayout} layout Layout.
      * @param {Array<number>} flatCoordinates Flat coordinates.
      */
    def setFlatCoordinates(layout: GeometryLayout, flatCoordinates: js.Array[Double]): Unit = js.native
    
    /* protected */ def setLayout(layout: Unit, coordinates: js.Array[Any], nesting: Double): Unit = js.native
    /**
      * @param {import("./Geometry.js").GeometryLayout|undefined} layout Layout.
      * @param {Array<*>} coordinates Coordinates.
      * @param {number} nesting Nesting.
      * @protected
      */
    /* protected */ def setLayout(layout: GeometryLayout, coordinates: js.Array[Any], nesting: Double): Unit = js.native
    
    /**
      * @protected
      * @type {number}
      */
    /* protected */ var stride: Double = js.native
  }
}
