package typings.nodeDashMemwatch.nodeDashMemwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeapDiffInformation extends js.Object {
  var after: HeapDiffSnapshot
  var before: HeapDiffSnapshot
  var change: HeapDiffChange
}

object HeapDiffInformation {
  @scala.inline
  def apply(after: HeapDiffSnapshot, before: HeapDiffSnapshot, change: HeapDiffChange): HeapDiffInformation = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeapDiffInformation]
  }
}

