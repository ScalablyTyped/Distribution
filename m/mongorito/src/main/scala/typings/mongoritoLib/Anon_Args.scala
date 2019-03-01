package typings
package mongoritoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var args: js.Any
  var method: java.lang.String
}

object Anon_Args {
  @scala.inline
  def apply(args: js.Any, method: java.lang.String): Anon_Args = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[Anon_Args]
  }
}

