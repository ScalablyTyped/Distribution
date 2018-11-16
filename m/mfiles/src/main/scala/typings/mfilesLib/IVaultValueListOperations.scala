package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultValueListOperations extends js.Object {
  def AddValueListAdmin(ValueList: IObjectTypeAdmin): IObjectTypeAdmin = js.native
  def GetBuiltInValueList(BuiltInValueList: mfilesLib.MFilesNs.MFBuiltInValueList): IObjectType = js.native
  def GetValueList(ValueList: mfilesLib.MFilesNs.MFBuiltInValueList): IObjectType = js.native
  def GetValueList(ValueList: scala.Double): IObjectType = js.native
  def GetValueListAdmin(ValueListID: mfilesLib.MFilesNs.MFBuiltInValueList): IObjectTypeAdmin = js.native
  def GetValueListAdmin(ValueListID: scala.Double): IObjectTypeAdmin = js.native
  def GetValueListIDByAlias(Alias: java.lang.String): scala.Double = js.native
  def GetValueListIDByGUID(ValueListGUID: java.lang.String): scala.Double = js.native
  def GetValueLists(): IObjectTypes = js.native
  def GetValueListsAdmin(): IObjectTypesAdmin = js.native
  def RefreshExternalValueList(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    RefreshType: mfilesLib.MFilesNs.MFExternalDBRefreshType
  ): scala.Unit = js.native
  def RefreshExternalValueList(ValueList: scala.Double, RefreshType: mfilesLib.MFilesNs.MFExternalDBRefreshType): scala.Unit = js.native
  def RemoveValueListAdmin(ValueListID: mfilesLib.MFilesNs.MFBuiltInValueList): scala.Unit = js.native
  def RemoveValueListAdmin(ValueListID: scala.Double): scala.Unit = js.native
  def UpdateValueListAdmin(ValueList: IObjectTypeAdmin): IObjectTypeAdmin = js.native
  def UpdateValueListWithAutomaticPermissionsAdmin(ObjectType: IObjectTypeAdmin, AutomaticPermissionsForcedActive: scala.Boolean): IObjectTypeAdmin = js.native
}

