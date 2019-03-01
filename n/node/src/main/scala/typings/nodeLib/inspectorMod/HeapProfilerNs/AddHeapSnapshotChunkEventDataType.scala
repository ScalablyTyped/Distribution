package typings
package nodeLib.inspectorMod.HeapProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddHeapSnapshotChunkEventDataType extends js.Object {
  var chunk: java.lang.String
}

object AddHeapSnapshotChunkEventDataType {
  @scala.inline
  def apply(chunk: java.lang.String): AddHeapSnapshotChunkEventDataType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chunk")(chunk)
    __obj.asInstanceOf[AddHeapSnapshotChunkEventDataType]
  }
}

