package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.SetPropertiesParams")
@js.native
class SetPropertiesParams ()
  extends mfilesLib.ISetPropertiesParams {
  /* CompleteClass */
  override var AccessControlListEnforcingMode: MFACLEnforcingMode = js.native
  /* CompleteClass */
  override var AccessControlListProvidedForEnforcing: mfilesLib.IAccessControlList = js.native
  /* CompleteClass */
  override var AllowModifyingCheckedInObject: scala.Boolean = js.native
  /* CompleteClass */
  override var FailIfNotLatestCheckedInVersion: scala.Boolean = js.native
  /* CompleteClass */
  override var FullSet: scala.Boolean = js.native
  /* CompleteClass */
  override var ObjVer: mfilesLib.IObjVer = js.native
  /* CompleteClass */
  override var PropertyValuesToRemove: mfilesLib.IIDs = js.native
  /* CompleteClass */
  override var PropertyValuesToSet: mfilesLib.IPropertyValues = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.ISetPropertiesParams = js.native
  /* CompleteClass */
  override def SetWithPermissions(
    ObjVer: mfilesLib.IObjVer,
    AllowModifyingCheckedInObject: scala.Boolean,
    FailIfNotLatestCheckedInVersion: scala.Boolean,
    PropertyValuesToSet: mfilesLib.IPropertyValues,
    FullSet: scala.Boolean,
    PropertyValuesToRemove: mfilesLib.IIDs,
    ObjectOperationFlags: MFObjectOperationFlags,
    AccessControlListEnforcingMode: MFACLEnforcingMode,
    AccessControlListProvidedForEnforcing: mfilesLib.IAccessControlList
  ): scala.Unit = js.native
}

@JSGlobal("MFiles.SetPropertiesParams")
@js.native
object SetPropertiesParams
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.ISetPropertiesParams]

