package typings.osrm.osrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a route through (potentially multiple) waypoints.
  *
  * https://github.com/Project-OSRM/osrm-backend/blob/master/docs/http.md#route-object
  */
trait Route extends js.Object {
  /**
    * The distance traveled by the route, in float meters.
    */
  var distance: Double
  /**
    * The estimated travel time, in float number of seconds.
    */
  var duration: Double
  /**
    * The whole geometry of the route value depending on overview parameter, format depending on the geometries parameter. See RouteStep's geometry property for a parameter documentation.
    */
  var geometry: js.UndefOr[js.Any] = js.undefined
  /**
    * The legs between the given waypoints, an array of RouteLeg objects.
    */
  var legs: js.Array[RouteLeg]
  /**
    * The calculated weight of the route.
    */
  var weight: Double
  /**
    * The name of the weight profile used during extraction phase.
    */
  var weight_name: String
}

object Route {
  @scala.inline
  def apply(
    distance: Double,
    duration: Double,
    legs: js.Array[RouteLeg],
    weight: Double,
    weight_name: String,
    geometry: js.Any = null
  ): Route = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], legs = legs.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any], weight_name = weight_name.asInstanceOf[js.Any])
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
}

