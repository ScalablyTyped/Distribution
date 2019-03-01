package typings
package osrmLib.osrmMod.OSRMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A step consists of a maneuver such as a turn or merge, followed by a distance of travel along a single way to the subsequent step.
  *
  * https://github.com/Project-OSRM/osrm-backend/blob/master/docs/http.md#routestep-object
  */
trait RouteStep extends js.Object {
  /**
    * The destinations of the way. Will be undefined if there are no destinations.
    */
  var destinations: java.lang.String
  /**
    * The distance of travel from the maneuver to the subsequent step, in float meters.
    */
  var distance: scala.Double
  /**
    * The estimated travel time, in float number of seconds.
    */
  var duration: scala.Double
  /**
    * The exit numbers or names of the way. Will be undefined if there are no exit numbers or names.
    */
  var exits: java.lang.String
  /**
    * The unsimplified geometry of the route segment, depending on the geometries parameter.
    */
  var geometry: Polyline | LineString
  /**
    * A list of Intersection objects that are passed along the segment, the very first belonging to the StepManeuver
    */
  var intersections: js.Array[Intersection]
  /**
    * A StepManeuver object representing the maneuver.
    */
  var maneuver: StepManeuver
  /**
    * A string signifying the mode of transportation.
    */
  var mode: java.lang.String
  /**
    * The name of the way along which travel proceeds.
    */
  var name: java.lang.String
  /**
    * The pronunciation hint of the way name. Will be undefined if there is no pronunciation hit.
    */
  var pronunciation: java.lang.String
  /**
    * A reference number or code for the way. Optionally included, if ref data is available for the given way.
    */
  var ref: java.lang.String
  /**
    * The name for the rotary. Optionally included, if the step is a rotary and a rotary name is available.
    */
  var rotary_name: java.lang.String
  /**
    * The pronunciation hint of the rotary name. Optionally included, if the step is a rotary and a rotary pronunciation is available.
    */
  var rotary_pronunciation: java.lang.String
  /**
    * The calculated weight of the step.
    */
  var weight: scala.Double
}

object RouteStep {
  @scala.inline
  def apply(
    destinations: java.lang.String,
    distance: scala.Double,
    duration: scala.Double,
    exits: java.lang.String,
    geometry: Polyline | LineString,
    intersections: js.Array[Intersection],
    maneuver: StepManeuver,
    mode: java.lang.String,
    name: java.lang.String,
    pronunciation: java.lang.String,
    ref: java.lang.String,
    rotary_name: java.lang.String,
    rotary_pronunciation: java.lang.String,
    weight: scala.Double
  ): RouteStep = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destinations")(destinations)
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("exits")(exits)
    __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    __obj.updateDynamic("intersections")(intersections)
    __obj.updateDynamic("maneuver")(maneuver)
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("pronunciation")(pronunciation)
    __obj.updateDynamic("ref")(ref)
    __obj.updateDynamic("rotary_name")(rotary_name)
    __obj.updateDynamic("rotary_pronunciation")(rotary_pronunciation)
    __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[RouteStep]
  }
}

