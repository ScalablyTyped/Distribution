package typings.mendixmodelsdk.distSdkInternalVersionChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModifierValueHistory extends js.Object {
  /** descending list of change in previous meta model versions */
  var changedIn: js.UndefOr[js.Array[String]] = js.undefined
  var currentValue: Boolean
}

object IModifierValueHistory {
  @scala.inline
  def apply(currentValue: Boolean, changedIn: js.Array[String] = null): IModifierValueHistory = {
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any])
    if (changedIn != null) __obj.updateDynamic("changedIn")(changedIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModifierValueHistory]
  }
}

