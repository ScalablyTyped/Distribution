package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryMod.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomMultiPointMod {
  
  /**
    * @classdesc
    * Multi-point geometry.
    *
    * @api
    */
  @JSImport("ol/geom/MultiPoint", JSImport.Default)
  @js.native
  open class default protected () extends MultiPoint {
    /**
      * @param {Array<import("../coordinate.js").Coordinate>|Array<number>} coordinates Coordinates.
      *     For internal use, flat coordinates in combination with `layout` are also accepted.
      * @param {import("./Geometry.js").GeometryLayout} [layout] Layout.
      */
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], layout: GeometryLayout) = this()
  }
  
  /**
    * @classdesc
    * Multi-point geometry.
    *
    * @api
    */
  @js.native
  trait MultiPoint
    extends typings.ol.geomSimpleGeometryMod.default {
    
    /**
      * Append the passed point to this multipoint.
      * @param {Point} point Point.
      * @api
      */
    def appendPoint(point: typings.ol.geomPointMod.default): Unit = js.native
    
    /**
      * Return the point at the specified index.
      * @param {number} index Index.
      * @return {Point} Point.
      * @api
      */
    def getPoint(index: Double): typings.ol.geomPointMod.default = js.native
    
    /**
      * Return the points of this multipoint.
      * @return {Array<Point>} Points.
      * @api
      */
    def getPoints(): js.Array[typings.ol.geomPointMod.default] = js.native
  }
}
