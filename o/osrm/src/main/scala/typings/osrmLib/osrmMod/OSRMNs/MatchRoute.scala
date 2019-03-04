package typings
package osrmLib.osrmMod.OSRMNs

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
trait MatchRoute extends Route {
  var confidence: scala.Double
}

object MatchRoute {
  @scala.inline
  def apply(
    confidence: scala.Double,
    distance: scala.Double,
    duration: scala.Double,
    legs: js.Array[RouteLeg],
    weight: scala.Double,
    weight_name: java.lang.String,
    geometry: js.Any = null
  ): MatchRoute = {
    val __obj = js.Dynamic.literal(confidence = confidence, distance = distance, duration = duration, legs = legs, weight = weight, weight_name = weight_name)
    if (geometry != null) __obj.updateDynamic("geometry")(geometry)
    __obj.asInstanceOf[MatchRoute]
  }
}

