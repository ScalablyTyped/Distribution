package typings.mfiles.global.MFiles

import typings.mfiles.IAccessControlList
import typings.mfiles.IIDs
import typings.mfiles.IObjVer
import typings.mfiles.IPropertyValues
import typings.mfiles.ISetPropertiesParams
import typings.mfiles.MFiles.MFACLEnforcingMode
import typings.mfiles.MFiles.MFObjectOperationFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.SetPropertiesParams")
@js.native
open class SetPropertiesParams ()
  extends StObject
     with ISetPropertiesParams {
  
  /* CompleteClass */
  var AccessControlListEnforcingMode: MFACLEnforcingMode = js.native
  
  /* CompleteClass */
  var AccessControlListProvidedForEnforcing: IAccessControlList = js.native
  
  /* CompleteClass */
  var AllowModifyingCheckedInObject: Boolean = js.native
  
  /* CompleteClass */
  override def Clone(): ISetPropertiesParams = js.native
  
  /* CompleteClass */
  var FailIfNotLatestCheckedInVersion: Boolean = js.native
  
  /* CompleteClass */
  var FullSet: Boolean = js.native
  
  /* CompleteClass */
  var ObjVer: IObjVer = js.native
  
  /* CompleteClass */
  var PropertyValuesToRemove: IIDs = js.native
  
  /* CompleteClass */
  var PropertyValuesToSet: IPropertyValues = js.native
  
  /* CompleteClass */
  override def SetWithPermissions(
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
