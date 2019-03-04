package typings
package memjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  def log(args: js.Any*): scala.Unit
}

object Anon_Args {
  @scala.inline
  def apply(log: js.Function1[/* repeated */ js.Any, scala.Unit]): Anon_Args = {
    val __obj = js.Dynamic.literal(log = log)
  
    __obj.asInstanceOf[Anon_Args]
  }
}

