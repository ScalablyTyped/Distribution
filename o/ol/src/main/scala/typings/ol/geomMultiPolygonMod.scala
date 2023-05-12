package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryMod.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomMultiPolygonMod {
  
  /**
    * @classdesc
    * Multi-polygon geometry.
    *
    * @api
    */
  @JSImport("ol/geom/MultiPolygon", JSImport.Default)
  @js.native
  open class default protected () extends MultiPolygon {
    /**
      * @param {Array<Array<Array<import("../coordinate.js").Coordinate>>|Polygon>|Array<number>} coordinates Coordinates.
      *     For internal use, flat coordinates in combination with `layout` and `endss` are also accepted.
      * @param {import("./Geometry.js").GeometryLayout} [layout] Layout.
      * @param {Array<Array<number>>} [endss] Array of ends for internal use with flat coordinates.
      */
    def this(coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typings.ol.geomPolygonMod.default]) = this()
    def this(
      coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typings.ol.geomPolygonMod.default],
      layout: GeometryLayout
    ) = this()
    def this(
      coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typings.ol.geomPolygonMod.default],
      layout: Unit,
      endss: js.Array[js.Array[Double]]
    ) = this()
    def this(
      coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typings.ol.geomPolygonMod.default],
      layout: GeometryLayout,
      endss: js.Array[js.Array[Double]]
    ) = this()
  }
  
  /**
    * @classdesc
    * Multi-polygon geometry.
    *
    * @api
    */
  @js.native
  trait MultiPolygon
    extends typings.ol.geomSimpleGeometryMod.default {
    
    /**
      * Append the passed polygon to this multipolygon.
      * @param {Polygon} polygon Polygon.
      * @api
      */
    def appendPolygon(polygon: typings.ol.geomPolygonMod.default): Unit = js.native
    
    /**
      * @type {Array<Array<number>>}
      * @private
      */
    /* private */ var endss_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var flatInteriorPointsRevision_ : Any = js.native
    
    /**
      * @private
      * @type {Array<number>}
      */
    /* private */ var flatInteriorPoints_ : Any = js.native
    
    /**
      * Return the area of the multipolygon on projected plane.
      * @return {number} Area (on projected plane).
      * @api
      */
    def getArea(): Double = js.native
    
    def getCoordinates(right: Boolean): js.Array[js.Array[js.Array[Coordinate]]] = js.native
    
    /**
      * @return {Array<Array<number>>} Endss.
      */
    def getEndss(): js.Array[js.Array[Double]] = js.native
    
    /**
      * @return {Array<number>} Flat interior points.
      */
    def getFlatInteriorPoints(): js.Array[Double] = js.native
    
    /**
      * Return the interior points as {@link module:ol/geom/MultiPoint~MultiPoint multipoint}.
      * @return {MultiPoint} Interior points as XYM coordinates, where M is
      * the length of the horizontal intersection that the point belongs to.
      * @api
      */
    def getInteriorPoints(): typings.ol.geomMultiPointMod.default = js.native
    
    /**
      * @return {Array<number>} Oriented flat coordinates.
      */
    def getOrientedFlatCoordinates(): js.Array[Double] = js.native
    
    /**
      * Return the polygon at the specified index.
      * @param {number} index Index.
      * @return {Polygon} Polygon.
      * @api
      */
    def getPolygon(index: Double): typings.ol.geomPolygonMod.default = js.native
    
    /**
      * Return the polygons of this multipolygon.
      * @return {Array<Polygon>} Polygons.
      * @api
      */
    def getPolygons(): js.Array[typings.ol.geomPolygonMod.default] = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var maxDeltaRevision_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var maxDelta_ : Any = js.native
    
    /**
      * @private
      * @type {Array<number>}
      */
    /* private */ var orientedFlatCoordinates_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var orientedRevision_ : Any = js.native
  }
}
