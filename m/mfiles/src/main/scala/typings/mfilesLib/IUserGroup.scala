package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserGroup extends js.Object {
  var ID: scala.Double
  var Members: IIDs
  var Name: java.lang.String
  val Predefined: scala.Boolean
  def AddMember(ID: scala.Double): scala.Unit
  def Clone(): IUserGroup
  def CloneFrom(UserGroup: IUserGroup): scala.Unit
  def RemoveMember(ID: scala.Double): scala.Unit
}

object IUserGroup {
  @scala.inline
  def apply(
    AddMember: scala.Double => scala.Unit,
    Clone: () => IUserGroup,
    CloneFrom: IUserGroup => scala.Unit,
    ID: scala.Double,
    Members: IIDs,
    Name: java.lang.String,
    Predefined: scala.Boolean,
    RemoveMember: scala.Double => scala.Unit
  ): IUserGroup = {
    val __obj = js.Dynamic.literal(AddMember = js.Any.fromFunction1(AddMember), Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), ID = ID, Members = Members, Name = Name, Predefined = Predefined, RemoveMember = js.Any.fromFunction1(RemoveMember))
  
    __obj.asInstanceOf[IUserGroup]
  }
}

