package typings.mfiles

import typings.mfiles.MFiles.MFACLEnforcingMode
import typings.mfiles.MFiles.MFObjectOperationFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetPropertiesParams extends js.Object {
  var AccessControlListEnforcingMode: MFACLEnforcingMode
  var AccessControlListProvidedForEnforcing: IAccessControlList
  var AllowModifyingCheckedInObject: Boolean
  var FailIfNotLatestCheckedInVersion: Boolean
  var FullSet: Boolean
  var ObjVer: IObjVer
  var PropertyValuesToRemove: IIDs
  var PropertyValuesToSet: IPropertyValues
  def Clone(): ISetPropertiesParams
  def SetWithPermissions(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: Boolean,
    FailIfNotLatestCheckedInVersion: Boolean,
    PropertyValuesToSet: IPropertyValues,
    FullSet: Boolean,
    PropertyValuesToRemove: IIDs,
    ObjectOperationFlags: MFObjectOperationFlags,
    AccessControlListEnforcingMode: MFACLEnforcingMode,
    AccessControlListProvidedForEnforcing: IAccessControlList
  ): Unit
}

object ISetPropertiesParams {
  @scala.inline
  def apply(
    AccessControlListEnforcingMode: MFACLEnforcingMode,
    AccessControlListProvidedForEnforcing: IAccessControlList,
    AllowModifyingCheckedInObject: Boolean,
    Clone: () => ISetPropertiesParams,
    FailIfNotLatestCheckedInVersion: Boolean,
    FullSet: Boolean,
    ObjVer: IObjVer,
    PropertyValuesToRemove: IIDs,
    PropertyValuesToSet: IPropertyValues,
    SetWithPermissions: (IObjVer, Boolean, Boolean, IPropertyValues, Boolean, IIDs, MFObjectOperationFlags, MFACLEnforcingMode, IAccessControlList) => Unit
  ): ISetPropertiesParams = {
    val __obj = js.Dynamic.literal(AccessControlListEnforcingMode = AccessControlListEnforcingMode, AccessControlListProvidedForEnforcing = AccessControlListProvidedForEnforcing, AllowModifyingCheckedInObject = AllowModifyingCheckedInObject, Clone = js.Any.fromFunction0(Clone), FailIfNotLatestCheckedInVersion = FailIfNotLatestCheckedInVersion, FullSet = FullSet, ObjVer = ObjVer, PropertyValuesToRemove = PropertyValuesToRemove, PropertyValuesToSet = PropertyValuesToSet, SetWithPermissions = js.Any.fromFunction9(SetWithPermissions))
  
    __obj.asInstanceOf[ISetPropertiesParams]
  }
}

