package typings.meshblu.MeshbluNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterResponse extends js.Object {
  var token: String
  var `type`: String
  var uuid: String
}

object RegisterResponse {
  @scala.inline
  def apply(token: String, `type`: String, uuid: String): RegisterResponse = {
    val __obj = js.Dynamic.literal(token = token, uuid = uuid)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RegisterResponse]
  }
}

