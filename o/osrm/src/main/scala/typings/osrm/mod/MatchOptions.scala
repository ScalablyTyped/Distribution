package typings.osrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Map matching matches given GPS points to the road network in the most plausible way.
  * Please note the request might result multiple sub-traces.
  * Large jumps in the timestamps (>60s) or improbable transitions lead to trace splits if a complete matching could not be found.
  * The algorithm might not be able to match all points. Outliers are removed if they can not be matched successfully.
  *
  * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md#tile
  */
trait MatchOptions
  extends StObject
     with Options {
  
  /**
    * Return annotations for each route leg for duration, nodes, distance, weight, datasources and/or speed.
    * Annotations can be false or true (no/full annotations) or an array of strings with duration, nodes, distance, weight, datasources, speed. (optional, default false)
    */
  var annotations: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  
  /**
    * Returned route geometry format (influences overview and per step). Can also be geojson. (optional, default polyline)
    */
  var geometries: js.UndefOr[String] = js.undefined
  
  /**
    * Add overview geometry either full, simplified according to highest zoom level it could be display on, or not at all (false). (optional, default simplified)
    */
  var overview: js.UndefOr[String] = js.undefined
  
  /**
    * Standard deviation of GPS precision used for map matching. If applicable use GPS accuracy (double >= 0, default 5m).
    */
  @JSName("radiuses")
  var radiuses_MatchOptions: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Return route steps for each route. (optional, default false)
    */
  var steps: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Timestamp of the input location (integers, UNIX-like timestamp).
    */
  var timestamps: js.UndefOr[js.Array[Double]] = js.undefined
}
object MatchOptions {
  
  inline def apply(): MatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchOptions]
  }
  
  extension [Self <: MatchOptions](x: Self) {
    
    inline def setAnnotations(value: Boolean | js.Array[String]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: String*): Self = StObject.set(x, "annotations", js.Array(value :_*))
    
    inline def setGeometries(value: String): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    inline def setGeometriesUndefined: Self = StObject.set(x, "geometries", js.undefined)
    
    inline def setOverview(value: String): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    inline def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
    
    inline def setRadiuses(value: js.Array[Double]): Self = StObject.set(x, "radiuses", value.asInstanceOf[js.Any])
    
    inline def setRadiusesUndefined: Self = StObject.set(x, "radiuses", js.undefined)
    
    inline def setRadiusesVarargs(value: Double*): Self = StObject.set(x, "radiuses", js.Array(value :_*))
    
    inline def setSteps(value: Boolean): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    inline def setTimestamps(value: js.Array[Double]): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
    
    inline def setTimestampsUndefined: Self = StObject.set(x, "timestamps", js.undefined)
    
    inline def setTimestampsVarargs(value: Double*): Self = StObject.set(x, "timestamps", js.Array(value :_*))
  }
}
