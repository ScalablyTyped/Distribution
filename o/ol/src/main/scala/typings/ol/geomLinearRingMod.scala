package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryMod.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomLinearRingMod {
  
  /**
    * @classdesc
    * Linear ring geometry. Only used as part of polygon; cannot be rendered
    * on its own.
    *
    * @api
    */
  @JSImport("ol/geom/LinearRing", JSImport.Default)
  @js.native
  open class default protected () extends LinearRing {
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
    * Linear ring geometry. Only used as part of polygon; cannot be rendered
    * on its own.
    *
    * @api
    */
  @js.native
  trait LinearRing
    extends typings.ol.geomSimpleGeometryMod.default {
    
    /**
      * Return the area of the linear ring on projected plane.
      * @return {number} Area (on projected plane).
      * @api
      */
    def getArea(): Double = js.native
    
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
  }
}
