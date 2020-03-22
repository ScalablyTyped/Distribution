package typings.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUuid extends js.Object {
  var uuid: String
}

object AnonUuid {
  @scala.inline
  def apply(uuid: String): AnonUuid = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonUuid]
  }
}

