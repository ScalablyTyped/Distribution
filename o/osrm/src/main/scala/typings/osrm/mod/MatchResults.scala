package typings.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchResults extends js.Object {
  var matchings: js.Array[MatchRoute] = js.native
  var tracepoints: js.Array[MatchWaypoint] = js.native
}

object MatchResults {
  @scala.inline
  def apply(matchings: js.Array[MatchRoute], tracepoints: js.Array[MatchWaypoint]): MatchResults = {
    val __obj = js.Dynamic.literal(matchings = matchings.asInstanceOf[js.Any], tracepoints = tracepoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchResults]
  }
  @scala.inline
  implicit class MatchResultsOps[Self <: MatchResults] (val x: Self) extends AnyVal {
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
    def setMatchingsVarargs(value: MatchRoute*): Self = this.set("matchings", js.Array(value :_*))
    @scala.inline
    def setMatchings(value: js.Array[MatchRoute]): Self = this.set("matchings", value.asInstanceOf[js.Any])
    @scala.inline
    def setTracepointsVarargs(value: MatchWaypoint*): Self = this.set("tracepoints", js.Array(value :_*))
    @scala.inline
    def setTracepoints(value: js.Array[MatchWaypoint]): Self = this.set("tracepoints", value.asInstanceOf[js.Any])
  }
  
}

