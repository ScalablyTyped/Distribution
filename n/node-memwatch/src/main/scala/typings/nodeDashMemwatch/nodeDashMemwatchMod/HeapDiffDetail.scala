package typings.nodeDashMemwatch.nodeDashMemwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeapDiffDetail extends js.Object {
  var `+`: Double
  var `-`: Double
  var size: String
  var size_bytes: Double
  var what: String
}

object HeapDiffDetail {
  @scala.inline
  def apply(`+`: Double, `-`: Double, size: String, size_bytes: Double, what: String): HeapDiffDetail = {
    val __obj = js.Dynamic.literal(size = size, size_bytes = size_bytes, what = what)
    __obj.updateDynamic("+")(`+`)
    __obj.updateDynamic("-")(`-`)
    __obj.asInstanceOf[HeapDiffDetail]
  }
}

