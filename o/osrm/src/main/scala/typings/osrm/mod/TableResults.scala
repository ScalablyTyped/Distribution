package typings.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableResults extends js.Object {
  var destinations: js.Array[Waypoint] = js.native
  var durations: js.Array[js.Array[Duration]] = js.native
  var sources: js.Array[Waypoint] = js.native
}

object TableResults {
  @scala.inline
  def apply(
    destinations: js.Array[Waypoint],
    durations: js.Array[js.Array[Duration]],
    sources: js.Array[Waypoint]
  ): TableResults = {
    val __obj = js.Dynamic.literal(destinations = destinations.asInstanceOf[js.Any], durations = durations.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableResults]
  }
  @scala.inline
  implicit class TableResultsOps[Self <: TableResults] (val x: Self) extends AnyVal {
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
    def setDestinationsVarargs(value: Waypoint*): Self = this.set("destinations", js.Array(value :_*))
    @scala.inline
    def setDestinations(value: js.Array[Waypoint]): Self = this.set("destinations", value.asInstanceOf[js.Any])
    @scala.inline
    def setDurationsVarargs(value: js.Array[Duration]*): Self = this.set("durations", js.Array(value :_*))
    @scala.inline
    def setDurations(value: js.Array[js.Array[Duration]]): Self = this.set("durations", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourcesVarargs(value: Waypoint*): Self = this.set("sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: js.Array[Waypoint]): Self = this.set("sources", value.asInstanceOf[js.Any])
  }
  
}

