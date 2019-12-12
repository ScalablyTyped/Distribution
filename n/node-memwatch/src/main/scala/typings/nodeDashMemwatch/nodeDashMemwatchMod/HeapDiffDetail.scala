package typings.nodeDashMemwatch.nodeDashMemwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeapDiffDetail extends js.Object {
  var `+`: Double
  @JSName("-")
  var `-_`: Double
  var size: String
  var size_bytes: Double
  var what: String
}

object HeapDiffDetail {
  @scala.inline
  def apply(`+`: Double, `-_`: Double, size: String, size_bytes: Double, what: String): HeapDiffDetail = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], size_bytes = size_bytes.asInstanceOf[js.Any], what = what.asInstanceOf[js.Any])
    __obj.updateDynamic("+")(`+`.asInstanceOf[js.Any])
    __obj.updateDynamic("-")(`-_`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeapDiffDetail]
  }
}

