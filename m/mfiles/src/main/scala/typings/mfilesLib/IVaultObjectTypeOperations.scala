package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultObjectTypeOperations extends js.Object {
  def AddObjectTypeAdmin(ObjectType: IObjectTypeAdmin): IObjectTypeAdmin = js.native
  def GetBuiltInObjectType(ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType): IObjectType = js.native
  def GetObjectType(ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType): IObjectType = js.native
  def GetObjectType(ObjectType: scala.Double): IObjectType = js.native
  def GetObjectTypeAdmin(ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType): IObjectTypeAdmin = js.native
  def GetObjectTypeAdmin(ObjectType: scala.Double): IObjectTypeAdmin = js.native
  def GetObjectTypeIDByAlias(Alias: java.lang.String): scala.Double = js.native
  def GetObjectTypeIDByGUID(ObjectTypeGUID: java.lang.String): scala.Double = js.native
  def GetObjectTypes(): IObjectTypes = js.native
  def GetObjectTypesAdmin(): IObjectTypesAdmin = js.native
  def RefreshExternalObjectType(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    RefreshType: mfilesLib.MFilesNs.MFExternalDBRefreshType
  ): scala.Unit = js.native
  def RefreshExternalObjectType(ObjectType: scala.Double, RefreshType: mfilesLib.MFilesNs.MFExternalDBRefreshType): scala.Unit = js.native
  def RemoveObjectTypeAdmin(ObjectTypeID: scala.Double): scala.Unit = js.native
  def UpdateObjectTypeAdmin(ObjectType: IObjectTypeAdmin): IObjectTypeAdmin = js.native
  def UpdateObjectTypeWithAutomaticPermissionsAdmin(ObjectType: IObjectTypeAdmin, AutomaticPermissionsForcedActive: scala.Boolean): IObjectTypeAdmin = js.native
}

