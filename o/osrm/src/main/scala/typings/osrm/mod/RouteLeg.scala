package typings.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a route between two waypoints.
  *
  * https://github.com/Project-OSRM/osrm-backend/blob/master/docs/http.md#routeleg-object
  */
@js.native
trait RouteLeg extends js.Object {
  /**
    * Additional details about each coordinate along the route geometry:
    * - true: An Annotation object containing node ids, durations distances and
    * - false: weights undefined
    */
  var annotation: Annotation = js.native
  /**
    * The distance traveled by this route leg, in float meters.
    */
  var distance: Double = js.native
  /**
    * The estimated travel time, in float number of seconds.
    */
  var duration: Double = js.native
  /**
    * Depends on the steps parameter.
    * - true: array of RouteStep objects describing the turn-by-turn instructions
    * - false: empty array
    */
  var steps: js.Array[RouteStep] = js.native
  /**
    * Summary of the route taken as string. Depends on the summary parameter:
    * - true: Names of the two major roads used. Can be empty if route is too short.
    * - false: empty string
    */
  var summary: String = js.native
  /**
    * The calculated weight of the route leg.
    */
  var weight: Double = js.native
}

object RouteLeg {
  @scala.inline
  def apply(
    annotation: Annotation,
    distance: Double,
    duration: Double,
    steps: js.Array[RouteStep],
    summary: String,
    weight: Double
  ): RouteLeg = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteLeg]
  }
  @scala.inline
  implicit class RouteLegOps[Self <: RouteLeg] (val x: Self) extends AnyVal {
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
    def setAnnotation(value: Annotation): Self = this.set("annotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepsVarargs(value: RouteStep*): Self = this.set("steps", js.Array(value :_*))
    @scala.inline
    def setSteps(value: js.Array[RouteStep]): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
  }
  
}

