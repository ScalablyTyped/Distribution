package typings.node.inspectorMod.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LastSeenObjectIdEventDataType extends js.Object {
  var lastSeenObjectId: Double = js.native
  var timestamp: Double = js.native
}

object LastSeenObjectIdEventDataType {
  @scala.inline
  def apply(lastSeenObjectId: Double, timestamp: Double): LastSeenObjectIdEventDataType = {
    val __obj = js.Dynamic.literal(lastSeenObjectId = lastSeenObjectId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastSeenObjectIdEventDataType]
  }
  @scala.inline
  implicit class LastSeenObjectIdEventDataTypeOps[Self <: LastSeenObjectIdEventDataType] (val x: Self) extends AnyVal {
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
    def setLastSeenObjectId(value: Double): Self = this.set("lastSeenObjectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

