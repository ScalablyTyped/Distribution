package typings.mfiles.MFilesNs

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IUserOrUserGroupID
import typings.mfiles.IUserOrUserGroupIDs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.UserOrUserGroupIDs")
@js.native
class UserOrUserGroupIDs () extends IUserOrUserGroupIDs {
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override def Add(Index: Double, UserOrUserGroupID: IUserOrUserGroupID): Unit = js.native
  /* CompleteClass */
  override def Clone(): IUserOrUserGroupIDs = js.native
  /* CompleteClass */
  override def GetUserOrUserGroupID(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): IUserOrUserGroupID = js.native
  /* CompleteClass */
  override def GetUserOrUserGroupIDIndex(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): Double = js.native
  /* CompleteClass */
  override def Item(Index: Double): IUserOrUserGroupID = js.native
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
}

@JSGlobal("MFiles.UserOrUserGroupIDs")
@js.native
object UserOrUserGroupIDs extends Instantiable0[IUserOrUserGroupIDs]

