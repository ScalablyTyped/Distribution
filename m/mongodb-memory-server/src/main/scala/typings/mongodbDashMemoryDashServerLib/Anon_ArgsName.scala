package typings
package mongodbDashMemoryDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsName extends js.Object {
  var name: java.lang.String
  def removeCallback(args: js.Any*): js.Any
}

object Anon_ArgsName {
  @scala.inline
  def apply(name: java.lang.String, removeCallback: js.Function1[/* repeated */ js.Any, js.Any]): Anon_ArgsName = {
    val __obj = js.Dynamic.literal(name = name, removeCallback = removeCallback)
  
    __obj.asInstanceOf[Anon_ArgsName]
  }
}

