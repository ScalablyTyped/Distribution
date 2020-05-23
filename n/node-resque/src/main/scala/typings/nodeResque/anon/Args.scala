package typings.nodeResque.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args extends js.Object {
  var args: js.Array[_]
  var `class`: String
  var queue: String
}

object Args {
  @scala.inline
  def apply(args: js.Array[_], `class`: String, queue: String): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
}

