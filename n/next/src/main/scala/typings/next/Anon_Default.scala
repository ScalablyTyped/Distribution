package typings.next

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default[P] extends js.Object {
  var default: ComponentType[P]
}

object Anon_Default {
  @scala.inline
  def apply[P](default: ComponentType[P]): Anon_Default[P] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Default[P]]
  }
}

