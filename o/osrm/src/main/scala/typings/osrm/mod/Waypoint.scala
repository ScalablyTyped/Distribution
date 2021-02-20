package typings.osrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object used to describe waypoint on a route.
  *
  * https://github.com/Project-OSRM/osrm-backend/blob/master/docs/http.md#waypoint-object
  */
@js.native
trait Waypoint extends StObject {
  
  var distance: Double = js.native
  
  /**
    * Unique internal identifier of the segment (ephemeral, not constant over data updates)
    * This can be used on subsequent request to significantly speed up the query and to connect multiple services.
    * E.g. you can use the hint value obtained by the nearest query as hint values for route inputs.
    */
  var hint: String = js.native
  
  /**
    * Array that contains the [longitude, latitude] pair of the snapped coordinate
    */
  var location: Coordinate = js.native
  
  /**
    * Name of the street the coordinate snapped to
    */
  var name: String = js.native
}
object Waypoint {
  
  @scala.inline
  def apply(distance: Double, hint: String, location: Coordinate, name: String): Waypoint = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], hint = hint.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Waypoint]
  }
  
  @scala.inline
  implicit class WaypointMutableBuilder[Self <: Waypoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Coordinate): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationVarargs(value: Double*): Self = StObject.set(x, "location", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
