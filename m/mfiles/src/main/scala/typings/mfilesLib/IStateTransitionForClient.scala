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
    Clone: js.Function0[IStateTransitionForClient],
    FromState: scala.Double,
    GetAsLookup: js.Function0[ILookup],
    GetAsTypedValue: js.Function0[ITypedValue],
    ID: scala.Double,
    Name: java.lang.String,
    Selectable: scala.Boolean,
    SelectableFlagAffectedByPseudoUsers: scala.Boolean,
    ToState: scala.Double
  ): IStateTransitionForClient = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("FromState")(FromState)
    __obj.updateDynamic("GetAsLookup")(GetAsLookup)
    __obj.updateDynamic("GetAsTypedValue")(GetAsTypedValue)
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Selectable")(Selectable)
    __obj.updateDynamic("SelectableFlagAffectedByPseudoUsers")(SelectableFlagAffectedByPseudoUsers)
    __obj.updateDynamic("ToState")(ToState)
    __obj.asInstanceOf[IStateTransitionForClient]
  }
}

