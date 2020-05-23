package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IAccessControlEntryData
import typings.mfiles.MFiles.MFPermission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.AccessControlEntryData")
@js.native
class AccessControlEntryData () extends IAccessControlEntryData {
  /* CompleteClass */
  override var AttachObjectsPermission: MFPermission = js.native
  /* CompleteClass */
  override var ChangePermissionsPermission: MFPermission = js.native
  /* CompleteClass */
  override var DeletePermission: MFPermission = js.native
  /* CompleteClass */
  override var EditPermission: MFPermission = js.native
  /* CompleteClass */
  override var ReadPermission: MFPermission = js.native
  /* CompleteClass */
  override def Clone(): IAccessControlEntryData = js.native
  /* CompleteClass */
  override def SetAllPermissions(Permission: MFPermission): Unit = js.native
}

@JSGlobal("MFiles.AccessControlEntryData")
@js.native
object AccessControlEntryData extends Instantiable0[IAccessControlEntryData]

