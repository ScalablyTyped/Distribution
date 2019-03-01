package typings
package meshbluLib.MeshbluNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterResponse extends js.Object {
  var token: java.lang.String
  var `type`: java.lang.String
  var uuid: java.lang.String
}

object RegisterResponse {
  @scala.inline
  def apply(token: java.lang.String, `type`: java.lang.String, uuid: java.lang.String): RegisterResponse = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("token")(token)
    __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[RegisterResponse]
  }
}

