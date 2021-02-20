package typings.osrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * https://github.com/Project-OSRM/osrm-backend/blob/master/docs/http.md#stepmaneuver-object
  */
@js.native
trait StepManeuver extends StObject {
  
  /**
    * The clockwise angle from true north to the direction of travel immediately after the maneuver. Range 0-359.
    */
  var bearing_after: Double = js.native
  
  /**
    * The clockwise angle from true north to the direction of travel immediately before the maneuver. Range 0-359.
    */
  var bearing_before: Double = js.native
  
  /**
    * A [longitude, latitude] pair describing the location of the turn.
    */
  var location: Coordinate = js.native
  
  /**
    * An optional string indicating the direction change of the maneuver.
    */
  var modifier: Indication = js.native
  
  /**
    * A string indicating the type of maneuver.
    * new identifiers might be introduced without API change Types unknown to the client should be handled like the turn type,
    * the existence of correct modifier values is guranteed.
    */
  var `type`: StepManeuverTypes = js.native
}
object StepManeuver {
  
  @scala.inline
  def apply(
    bearing_after: Double,
    bearing_before: Double,
    location: Coordinate,
    modifier: Indication,
    `type`: StepManeuverTypes
  ): StepManeuver = {
    val __obj = js.Dynamic.literal(bearing_after = bearing_after.asInstanceOf[js.Any], bearing_before = bearing_before.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], modifier = modifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepManeuver]
  }
  
  @scala.inline
  implicit class StepManeuverMutableBuilder[Self <: StepManeuver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBearing_after(value: Double): Self = StObject.set(x, "bearing_after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBearing_before(value: Double): Self = StObject.set(x, "bearing_before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Coordinate): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationVarargs(value: Double*): Self = StObject.set(x, "location", js.Array(value :_*))
    
    @scala.inline
    def setModifier(value: Indication): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: StepManeuverTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
