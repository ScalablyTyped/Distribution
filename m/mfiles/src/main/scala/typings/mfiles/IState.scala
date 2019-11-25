package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IState extends js.Object {
  val ID: Double
  var Name: String
  var Selectable: Boolean
  var SelectableFlagAffectedByPseudoUsers: Boolean
  def GetAsLookup(): ILookup
  def GetAsTypedValue(): ITypedValue
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
}

