package typings.mfiles

import typings.mfiles.MFiles.MFACLEnforcingMode
import typings.mfiles.MFiles.MFObjectOperationFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISetPropertiesParams extends StObject {
  
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
  implicit class ISetPropertiesParamsMutableBuilder[Self <: ISetPropertiesParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessControlListEnforcingMode(value: MFACLEnforcingMode): Self = StObject.set(x, "AccessControlListEnforcingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessControlListProvidedForEnforcing(value: IAccessControlList): Self = StObject.set(x, "AccessControlListProvidedForEnforcing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowModifyingCheckedInObject(value: Boolean): Self = StObject.set(x, "AllowModifyingCheckedInObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => ISetPropertiesParams): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailIfNotLatestCheckedInVersion(value: Boolean): Self = StObject.set(x, "FailIfNotLatestCheckedInVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullSet(value: Boolean): Self = StObject.set(x, "FullSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjVer(value: IObjVer): Self = StObject.set(x, "ObjVer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyValuesToRemove(value: IIDs): Self = StObject.set(x, "PropertyValuesToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyValuesToSet(value: IPropertyValues): Self = StObject.set(x, "PropertyValuesToSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetWithPermissions(
      value: (IObjVer, Boolean, Boolean, IPropertyValues, Boolean, IIDs, MFObjectOperationFlags, MFACLEnforcingMode, IAccessControlList) => Unit
    ): Self = StObject.set(x, "SetWithPermissions", js.Any.fromFunction9(value))
  }
}
