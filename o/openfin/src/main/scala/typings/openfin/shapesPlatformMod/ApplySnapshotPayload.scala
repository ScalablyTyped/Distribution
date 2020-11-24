package typings.openfin.shapesPlatformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplySnapshotPayload extends js.Object {
  
  var options: js.UndefOr[ApplySnapshotOptions] = js.native
  
  var snapshot: Snapshot = js.native
}
object ApplySnapshotPayload {
  
  @scala.inline
  def apply(snapshot: Snapshot): ApplySnapshotPayload = {
    val __obj = js.Dynamic.literal(snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplySnapshotPayload]
  }
  
  @scala.inline
  implicit class ApplySnapshotPayloadOps[Self <: ApplySnapshotPayload] (val x: Self) extends AnyVal {
    
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
    def setSnapshot(value: Snapshot): Self = this.set("snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ApplySnapshotOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
