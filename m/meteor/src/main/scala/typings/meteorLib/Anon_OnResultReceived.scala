package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnResultReceived extends js.Object {
  var onResultReceived: js.UndefOr[js.Function] = js.undefined
  var returnStubValue: js.UndefOr[scala.Boolean] = js.undefined
  var throwStubExceptions: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("wait")
  var wait_FAnon_OnResultReceived: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_OnResultReceived {
  @scala.inline
  def apply(
    onResultReceived: js.Function = null,
    returnStubValue: js.UndefOr[scala.Boolean] = js.undefined,
    throwStubExceptions: js.UndefOr[scala.Boolean] = js.undefined,
    wait: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_OnResultReceived = {
    val __obj = js.Dynamic.literal()
    if (onResultReceived != null) __obj.updateDynamic("onResultReceived")(onResultReceived)
    if (!js.isUndefined(returnStubValue)) __obj.updateDynamic("returnStubValue")(returnStubValue)
    if (!js.isUndefined(throwStubExceptions)) __obj.updateDynamic("throwStubExceptions")(throwStubExceptions)
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait)
    __obj.asInstanceOf[Anon_OnResultReceived]
  }
}

