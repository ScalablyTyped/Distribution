package typings
package meshbluLib.MeshbluNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeData extends js.Object {
  var topics: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var types: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var uuid: java.lang.String
}

object SubscribeData {
  @scala.inline
  def apply(
    uuid: java.lang.String,
    topics: js.Array[java.lang.String] = null,
    types: js.Array[java.lang.String] = null
  ): SubscribeData = {
    val __obj = js.Dynamic.literal(uuid = uuid)
    if (topics != null) __obj.updateDynamic("topics")(topics)
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[SubscribeData]
  }
}

