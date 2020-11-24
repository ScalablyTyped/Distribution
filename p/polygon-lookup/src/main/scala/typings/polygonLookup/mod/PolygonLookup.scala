package typings.polygonLookup.mod

import typings.geojson.mod.FeatureCollection
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.geojson.mod.Polygon
import typings.rbush.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolygonLookup extends js.Object {
  
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
