package typings.meshblu.Meshblu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  var uuid: String
}

object Device {
  @scala.inline
  def apply(uuid: String): Device = {
    val __obj = js.Dynamic.literal(uuid = uuid)
  
    __obj.asInstanceOf[Device]
  }
}

