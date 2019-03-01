package typings
package mendixmodelsdkLib.distSdkInternalModelDashServerDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISendDeltasResult extends js.Object {
  var firstError: js.Any
}

object ISendDeltasResult {
  @scala.inline
  def apply(firstError: js.Any): ISendDeltasResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("firstError")(firstError)
    __obj.asInstanceOf[ISendDeltasResult]
  }
}

