package typings.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object used to describe waypoint on a route.
  *
  * https://github.com/Project-OSRM/osrm-backend/blob/master/docs/http.md#waypoint-object
  */
@js.native
trait Waypoint extends js.Object {
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
  implicit class WaypointOps[Self <: Waypoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setHint(value: String): Self = this.set("hint", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationVarargs(value: Double*): Self = this.set("location", js.Array(value :_*))
    @scala.inline
    def setLocation(value: Coordinate): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

