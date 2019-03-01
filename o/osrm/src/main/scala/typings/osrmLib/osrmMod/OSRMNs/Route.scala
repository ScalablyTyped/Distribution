package typings
package osrmLib.osrmMod.OSRMNs

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
  var distance: scala.Double
  /**
    * The estimated travel time, in float number of seconds.
    */
  var duration: scala.Double
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
  var weight: scala.Double
  /**
    * The name of the weight profile used during extraction phase.
    */
  var weight_name: java.lang.String
}

object Route {
  @scala.inline
  def apply(
    distance: scala.Double,
    duration: scala.Double,
    legs: js.Array[RouteLeg],
    weight: scala.Double,
    weight_name: java.lang.String,
    geometry: js.Any = null
  ): Route = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("legs")(legs)
    __obj.updateDynamic("weight")(weight)
    __obj.updateDynamic("weight_name")(weight_name)
    if (geometry != null) __obj.updateDynamic("geometry")(geometry)
    __obj.asInstanceOf[Route]
  }
}

