package typings.nextServer

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefault[P] extends js.Object {
  var default: ComponentType[P]
}

object AnonDefault {
  @scala.inline
  def apply[P](default: ComponentType[P]): AnonDefault[P] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDefault[P]]
  }
}

