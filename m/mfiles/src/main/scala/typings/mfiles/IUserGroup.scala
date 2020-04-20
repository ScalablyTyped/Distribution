package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserGroup extends js.Object {
  var ID: Double
  var Members: IIDs
  var Name: String
  val Predefined: Boolean
  def AddMember(ID: Double): Unit
  def Clone(): IUserGroup
  def CloneFrom(UserGroup: IUserGroup): Unit
  def RemoveMember(ID: Double): Unit
}

object IUserGroup {
  @scala.inline
  def apply(
    AddMember: Double => Unit,
    Clone: () => IUserGroup,
    CloneFrom: IUserGroup => Unit,
    ID: Double,
    Members: IIDs,
    Name: String,
    Predefined: Boolean,
    RemoveMember: Double => Unit
  ): IUserGroup = {
    val __obj = js.Dynamic.literal(AddMember = js.Any.fromFunction1(AddMember), Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), ID = ID.asInstanceOf[js.Any], Members = Members.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Predefined = Predefined.asInstanceOf[js.Any], RemoveMember = js.Any.fromFunction1(RemoveMember))
    __obj.asInstanceOf[IUserGroup]
  }
}

