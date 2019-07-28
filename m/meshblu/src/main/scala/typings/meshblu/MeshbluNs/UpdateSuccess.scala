package typings.meshblu.MeshbluNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSuccess extends js.Object {
  var status: String
  var token: String
  var uuid: String
}

object UpdateSuccess {
  @scala.inline
  def apply(status: String, token: String, uuid: String): UpdateSuccess = {
    val __obj = js.Dynamic.literal(status = status, token = token, uuid = uuid)
  
    __obj.asInstanceOf[UpdateSuccess]
  }
}

