package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClassGroup extends js.Object {
  var ID: Double = js.native
  var Members: IIDs = js.native
  var Name: String = js.native
  var ObjectType: MFBuiltInObjectType | Double = js.native
  def AddMember(Member: Double): Unit = js.native
  def Clone(): IClassGroup = js.native
  def RemoveMember(Member: Double): Unit = js.native
}

object IClassGroup {
  @scala.inline
  def apply(
    AddMember: Double => Unit,
    Clone: () => IClassGroup,
    ID: Double,
    Members: IIDs,
    Name: String,
    ObjectType: MFBuiltInObjectType | Double,
    RemoveMember: Double => Unit
  ): IClassGroup = {
    val __obj = js.Dynamic.literal(AddMember = js.Any.fromFunction1(AddMember), Clone = js.Any.fromFunction0(Clone), ID = ID.asInstanceOf[js.Any], Members = Members.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ObjectType = ObjectType.asInstanceOf[js.Any], RemoveMember = js.Any.fromFunction1(RemoveMember))
    __obj.asInstanceOf[IClassGroup]
  }
  @scala.inline
  implicit class IClassGroupOps[Self <: IClassGroup] (val x: Self) extends AnyVal {
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
    def setClone(value: () => IClassGroup): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setID(value: Double): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def setMembers(value: IIDs): Self = this.set("Members", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectType(value: MFBuiltInObjectType | Double): Self = this.set("ObjectType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveMember(value: Double => Unit): Self = this.set("RemoveMember", js.Any.fromFunction1(value))
  }
  
}

