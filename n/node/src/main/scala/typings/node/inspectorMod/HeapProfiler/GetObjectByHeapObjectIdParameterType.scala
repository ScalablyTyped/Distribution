package typings.node.inspectorMod.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetObjectByHeapObjectIdParameterType extends js.Object {
  /**
    * Symbolic group name that can be used to release multiple objects.
    */
  var objectGroup: js.UndefOr[String] = js.native
  var objectId: HeapSnapshotObjectId = js.native
}

object GetObjectByHeapObjectIdParameterType {
  @scala.inline
  def apply(objectId: HeapSnapshotObjectId): GetObjectByHeapObjectIdParameterType = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectByHeapObjectIdParameterType]
  }
  @scala.inline
  implicit class GetObjectByHeapObjectIdParameterTypeOps[Self <: GetObjectByHeapObjectIdParameterType] (val x: Self) extends AnyVal {
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
    def setObjectId(value: HeapSnapshotObjectId): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectGroup(value: String): Self = this.set("objectGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectGroup: Self = this.set("objectGroup", js.undefined)
  }
  
}

