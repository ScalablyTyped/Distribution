package typings.mfiles

import typings.mfiles.MFiles.MFPermission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlEntry extends js.Object {
  var ChangePermissionsPermission: MFPermission
  var EditPermission: MFPermission
  var IsGroup: Boolean
  var ReadPermission: MFPermission
  var UserOrGroupID: Double
  def Clone(): IAccessControlEntry
}

object IAccessControlEntry {
  @scala.inline
  def apply(
    ChangePermissionsPermission: MFPermission,
    Clone: () => IAccessControlEntry,
    EditPermission: MFPermission,
    IsGroup: Boolean,
    ReadPermission: MFPermission,
    UserOrGroupID: Double
  ): IAccessControlEntry = {
    val __obj = js.Dynamic.literal(ChangePermissionsPermission = ChangePermissionsPermission.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), EditPermission = EditPermission.asInstanceOf[js.Any], IsGroup = IsGroup.asInstanceOf[js.Any], ReadPermission = ReadPermission.asInstanceOf[js.Any], UserOrGroupID = UserOrGroupID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccessControlEntry]
  }
}

