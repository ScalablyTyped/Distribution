package typings.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * matchings is an array of Route objects that assemble the trace.
  * Each Route object has an additional confidence property,
  * which is the confidence of the matching.
  * float value between 0 and 1. 1 is very confident that the matching is correct.
  *
  * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md#match
  */
@js.native
trait MatchRoute extends Route {
  var confidence: Double = js.native
}

object MatchRoute {
  @scala.inline
  def apply(
    confidence: Double,
    distance: Double,
    duration: Double,
    legs: js.Array[RouteLeg],
    weight: Double,
    weight_name: String
  ): MatchRoute = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], legs = legs.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any], weight_name = weight_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchRoute]
  }
  @scala.inline
  implicit class MatchRouteOps[Self <: MatchRoute] (val x: Self) extends AnyVal {
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
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
  }
  
}

