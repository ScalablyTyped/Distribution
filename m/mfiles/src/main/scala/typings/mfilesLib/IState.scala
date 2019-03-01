package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IState extends js.Object {
  val ID: scala.Double
  var Name: java.lang.String
  var Selectable: scala.Boolean
  var SelectableFlagAffectedByPseudoUsers: scala.Boolean
  def GetAsLookup(): ILookup
  def GetAsTypedValue(): ITypedValue
}

object IState {
  @scala.inline
  def apply(
    GetAsLookup: js.Function0[ILookup],
    GetAsTypedValue: js.Function0[ITypedValue],
    ID: scala.Double,
    Name: java.lang.String,
    Selectable: scala.Boolean,
    SelectableFlagAffectedByPseudoUsers: scala.Boolean
  ): IState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetAsLookup")(GetAsLookup)
    __obj.updateDynamic("GetAsTypedValue")(GetAsTypedValue)
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Selectable")(Selectable)
    __obj.updateDynamic("SelectableFlagAffectedByPseudoUsers")(SelectableFlagAffectedByPseudoUsers)
    __obj.asInstanceOf[IState]
  }
}

