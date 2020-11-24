package typings.mfiles

import typings.mfiles.MFiles.MFACLEnforcingMode
import typings.mfiles.MFiles.MFObjectOperationFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISetPropertiesParams extends js.Object {
  
  var AccessControlListEnforcingMode: MFACLEnforcingMode = js.native
  
  var AccessControlListProvidedForEnforcing: IAccessControlList = js.native
  
  var AllowModifyingCheckedInObject: Boolean = js.native
  
  def Clone(): ISetPropertiesParams = js.native
  
  var FailIfNotLatestCheckedInVersion: Boolean = js.native
  
  var FullSet: Boolean = js.native
  
  var ObjVer: IObjVer = js.native
  
  var PropertyValuesToRemove: IIDs = js.native
  
  var PropertyValuesToSet: IPropertyValues = js.native
  
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
  ): Unit = js.native
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
    val __obj = js.Dynamic.literal(AccessControlListEnforcingMode = AccessControlListEnforcingMode.asInstanceOf[js.Any], AccessControlListProvidedForEnforcing = AccessControlListProvidedForEnforcing.asInstanceOf[js.Any], AllowModifyingCheckedInObject = AllowModifyingCheckedInObject.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), FailIfNotLatestCheckedInVersion = FailIfNotLatestCheckedInVersion.asInstanceOf[js.Any], FullSet = FullSet.asInstanceOf[js.Any], ObjVer = ObjVer.asInstanceOf[js.Any], PropertyValuesToRemove = PropertyValuesToRemove.asInstanceOf[js.Any], PropertyValuesToSet = PropertyValuesToSet.asInstanceOf[js.Any], SetWithPermissions = js.Any.fromFunction9(SetWithPermissions))
    __obj.asInstanceOf[ISetPropertiesParams]
  }
  
  @scala.inline
  implicit class ISetPropertiesParamsOps[Self <: ISetPropertiesParams] (val x: Self) extends AnyVal {
    
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
    def setAccessControlListEnforcingMode(value: MFACLEnforcingMode): Self = this.set("AccessControlListEnforcingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessControlListProvidedForEnforcing(value: IAccessControlList): Self = this.set("AccessControlListProvidedForEnforcing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowModifyingCheckedInObject(value: Boolean): Self = this.set("AllowModifyingCheckedInObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => ISetPropertiesParams): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailIfNotLatestCheckedInVersion(value: Boolean): Self = this.set("FailIfNotLatestCheckedInVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullSet(value: Boolean): Self = this.set("FullSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjVer(value: IObjVer): Self = this.set("ObjVer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyValuesToRemove(value: IIDs): Self = this.set("PropertyValuesToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyValuesToSet(value: IPropertyValues): Self = this.set("PropertyValuesToSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetWithPermissions(
      value: (IObjVer, Boolean, Boolean, IPropertyValues, Boolean, IIDs, MFObjectOperationFlags, MFACLEnforcingMode, IAccessControlList) => Unit
    ): Self = this.set("SetWithPermissions", js.Any.fromFunction9(value))
  }
}
