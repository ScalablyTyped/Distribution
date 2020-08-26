package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IState extends js.Object {
  val ID: Double = js.native
  var Name: String = js.native
  var Selectable: Boolean = js.native
  var SelectableFlagAffectedByPseudoUsers: Boolean = js.native
  def GetAsLookup(): ILookup = js.native
  def GetAsTypedValue(): ITypedValue = js.native
}

object IState {
  @scala.inline
  def apply(
    GetAsLookup: () => ILookup,
    GetAsTypedValue: () => ITypedValue,
    ID: Double,
    Name: String,
    Selectable: Boolean,
    SelectableFlagAffectedByPseudoUsers: Boolean
  ): IState = {
    val __obj = js.Dynamic.literal(GetAsLookup = js.Any.fromFunction0(GetAsLookup), GetAsTypedValue = js.Any.fromFunction0(GetAsTypedValue), ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Selectable = Selectable.asInstanceOf[js.Any], SelectableFlagAffectedByPseudoUsers = SelectableFlagAffectedByPseudoUsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IState]
  }
  @scala.inline
  implicit class IStateOps[Self <: IState] (val x: Self) extends AnyVal {
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
    def setGetAsLookup(value: () => ILookup): Self = this.set("GetAsLookup", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAsTypedValue(value: () => ITypedValue): Self = this.set("GetAsTypedValue", js.Any.fromFunction0(value))
    @scala.inline
    def setID(value: Double): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("Selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectableFlagAffectedByPseudoUsers(value: Boolean): Self = this.set("SelectableFlagAffectedByPseudoUsers", value.asInstanceOf[js.Any])
  }
  
}

