package typings
package nodeDashMemwatchLib.nodeDashMemwatchMod

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("after")(after)
    __obj.updateDynamic("before")(before)
    __obj.updateDynamic("change")(change)
    __obj.asInstanceOf[HeapDiffInformation]
  }
}

