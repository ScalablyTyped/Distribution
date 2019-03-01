package typings
package playcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PreventDefault extends js.Object {
  var preventDefault: js.UndefOr[scala.Boolean] = js.undefined
  var stopPropagation: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_PreventDefault {
  @scala.inline
  def apply(
    preventDefault: js.UndefOr[scala.Boolean] = js.undefined,
    stopPropagation: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_PreventDefault = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preventDefault)) __obj.updateDynamic("preventDefault")(preventDefault)
    if (!js.isUndefined(stopPropagation)) __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.asInstanceOf[Anon_PreventDefault]
  }
}

