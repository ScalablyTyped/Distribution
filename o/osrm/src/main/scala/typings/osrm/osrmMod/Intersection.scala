package typings.osrm.osrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An intersection gives a full representation of any cross-way the path passes bay.
  * For every step, the very first intersection (intersections[0]) corresponds to the location of the StepManeuver.
  * Further intersections are listed for every cross-way until the next turn instruction.
  *
  * https://github.com/Project-OSRM/osrm-backend/blob/master/docs/http.md#intersection-object
  */
trait Intersection extends js.Object {
  /**
    * A list of bearing values (e.g. [0,90,180,270]) that are available at the intersection.
    * The bearings describe all available roads at the intersection. Values are between 0-359 (0=true north)
    */
  var bearings: js.Array[Double]
  /**
    * An array of strings signifying the classes (as specified in the profile) of the road exiting the intersection.
    */
  var classes: js.Array[String]
  /**
    * A list of entry flags, corresponding in a 1:1 relationship to the bearings.
    * A value of true indicates that the respective road could be entered on a valid route.
    * false indicates that the turn onto the respective road would violate a restriction.
    */
  var entry: js.Array[String]
  /**
    * index into bearings/entry array. Used to calculate the bearing just before the turn.
    * Namely, the clockwise angle from true north to the direction of travel immediately before the maneuver/passing the intersection.
    * Bearings are given relative to the intersection. To get the bearing in the direction of driving, the bearing has to be rotated by a value of 180.
    * The value is not supplied for depart maneuvers.
    */
  var in: Double
  /**
    * Array of Lane objects that denote the available turn lanes at the intersection.
    * If no lane information is available for an intersection, the lanes property will not be present.
    */
  var lanes: Lane
  /**
    * A [longitude, latitude] pair describing the location of the turn.
    */
  var location: Coordinate
  /**
    * index into the bearings/entry array. Used to extract the bearing just after the turn.
    * Namely, The clockwise angle from true north to the direction of travel immediately after the maneuver/passing the intersection.
    * The value is not supplied for arrive maneuvers.
    */
  var out: Double
}

object Intersection {
  @scala.inline
  def apply(
    bearings: js.Array[Double],
    classes: js.Array[String],
    entry: js.Array[String],
    in: Double,
    lanes: Lane,
    location: Coordinate,
    out: Double
  ): Intersection = {
    val __obj = js.Dynamic.literal(bearings = bearings.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Intersection]
  }
}

