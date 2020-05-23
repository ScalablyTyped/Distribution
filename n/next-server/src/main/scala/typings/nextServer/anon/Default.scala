package typings.nextServer.anon

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Default[P] extends js.Object {
  var default: ComponentType[P]
}

object Default {
  @scala.inline
  def apply[P](default: ComponentType[P]): Default[P] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default[P]]
  }
}

