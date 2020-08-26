package typings.mfiles

import typings.mfiles.MFiles.MFPermission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccessControlEntryData extends js.Object {
  var AttachObjectsPermission: MFPermission = js.native
  var ChangePermissionsPermission: MFPermission = js.native
  var DeletePermission: MFPermission = js.native
  var EditPermission: MFPermission = js.native
  var ReadPermission: MFPermission = js.native
  def Clone(): IAccessControlEntryData = js.native
  def SetAllPermissions(Permission: MFPermission): Unit = js.native
}

object IAccessControlEntryData {
  @scala.inline
  def apply(
    AttachObjectsPermission: MFPermission,
    ChangePermissionsPermission: MFPermission,
    Clone: () => IAccessControlEntryData,
    DeletePermission: MFPermission,
    EditPermission: MFPermission,
    ReadPermission: MFPermission,
    SetAllPermissions: MFPermission => Unit
  ): IAccessControlEntryData = {
    val __obj = js.Dynamic.literal(AttachObjectsPermission = AttachObjectsPermission.asInstanceOf[js.Any], ChangePermissionsPermission = ChangePermissionsPermission.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), DeletePermission = DeletePermission.asInstanceOf[js.Any], EditPermission = EditPermission.asInstanceOf[js.Any], ReadPermission = ReadPermission.asInstanceOf[js.Any], SetAllPermissions = js.Any.fromFunction1(SetAllPermissions))
    __obj.asInstanceOf[IAccessControlEntryData]
  }
  @scala.inline
  implicit class IAccessControlEntryDataOps[Self <: IAccessControlEntryData] (val x: Self) extends AnyVal {
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
    def setAttachObjectsPermission(value: MFPermission): Self = this.set("AttachObjectsPermission", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangePermissionsPermission(value: MFPermission): Self = this.set("ChangePermissionsPermission", value.asInstanceOf[js.Any])
    @scala.inline
    def setClone(value: () => IAccessControlEntryData): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setDeletePermission(value: MFPermission): Self = this.set("DeletePermission", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditPermission(value: MFPermission): Self = this.set("EditPermission", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadPermission(value: MFPermission): Self = this.set("ReadPermission", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetAllPermissions(value: MFPermission => Unit): Self = this.set("SetAllPermissions", js.Any.fromFunction1(value))
  }
  
}

