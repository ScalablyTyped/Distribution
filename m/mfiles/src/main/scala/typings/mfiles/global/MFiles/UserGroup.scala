package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IIDs
import typings.mfiles.IUserGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.UserGroup")
@js.native
class UserGroup () extends IUserGroup {
  /* CompleteClass */
  override var ID: Double = js.native
  /* CompleteClass */
  override var Members: IIDs = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  override val Predefined: Boolean = js.native
  /* CompleteClass */
  override def AddMember(ID: Double): Unit = js.native
  /* CompleteClass */
  override def Clone(): IUserGroup = js.native
  /* CompleteClass */
  override def CloneFrom(UserGroup: IUserGroup): Unit = js.native
  /* CompleteClass */
  override def RemoveMember(ID: Double): Unit = js.native
}

@JSGlobal("MFiles.UserGroup")
@js.native
object UserGroup extends Instantiable0[IUserGroup]

