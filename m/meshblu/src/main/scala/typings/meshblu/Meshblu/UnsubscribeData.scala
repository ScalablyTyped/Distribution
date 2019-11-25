package typings.meshblu.Meshblu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsubscribeData extends js.Object {
  var types: js.UndefOr[js.Array[String]] = js.undefined
  var uuid: String
}

object UnsubscribeData {
  @scala.inline
  def apply(uuid: String, types: js.Array[String] = null): UnsubscribeData = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsubscribeData]
  }
}

