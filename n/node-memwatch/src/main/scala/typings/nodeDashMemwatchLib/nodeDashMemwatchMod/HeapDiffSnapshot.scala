package typings
package nodeDashMemwatchLib.nodeDashMemwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeapDiffSnapshot extends js.Object {
  var nodes: scala.Double
  var size: java.lang.String
  var size_bytes: scala.Double
}

object HeapDiffSnapshot {
  @scala.inline
  def apply(nodes: scala.Double, size: java.lang.String, size_bytes: scala.Double): HeapDiffSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nodes")(nodes)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("size_bytes")(size_bytes)
    __obj.asInstanceOf[HeapDiffSnapshot]
  }
}

