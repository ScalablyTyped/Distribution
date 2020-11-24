package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInObjectType
import typings.mfiles.MFiles.MFExternalDBRefreshType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultObjectTypeOperations extends js.Object {
  
  def AddObjectTypeAdmin(ObjectType: IObjectTypeAdmin): IObjectTypeAdmin = js.native
  
  def GetBuiltInObjectType(ObjectType: MFBuiltInObjectType): IObjectType = js.native
  
  def GetObjectType(ObjectType: Double): IObjectType = js.native
  def GetObjectType(ObjectType: MFBuiltInObjectType): IObjectType = js.native
  
  def GetObjectTypeAdmin(ObjectType: Double): IObjectTypeAdmin = js.native
  def GetObjectTypeAdmin(ObjectType: MFBuiltInObjectType): IObjectTypeAdmin = js.native
  
  def GetObjectTypeIDByAlias(Alias: String): Double = js.native
  
  def GetObjectTypeIDByGUID(ObjectTypeGUID: String): Double = js.native
  
  def GetObjectTypes(): IObjectTypes = js.native
  
  def GetObjectTypesAdmin(): IObjectTypesAdmin = js.native
  
  def RefreshExternalObjectType(ObjectType: Double, RefreshType: MFExternalDBRefreshType): Unit = js.native
  def RefreshExternalObjectType(ObjectType: MFBuiltInObjectType, RefreshType: MFExternalDBRefreshType): Unit = js.native
  
  def RemoveObjectTypeAdmin(ObjectTypeID: Double): Unit = js.native
  
  def UpdateObjectTypeAdmin(ObjectType: IObjectTypeAdmin): IObjectTypeAdmin = js.native
  
  def UpdateObjectTypeWithAutomaticPermissionsAdmin(ObjectType: IObjectTypeAdmin, AutomaticPermissionsForcedActive: Boolean): IObjectTypeAdmin = js.native
}
