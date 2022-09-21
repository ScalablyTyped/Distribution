package typings.osrm.mod

import typings.osrm.osrmStrings.distance
import typings.osrm.osrmStrings.duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Computes duration table for the given locations. Allows for both symmetric and asymmetric tables. Optionally returns distance table.
  *
  * https://github.com/Project-OSRM/osrm-backend/blob/master/docs/nodejs/api.md#table
  */
trait TableOptions
  extends StObject
     with Options {
  
  /**
    * Return the requested table or tables in response. Can be ['duration'] (return the duration matrix, default) or
    * ['duration', distance'] (return both the duration matrix and the distance matrix).
    */
  var annotations: js.UndefOr[js.Array[duration | distance]] = js.undefined
  
  /**
    * Keep waypoints on curb side. Can be null (unrestricted, default) or curb.
    */
  var approaches: js.UndefOr[ApproachTypes | Null] = js.undefined
  
  /**
    * An array of index elements (0 <= integer < #coordinates) to use location with given index as destination. Default is to use all.
    */
  var destinations: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Which classes to exclude.
    */
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Either input (default) or snapped. If using a fallback_speed, use either the user-supplied coordinate (input),
    * or the snapped coordinate (snapped) for calculating the as-the-crow-flies distance between two points.
    */
  var fallback_coordinate: js.UndefOr[FallbackCoordinateTypes] = js.undefined
  
  /**
    * Replace null responses in result with as-the-crow-flies estimates based on fallback_speed. Value is in metres/second.
    */
  var fallback_speed: js.UndefOr[Double] = js.undefined
  
  /**
    * Multiply the table duration values in the table by this number for more controlled input into a route optimization solver.
    */
  var scale_factor: js.UndefOr[Double] = js.undefined
  
  /**
    * Which edges can be snapped to, either default, or any. default only snaps to edges marked by the profile as is_startpoint,
    * any will allow snapping to any edge in the routing graph.
    */
  var snapping: js.UndefOr[SnappingTypes] = js.undefined
  
  /**
    * An array of index elements (0 <= integer < #coordinates) to use location with given index as source. Default is to use all.
    */
  var sources: js.UndefOr[js.Array[Double]] = js.undefined
}
object TableOptions {
  
  inline def apply(): TableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableOptions]
  }
  
  extension [Self <: TableOptions](x: Self) {
    
    inline def setAnnotations(value: js.Array[duration | distance]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: (duration | distance)*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setApproaches(value: ApproachTypes): Self = StObject.set(x, "approaches", value.asInstanceOf[js.Any])
    
    inline def setApproachesNull: Self = StObject.set(x, "approaches", null)
    
    inline def setApproachesUndefined: Self = StObject.set(x, "approaches", js.undefined)
    
    inline def setDestinations(value: js.Array[Double]): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: Double*): Self = StObject.set(x, "destinations", js.Array(value*))
    
    inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setFallback_coordinate(value: FallbackCoordinateTypes): Self = StObject.set(x, "fallback_coordinate", value.asInstanceOf[js.Any])
    
    inline def setFallback_coordinateUndefined: Self = StObject.set(x, "fallback_coordinate", js.undefined)
    
    inline def setFallback_speed(value: Double): Self = StObject.set(x, "fallback_speed", value.asInstanceOf[js.Any])
    
    inline def setFallback_speedUndefined: Self = StObject.set(x, "fallback_speed", js.undefined)
    
    inline def setScale_factor(value: Double): Self = StObject.set(x, "scale_factor", value.asInstanceOf[js.Any])
    
    inline def setScale_factorUndefined: Self = StObject.set(x, "scale_factor", js.undefined)
    
    inline def setSnapping(value: SnappingTypes): Self = StObject.set(x, "snapping", value.asInstanceOf[js.Any])
    
    inline def setSnappingUndefined: Self = StObject.set(x, "snapping", js.undefined)
    
    inline def setSources(value: js.Array[Double]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: Double*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
