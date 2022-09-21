package typings.osrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Snaps a coordinate to the street network and returns the nearest n matches.
  *
  * Note: coordinates in the general options only supports a single {longitude},{latitude} entry.
  *
  * https://github.com/Project-OSRM/osrm-backend/blob/master/docs/nodejs/api.md#nearest
  */
trait NearestOptions
  extends StObject
     with Options {
  
  /**
    * Keep waypoints on curb side. Can be null (unrestricted, default) or curb.
    */
  var approaches: js.UndefOr[js.Array[ApproachTypes] | Null] = js.undefined
  
  /**
    * Number of nearest segments that should be returned. Must be an integer greater than or equal to 1. (optional, default 1)
    */
  var number: js.UndefOr[Double] = js.undefined
  
  /**
    * Which edges can be snapped to, either default, or any. default only snaps to edges marked by the profile as is_startpoint, any will allow snapping to any edge in the routing graph.
    */
  var snapping: js.UndefOr[SnappingTypes] = js.undefined
}
object NearestOptions {
  
  inline def apply(): NearestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NearestOptions]
  }
  
  extension [Self <: NearestOptions](x: Self) {
    
    inline def setApproaches(value: js.Array[ApproachTypes]): Self = StObject.set(x, "approaches", value.asInstanceOf[js.Any])
    
    inline def setApproachesNull: Self = StObject.set(x, "approaches", null)
    
    inline def setApproachesUndefined: Self = StObject.set(x, "approaches", js.undefined)
    
    inline def setApproachesVarargs(value: ApproachTypes*): Self = StObject.set(x, "approaches", js.Array(value*))
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setSnapping(value: SnappingTypes): Self = StObject.set(x, "snapping", value.asInstanceOf[js.Any])
    
    inline def setSnappingUndefined: Self = StObject.set(x, "snapping", js.undefined)
  }
}
