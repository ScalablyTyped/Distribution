package typings.osmtogeojson.mod.OsmJSON

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
    changeset: js.UndefOr[Double] = js.undefined,
    tags: StringDictionary[String] = null,
    timestamp: String = null,
    uid: js.UndefOr[Double] = js.undefined,
    user: String = null,
    version: js.UndefOr[Double] = js.undefined
  ): Element = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(changeset)) __obj.updateDynamic("changeset")(changeset.get.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(uid)) __obj.updateDynamic("uid")(uid.get.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
}

