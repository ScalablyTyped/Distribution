package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultClassGroupOperations extends js.Object {
  def AddClassGroup(ClassGroup: IClassGroup): IClassGroup = js.native
  def GetClassGroup(ObjectType: Double, ClassGroupID: Double): IClassGroup = js.native
  def GetClassGroup(ObjectType: MFBuiltInObjectType, ClassGroupID: Double): IClassGroup = js.native
  def GetClassGroupIDByGUID(ClassGroupGUID: String): Double = js.native
  def GetClassGroups(ObjectType: Double): IClassGroups = js.native
  def GetClassGroups(ObjectType: MFBuiltInObjectType): IClassGroups = js.native
  def RemoveClassGroup(ClassGroupID: Double): Unit = js.native
  def UpdateClassGroup(ClassGroup: IClassGroup): Unit = js.native
}

