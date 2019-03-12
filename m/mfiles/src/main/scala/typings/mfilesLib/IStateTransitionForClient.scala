package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStateTransitionForClient extends js.Object {
  var FromState: scala.Double
  val ID: scala.Double
  var Name: java.lang.String
  var Selectable: scala.Boolean
  var SelectableFlagAffectedByPseudoUsers: scala.Boolean
  var ToState: scala.Double
  def Clone(): IStateTransitionForClient
  def GetAsLookup(): ILookup
  def GetAsTypedValue(): ITypedValue
}

object IStateTransitionForClient {
  @scala.inline
  def apply(
    Clone: () => IStateTransitionForClient,
    FromState: scala.Double,
    GetAsLookup: () => ILookup,
    GetAsTypedValue: () => ITypedValue,
    ID: scala.Double,
    Name: java.lang.String,
    Selectable: scala.Boolean,
    SelectableFlagAffectedByPseudoUsers: scala.Boolean,
    ToState: scala.Double
  ): IStateTransitionForClient = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), FromState = FromState, GetAsLookup = js.Any.fromFunction0(GetAsLookup), GetAsTypedValue = js.Any.fromFunction0(GetAsTypedValue), ID = ID, Name = Name, Selectable = Selectable, SelectableFlagAffectedByPseudoUsers = SelectableFlagAffectedByPseudoUsers, ToState = ToState)
  
    __obj.asInstanceOf[IStateTransitionForClient]
  }
}

