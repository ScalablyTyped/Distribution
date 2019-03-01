package typings
package osmtogeojsonLib.osmtogeojsonMod.OsmJSONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  var changeset: js.UndefOr[scala.Double] = js.undefined
  var id: scala.Double
  var tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var timestamp: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
  var uid: js.UndefOr[scala.Double] = js.undefined
  var user: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
}

object Element {
  @scala.inline
  def apply(
    id: scala.Double,
    `type`: java.lang.String,
    changeset: scala.Int | scala.Double = null,
    tags: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    timestamp: java.lang.String = null,
    uid: scala.Int | scala.Double = null,
    user: java.lang.String = null,
    version: scala.Int | scala.Double = null
  ): Element = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    if (changeset != null) __obj.updateDynamic("changeset")(changeset.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
}

