package typings.mongodbDashMemoryDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsName extends js.Object {
  var name: String
  def removeCallback(args: js.Any*): js.Any
}

object Anon_ArgsName {
  @scala.inline
  def apply(name: String, removeCallback: /* repeated */ js.Any => js.Any): Anon_ArgsName = {
    val __obj = js.Dynamic.literal(name = name, removeCallback = js.Any.fromFunction1(removeCallback))
  
    __obj.asInstanceOf[Anon_ArgsName]
  }
}

