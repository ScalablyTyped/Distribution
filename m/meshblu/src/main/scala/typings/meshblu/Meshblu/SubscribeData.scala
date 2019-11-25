package typings.meshblu.Meshblu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeData extends js.Object {
  var topics: js.UndefOr[js.Array[String]] = js.undefined
  var types: js.UndefOr[js.Array[String]] = js.undefined
  var uuid: String
}

object SubscribeData {
  @scala.inline
  def apply(uuid: String, topics: js.Array[String] = null, types: js.Array[String] = null): SubscribeData = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeData]
  }
}

