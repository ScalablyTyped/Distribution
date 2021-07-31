package typings.osrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchResults extends StObject {
  
  var matchings: js.Array[MatchRoute]
  
  var tracepoints: js.Array[MatchWaypoint]
}
object MatchResults {
  
  @scala.inline
  def apply(matchings: js.Array[MatchRoute], tracepoints: js.Array[MatchWaypoint]): MatchResults = {
    val __obj = js.Dynamic.literal(matchings = matchings.asInstanceOf[js.Any], tracepoints = tracepoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchResults]
  }
  
  @scala.inline
  implicit class MatchResultsMutableBuilder[Self <: MatchResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatchings(value: js.Array[MatchRoute]): Self = StObject.set(x, "matchings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchingsVarargs(value: MatchRoute*): Self = StObject.set(x, "matchings", js.Array(value :_*))
    
    @scala.inline
    def setTracepoints(value: js.Array[MatchWaypoint]): Self = StObject.set(x, "tracepoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracepointsVarargs(value: MatchWaypoint*): Self = StObject.set(x, "tracepoints", js.Array(value :_*))
  }
}
