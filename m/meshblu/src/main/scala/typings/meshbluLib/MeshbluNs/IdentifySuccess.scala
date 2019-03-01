package typings
package meshbluLib.MeshbluNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentifySuccess extends js.Object {
  var status: java.lang.String
  var token: java.lang.String
  var uuid: java.lang.String
}

object IdentifySuccess {
  @scala.inline
  def apply(status: java.lang.String, token: java.lang.String, uuid: java.lang.String): IdentifySuccess = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("token")(token)
    __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[IdentifySuccess]
  }
}

