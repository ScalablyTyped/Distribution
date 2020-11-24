package typings.node.inspectorMod.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddHeapSnapshotChunkEventDataType extends js.Object {
  
  var chunk: String = js.native
}
object AddHeapSnapshotChunkEventDataType {
  
  @scala.inline
  def apply(chunk: String): AddHeapSnapshotChunkEventDataType = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddHeapSnapshotChunkEventDataType]
  }
  
  @scala.inline
  implicit class AddHeapSnapshotChunkEventDataTypeOps[Self <: AddHeapSnapshotChunkEventDataType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChunk(value: String): Self = this.set("chunk", value.asInstanceOf[js.Any])
  }
}
