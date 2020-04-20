package typings.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object used to describe waypoint on a route.
  *
  * https://github.com/Project-OSRM/osrm-backend/blob/master/docs/http.md#waypoint-object
  */
trait Waypoint extends js.Object {
  var distance: Double
  /**
    * Unique internal identifier of the segment (ephemeral, not constant over data updates)
    * This can be used on subsequent request to significantly speed up the query and to connect multiple services.
    * E.g. you can use the hint value obtained by the nearest query as hint values for route inputs.
    */
  var hint: String
  /**
    * Array that contains the [longitude, latitude] pair of the snapped coordinate
    */
  var location: Coordinate
  /**
    * Name of the street the coordinate snapped to
    */
  var name: String
}

object Waypoint {
  @scala.inline
  def apply(distance: Double, hint: String, location: Coordinate, name: String): Waypoint = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], hint = hint.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Waypoint]
  }
}

