package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultClassGroupOperations extends js.Object {
  def AddClassGroup(ClassGroup: IClassGroup): IClassGroup = js.native
  def GetClassGroup(ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType, ClassGroupID: scala.Double): IClassGroup = js.native
  def GetClassGroup(ObjectType: scala.Double, ClassGroupID: scala.Double): IClassGroup = js.native
  def GetClassGroupIDByGUID(ClassGroupGUID: java.lang.String): scala.Double = js.native
  def GetClassGroups(ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType): IClassGroups = js.native
  def GetClassGroups(ObjectType: scala.Double): IClassGroups = js.native
  def RemoveClassGroup(ClassGroupID: scala.Double): scala.Unit = js.native
  def UpdateClassGroup(ClassGroup: IClassGroup): scala.Unit = js.native
}

