package typings.osmtogeojson.mod.OsmJSON

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
    changeset: js.UndefOr[Double] = js.undefined,
    tags: StringDictionary[String] = null,
    timestamp: String = null,
    uid: js.UndefOr[Double] = js.undefined,
    user: String = null,
    version: js.UndefOr[Double] = js.undefined
  ): Node = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(changeset)) __obj.updateDynamic("changeset")(changeset.get.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(uid)) __obj.updateDynamic("uid")(uid.get.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

