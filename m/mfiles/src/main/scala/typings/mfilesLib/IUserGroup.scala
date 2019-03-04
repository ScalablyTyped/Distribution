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
    AddMember: js.Function1[scala.Double, scala.Unit],
    Clone: js.Function0[IUserGroup],
    CloneFrom: js.Function1[IUserGroup, scala.Unit],
    ID: scala.Double,
    Members: IIDs,
    Name: java.lang.String,
    Predefined: scala.Boolean,
    RemoveMember: js.Function1[scala.Double, scala.Unit]
  ): IUserGroup = {
    val __obj = js.Dynamic.literal(AddMember = AddMember, Clone = Clone, CloneFrom = CloneFrom, ID = ID, Members = Members, Name = Name, Predefined = Predefined, RemoveMember = RemoveMember)
  
    __obj.asInstanceOf[IUserGroup]
  }
}

