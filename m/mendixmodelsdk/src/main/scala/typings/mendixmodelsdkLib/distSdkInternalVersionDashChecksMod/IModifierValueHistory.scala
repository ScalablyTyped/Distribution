package typings
package mendixmodelsdkLib.distSdkInternalVersionDashChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModifierValueHistory extends js.Object {
  /** descending list of change in previous meta model versions */
  var changedIn: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var currentValue: scala.Boolean
}

object IModifierValueHistory {
  @scala.inline
  def apply(currentValue: scala.Boolean, changedIn: js.Array[java.lang.String] = null): IModifierValueHistory = {
    val __obj = js.Dynamic.literal(currentValue = currentValue)
    if (changedIn != null) __obj.updateDynamic("changedIn")(changedIn)
    __obj.asInstanceOf[IModifierValueHistory]
  }
}

