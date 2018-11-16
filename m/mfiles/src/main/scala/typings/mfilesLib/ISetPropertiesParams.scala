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

