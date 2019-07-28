package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStateTransitionForClient extends js.Object {
  var FromState: Double
  val ID: Double
  var Name: String
  var Selectable: Boolean
  var SelectableFlagAffectedByPseudoUsers: Boolean
  var ToState: Double
  def Clone(): IStateTransitionForClient
  def GetAsLookup(): ILookup
  def GetAsTypedValue(): ITypedValue
}

object IStateTransitionForClient {
  @scala.inline
  def apply(
    Clone: () => IStateTransitionForClient,
    FromState: Double,
    GetAsLookup: () => ILookup,
    GetAsTypedValue: () => ITypedValue,
    ID: Double,
    Name: String,
    Selectable: Boolean,
    SelectableFlagAffectedByPseudoUsers: Boolean,
    ToState: Double
  ): IStateTransitionForClient = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), FromState = FromState, GetAsLookup = js.Any.fromFunction0(GetAsLookup), GetAsTypedValue = js.Any.fromFunction0(GetAsTypedValue), ID = ID, Name = Name, Selectable = Selectable, SelectableFlagAffectedByPseudoUsers = SelectableFlagAffectedByPseudoUsers, ToState = ToState)
  
    __obj.asInstanceOf[IStateTransitionForClient]
  }
}

