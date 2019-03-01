package typings
package meshbluLib.MeshbluNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsubscribeData extends js.Object {
  var types: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var uuid: java.lang.String
}

object UnsubscribeData {
  @scala.inline
  def apply(uuid: java.lang.String, types: js.Array[java.lang.String] = null): UnsubscribeData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("uuid")(uuid)
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[UnsubscribeData]
  }
}

