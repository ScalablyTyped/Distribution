package typings.mfiles

import typings.mfiles.MFiles.MFACLEnforcingMode
import typings.mfiles.MFiles.MFObjectOperationFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISetPropertiesParams extends StObject {
  
  var AccessControlListEnforcingMode: MFACLEnforcingMode
  
  var AccessControlListProvidedForEnforcing: IAccessControlList
  
  var AllowModifyingCheckedInObject: Boolean
  
  def Clone(): ISetPropertiesParams
  
  var FailIfNotLatestCheckedInVersion: Boolean
  
  var FullSet: Boolean
  
  var ObjVer: IObjVer
  
  var PropertyValuesToRemove: IIDs
  
  var PropertyValuesToSet: IPropertyValues
  
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
  
  inline def apply(
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
  
  extension [Self <: ISetPropertiesParams](x: Self) {
    
    inline def setAccessControlListEnforcingMode(value: MFACLEnforcingMode): Self = StObject.set(x, "AccessControlListEnforcingMode", value.asInstanceOf[js.Any])
    
    inline def setAccessControlListProvidedForEnforcing(value: IAccessControlList): Self = StObject.set(x, "AccessControlListProvidedForEnforcing", value.asInstanceOf[js.Any])
    
    inline def setAllowModifyingCheckedInObject(value: Boolean): Self = StObject.set(x, "AllowModifyingCheckedInObject", value.asInstanceOf[js.Any])
    
    inline def setClone(value: () => ISetPropertiesParams): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setFailIfNotLatestCheckedInVersion(value: Boolean): Self = StObject.set(x, "FailIfNotLatestCheckedInVersion", value.asInstanceOf[js.Any])
    
    inline def setFullSet(value: Boolean): Self = StObject.set(x, "FullSet", value.asInstanceOf[js.Any])
    
    inline def setObjVer(value: IObjVer): Self = StObject.set(x, "ObjVer", value.asInstanceOf[js.Any])
    
    inline def setPropertyValuesToRemove(value: IIDs): Self = StObject.set(x, "PropertyValuesToRemove", value.asInstanceOf[js.Any])
    
    inline def setPropertyValuesToSet(value: IPropertyValues): Self = StObject.set(x, "PropertyValuesToSet", value.asInstanceOf[js.Any])
    
    inline def setSetWithPermissions(
      value: (IObjVer, Boolean, Boolean, IPropertyValues, Boolean, IIDs, MFObjectOperationFlags, MFACLEnforcingMode, IAccessControlList) => Unit
    ): Self = StObject.set(x, "SetWithPermissions", js.Any.fromFunction9(value))
  }
}
