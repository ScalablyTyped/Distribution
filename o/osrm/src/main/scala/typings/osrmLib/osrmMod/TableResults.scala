package typings
package osrmLib.osrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableResults extends js.Object {
  var destinations: js.Array[Waypoint]
  var durations: js.Array[js.Array[Duration]]
  var sources: js.Array[Waypoint]
}

object TableResults {
  @scala.inline
  def apply(
    destinations: js.Array[Waypoint],
    durations: js.Array[js.Array[Duration]],
    sources: js.Array[Waypoint]
  ): TableResults = {
    val __obj = js.Dynamic.literal(destinations = destinations, durations = durations, sources = sources)
  
    __obj.asInstanceOf[TableResults]
  }
}

