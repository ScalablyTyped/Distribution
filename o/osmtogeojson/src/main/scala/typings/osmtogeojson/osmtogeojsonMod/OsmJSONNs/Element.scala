package typings.osmtogeojson.osmtogeojsonMod.OsmJSONNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  var changeset: js.UndefOr[Double] = js.undefined
  var id: Double
  var tags: js.UndefOr[StringDictionary[String]] = js.undefined
  var timestamp: js.UndefOr[String] = js.undefined
  var `type`: String
  var uid: js.UndefOr[Double] = js.undefined
  var user: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object Element {
  @scala.inline
  def apply(
    id: Double,
    `type`: String,
    changeset: Int | Double = null,
    tags: StringDictionary[String] = null,
    timestamp: String = null,
    uid: Int | Double = null,
    user: String = null,
    version: Int | Double = null
  ): Element = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    if (changeset != null) __obj.updateDynamic("changeset")(changeset.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
}

