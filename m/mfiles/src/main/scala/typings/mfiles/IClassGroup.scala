package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClassGroup extends js.Object {
  var ID: Double
  var Members: IIDs
  var Name: String
  var ObjectType: MFBuiltInObjectType | Double
  def AddMember(Member: Double): Unit
  def Clone(): IClassGroup
  def RemoveMember(Member: Double): Unit
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
}

