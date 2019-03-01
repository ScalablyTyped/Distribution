package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetPropertiesParams extends js.Object {
  var AccessControlListEnforcingMode: mfilesLib.MFilesNs.MFACLEnforcingMode
  var AccessControlListProvidedForEnforcing: IAccessControlList
  var AllowModifyingCheckedInObject: scala.Boolean
  var FailIfNotLatestCheckedInVersion: scala.Boolean
  var FullSet: scala.Boolean
  var ObjVer: IObjVer
  var PropertyValuesToRemove: IIDs
  var PropertyValuesToSet: IPropertyValues
  def Clone(): ISetPropertiesParams
  def SetWithPermissions(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: scala.Boolean,
    FailIfNotLatestCheckedInVersion: scala.Boolean,
    PropertyValuesToSet: IPropertyValues,
    FullSet: scala.Boolean,
    PropertyValuesToRemove: IIDs,
    ObjectOperationFlags: mfilesLib.MFilesNs.MFObjectOperationFlags,
    AccessControlListEnforcingMode: mfilesLib.MFilesNs.MFACLEnforcingMode,
    AccessControlListProvidedForEnforcing: IAccessControlList
  ): scala.Unit
}

object ISetPropertiesParams {
  @scala.inline
  def apply(
    AccessControlListEnforcingMode: mfilesLib.MFilesNs.MFACLEnforcingMode,
    AccessControlListProvidedForEnforcing: IAccessControlList,
    AllowModifyingCheckedInObject: scala.Boolean,
    Clone: js.Function0[ISetPropertiesParams],
    FailIfNotLatestCheckedInVersion: scala.Boolean,
    FullSet: scala.Boolean,
    ObjVer: IObjVer,
    PropertyValuesToRemove: IIDs,
    PropertyValuesToSet: IPropertyValues,
    SetWithPermissions: js.Function9[
      IObjVer, 
      scala.Boolean, 
      scala.Boolean, 
      IPropertyValues, 
      scala.Boolean, 
      IIDs, 
      mfilesLib.MFilesNs.MFObjectOperationFlags, 
      mfilesLib.MFilesNs.MFACLEnforcingMode, 
      IAccessControlList, 
      scala.Unit
    ]
  ): ISetPropertiesParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AccessControlListEnforcingMode")(AccessControlListEnforcingMode)
    __obj.updateDynamic("AccessControlListProvidedForEnforcing")(AccessControlListProvidedForEnforcing)
    __obj.updateDynamic("AllowModifyingCheckedInObject")(AllowModifyingCheckedInObject)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("FailIfNotLatestCheckedInVersion")(FailIfNotLatestCheckedInVersion)
    __obj.updateDynamic("FullSet")(FullSet)
    __obj.updateDynamic("ObjVer")(ObjVer)
    __obj.updateDynamic("PropertyValuesToRemove")(PropertyValuesToRemove)
    __obj.updateDynamic("PropertyValuesToSet")(PropertyValuesToSet)
    __obj.updateDynamic("SetWithPermissions")(SetWithPermissions)
    __obj.asInstanceOf[ISetPropertiesParams]
  }
}

