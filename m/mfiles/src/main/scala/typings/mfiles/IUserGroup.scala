package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUserGroup extends js.Object {
  var ID: Double = js.native
  var Members: IIDs = js.native
  var Name: String = js.native
  val Predefined: Boolean = js.native
  def AddMember(ID: Double): Unit = js.native
  def Clone(): IUserGroup = js.native
  def CloneFrom(UserGroup: IUserGroup): Unit = js.native
  def RemoveMember(ID: Double): Unit = js.native
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
  @scala.inline
  implicit class IUserGroupOps[Self <: IUserGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddMember(value: Double => Unit): Self = this.set("AddMember", js.Any.fromFunction1(value))
    @scala.inline
    def setClone(value: () => IUserGroup): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setCloneFrom(value: IUserGroup => Unit): Self = this.set("CloneFrom", js.Any.fromFunction1(value))
    @scala.inline
    def setID(value: Double): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def setMembers(value: IIDs): Self = this.set("Members", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPredefined(value: Boolean): Self = this.set("Predefined", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveMember(value: Double => Unit): Self = this.set("RemoveMember", js.Any.fromFunction1(value))
  }
  
}

