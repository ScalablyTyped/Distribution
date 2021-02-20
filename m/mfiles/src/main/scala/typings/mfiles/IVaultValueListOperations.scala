package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInValueList
import typings.mfiles.MFiles.MFExternalDBRefreshType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultValueListOperations extends StObject {
  
  def AddValueListAdmin(ValueList: IObjectTypeAdmin): IObjectTypeAdmin = js.native
  
  def GetBuiltInValueList(BuiltInValueList: MFBuiltInValueList): IObjectType = js.native
  
  def GetValueList(ValueList: Double): IObjectType = js.native
  def GetValueList(ValueList: MFBuiltInValueList): IObjectType = js.native
  
  def GetValueListAdmin(ValueListID: Double): IObjectTypeAdmin = js.native
  def GetValueListAdmin(ValueListID: MFBuiltInValueList): IObjectTypeAdmin = js.native
  
  def GetValueListIDByAlias(Alias: String): Double = js.native
  
  def GetValueListIDByGUID(ValueListGUID: String): Double = js.native
  
  def GetValueLists(): IObjectTypes = js.native
  
  def GetValueListsAdmin(): IObjectTypesAdmin = js.native
  
  def RefreshExternalValueList(ValueList: Double, RefreshType: MFExternalDBRefreshType): Unit = js.native
  def RefreshExternalValueList(ValueList: MFBuiltInValueList, RefreshType: MFExternalDBRefreshType): Unit = js.native
  
  def RemoveValueListAdmin(ValueListID: Double): Unit = js.native
  def RemoveValueListAdmin(ValueListID: MFBuiltInValueList): Unit = js.native
  
  def UpdateValueListAdmin(ValueList: IObjectTypeAdmin): IObjectTypeAdmin = js.native
  
  def UpdateValueListWithAutomaticPermissionsAdmin(ObjectType: IObjectTypeAdmin, AutomaticPermissionsForcedActive: Boolean): IObjectTypeAdmin = js.native
}
