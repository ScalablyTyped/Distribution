package typings.osmtogeojson.osmtogeojsonMod.OsmJSONNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends Element {
  var lat: Double
  var lon: Double
}

object Node {
  @scala.inline
  def apply(
    id: Double,
    lat: Double,
    lon: Double,
    `type`: String,
    changeset: Int | Double = null,
    tags: StringDictionary[String] = null,
    timestamp: String = null,
    uid: Int | Double = null,
    user: String = null,
    version: Int | Double = null
  ): Node = {
    val __obj = js.Dynamic.literal(id = id, lat = lat, lon = lon)
    __obj.updateDynamic("type")(`type`)
    if (changeset != null) __obj.updateDynamic("changeset")(changeset.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

