package typings.meshblu.MeshbluNs

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
    val __obj = js.Dynamic.literal(uuid = uuid)
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[UnsubscribeData]
  }
}

