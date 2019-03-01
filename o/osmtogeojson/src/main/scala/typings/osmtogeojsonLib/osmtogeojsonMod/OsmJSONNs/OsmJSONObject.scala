package typings
package osmtogeojsonLib.osmtogeojsonMod.OsmJSONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OsmJSONObject extends js.Object {
  var elements: js.Array[Node | Way | Relationship]
}

object OsmJSONObject {
  @scala.inline
  def apply(elements: js.Array[Node | Way | Relationship]): OsmJSONObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("elements")(elements)
    __obj.asInstanceOf[OsmJSONObject]
  }
}

