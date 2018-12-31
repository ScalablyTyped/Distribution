package typings
package nodeDashMemwatchLib.nodeDashMemwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeapDiffChange extends js.Object {
  var allocated_nodes: scala.Double
  var details: js.Array[HeapDiffDetail]
  var freed_nodes: scala.Double
  var size: java.lang.String
  var size_bytes: scala.Double
}

