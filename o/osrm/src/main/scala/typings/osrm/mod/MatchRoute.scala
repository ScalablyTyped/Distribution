package typings.osrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * matchings is an array of Route objects that assemble the trace.
  * Each Route object has an additional confidence property,
  * which is the confidence of the matching.
  * float value between 0 and 1. 1 is very confident that the matching is correct.
  *
  * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md#match
  */
trait MatchRoute
  extends StObject
     with Route {
  
  var confidence: Double
}
object MatchRoute {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: MatchRoute] (val x: Self) extends AnyVal {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
  }
}
