package typings.polygonLookup

import typings.geojson.mod.FeatureCollection
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.geojson.mod.Polygon
import typings.rbush.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("polygon-lookup", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with PolygonLookup {
    def this(featureCollection: FeatureCollection[Geometry, GeoJsonProperties]) = this()
  }
  
  trait BBox extends StObject {
    
    var maxX: Double
    
    var maxY: Double
    
    var minX: Double
    
    var minY: Double
  }
  object BBox {
    
    inline def apply(maxX: Double, maxY: Double, minX: Double, minY: Double): BBox = {
      val __obj = js.Dynamic.literal(maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any])
      __obj.asInstanceOf[BBox]
    }
    
    extension [Self <: BBox](x: Self) {
      
      inline def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
      
      inline def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
      
      inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PolygonLookup extends StObject {
    
    /**
      * Build a spatial index for a set of polygons, and store both the polygons and
      * the index in this `PolygonLookup`.
      *
      * @param collection A GeoJSON-formatted `FeatureCollection`.
      */
    def loadFeatureCollection(collection: FeatureCollection[Geometry, GeoJsonProperties]): Unit = js.native
    
    var polygons: FeatureCollection[Geometry, GeoJsonProperties] = js.native
    
    /** A spatial index for `this.polygons`. */
    var rtree: default[js.Array[BBox]] = js.native
    
    /**
      * Find polygon(s) that a point intersects. Execute a bounding-box search to
      * narrow down the candidate polygons to a small subset, and then perform
      * additional point-in-polygon intersections to resolve any ambiguities.
      *
      * @param x The x-coordinate of the point.
      * @param y The y-coordinate of the point.
      * @param limit Number of results to return (`-1` to return all the results).
      * @return  If one or more bounding box intersections are
      * found and limit is `undefined`, return the first polygon that intersects
      * (`x`, `y`); otherwise, `undefined`. If a limit is passed in, return
      * intersecting polygons as a GeoJSON `FeatureCollection`.
      */
    def search(x: Double, y: Double): js.UndefOr[Polygon] = js.native
    def search(x: Double, y: Double, limit: Double): js.UndefOr[FeatureCollection[Geometry, GeoJsonProperties]] = js.native
  }
}
