package typings.nodeDashResque

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var args: js.Array[_]
  var `class`: String
  var queue: String
}

object Anon_Args {
  @scala.inline
  def apply(args: js.Array[_], `class`: String, queue: String): Anon_Args = {
    val __obj = js.Dynamic.literal(args = args, queue = queue)
    __obj.updateDynamic("class")(`class`)
    __obj.asInstanceOf[Anon_Args]
  }
}

