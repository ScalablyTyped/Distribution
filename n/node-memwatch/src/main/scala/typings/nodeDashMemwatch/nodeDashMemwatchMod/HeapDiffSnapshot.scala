package typings.nodeDashMemwatch.nodeDashMemwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeapDiffSnapshot extends js.Object {
  var nodes: Double
  var size: String
  var size_bytes: Double
}

object HeapDiffSnapshot {
  @scala.inline
  def apply(nodes: Double, size: String, size_bytes: Double): HeapDiffSnapshot = {
    val __obj = js.Dynamic.literal(nodes = nodes, size = size, size_bytes = size_bytes)
  
    __obj.asInstanceOf[HeapDiffSnapshot]
  }
}

