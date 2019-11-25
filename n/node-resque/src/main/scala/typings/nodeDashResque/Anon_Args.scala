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
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Args]
  }
}

