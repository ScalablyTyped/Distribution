package typings.nodeMemwatch.mod

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
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], size_bytes = size_bytes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeapDiffSnapshot]
  }
}

