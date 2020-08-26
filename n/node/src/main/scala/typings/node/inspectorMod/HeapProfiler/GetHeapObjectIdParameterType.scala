package typings.node.inspectorMod.HeapProfiler

import typings.node.inspectorMod.Runtime.RemoteObjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHeapObjectIdParameterType extends js.Object {
  /**
    * Identifier of the object to get heap object id for.
    */
  var objectId: RemoteObjectId = js.native
}

object GetHeapObjectIdParameterType {
  @scala.inline
  def apply(objectId: RemoteObjectId): GetHeapObjectIdParameterType = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHeapObjectIdParameterType]
  }
  @scala.inline
  implicit class GetHeapObjectIdParameterTypeOps[Self <: GetHeapObjectIdParameterType] (val x: Self) extends AnyVal {
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
    def setObjectId(value: RemoteObjectId): Self = this.set("objectId", value.asInstanceOf[js.Any])
  }
  
}

