package typings
package meshbluLib.MeshbluNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSuccess extends js.Object {
  var status: java.lang.String
  var token: java.lang.String
  var uuid: java.lang.String
}

object UpdateSuccess {
  @scala.inline
  def apply(status: java.lang.String, token: java.lang.String, uuid: java.lang.String): UpdateSuccess = {
    val __obj = js.Dynamic.literal(status = status, token = token, uuid = uuid)
  
    __obj.asInstanceOf[UpdateSuccess]
  }
}

