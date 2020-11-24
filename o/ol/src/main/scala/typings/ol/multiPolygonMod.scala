package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/geom/MultiPolygon", JSImport.Namespace)
@js.native
object multiPolygonMod extends js.Object {
  
  @js.native
  trait MultiPolygon
    extends typings.ol.simpleGeometryMod.default {
    
    /**
      * Append the passed polygon to this multipolygon.
      */
    def appendPolygon(polygon: typings.ol.polygonMod.default): Unit = js.native
    
    /**
      * Return the area of the multipolygon on projected plane.
      */
    def getArea(): Double = js.native
    
    def getCoordinates(opt_right: Boolean): js.Array[js.Array[js.Array[Coordinate]]] = js.native
    
    def getEndss(): js.Array[js.Array[Double]] = js.native
    
    def getFlatInteriorPoints(): js.Array[Double] = js.native
    
    /**
      * Return the interior points as {@link module:ol/geom/MultiPoint multipoint}.
      */
    def getInteriorPoints(): typings.ol.multiPointMod.default = js.native
    
    def getOrientedFlatCoordinates(): js.Array[Double] = js.native
    
    /**
      * Return the polygon at the specified index.
      */
    def getPolygon(index: Double): typings.ol.polygonMod.default = js.native
    
    /**
      * Return the polygons of this multipolygon.
      */
    def getPolygons(): js.Array[typings.ol.polygonMod.default] = js.native
  }
  
  @js.native
  class default protected () extends MultiPolygon {
    def this(coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typings.ol.polygonMod.default]) = this()
    def this(
      coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typings.ol.polygonMod.default],
      opt_layout: GeometryLayout
    ) = this()
    def this(
      coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typings.ol.polygonMod.default],
      opt_layout: js.UndefOr[scala.Nothing],
      opt_endss: js.Array[js.Array[Double]]
    ) = this()
    def this(
      coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typings.ol.polygonMod.default],
      opt_layout: GeometryLayout,
      opt_endss: js.Array[js.Array[Double]]
    ) = this()
  }
}
