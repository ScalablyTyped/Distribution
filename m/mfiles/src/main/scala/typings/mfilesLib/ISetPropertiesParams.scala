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
    val __obj = js.Dynamic.literal(AccessControlListEnforcingMode = AccessControlListEnforcingMode, AccessControlListProvidedForEnforcing = AccessControlListProvidedForEnforcing, AllowModifyingCheckedInObject = AllowModifyingCheckedInObject, Clone = Clone, FailIfNotLatestCheckedInVersion = FailIfNotLatestCheckedInVersion, FullSet = FullSet, ObjVer = ObjVer, PropertyValuesToRemove = PropertyValuesToRemove, PropertyValuesToSet = PropertyValuesToSet, SetWithPermissions = SetWithPermissions)
  
    __obj.asInstanceOf[ISetPropertiesParams]
  }
}

