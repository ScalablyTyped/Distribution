package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorOnResultReceived[Result /* <: EJSONable | js.Array[EJSONable] | EJSONableProperty | js.Array[EJSONableProperty] */] extends js.Object {
  var onResultReceived: js.UndefOr[
    js.Function2[
      /* error */ js.UndefOr[global_Error | meteorLib.meteorMeteorMod.MeteorNs.Error], 
      /* result */ js.UndefOr[Result], 
      scala.Unit
    ]
  ] = js.undefined
  var returnStubValue: js.UndefOr[scala.Boolean] = js.undefined
  var throwStubExceptions: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("wait")
  var wait_FAnon_ErrorOnResultReceived: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ErrorOnResultReceived {
  @scala.inline
  def apply[Result /* <: EJSONable | js.Array[EJSONable] | EJSONableProperty | js.Array[EJSONableProperty] */](
    onResultReceived: (/* error */ js.UndefOr[global_Error | meteorLib.meteorMeteorMod.MeteorNs.Error], /* result */ js.UndefOr[Result]) => scala.Unit = null,
    returnStubValue: js.UndefOr[scala.Boolean] = js.undefined,
    throwStubExceptions: js.UndefOr[scala.Boolean] = js.undefined,
    wait: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ErrorOnResultReceived[Result] = {
    val __obj = js.Dynamic.literal()
    if (onResultReceived != null) __obj.updateDynamic("onResultReceived")(js.Any.fromFunction2(onResultReceived))
    if (!js.isUndefined(returnStubValue)) __obj.updateDynamic("returnStubValue")(returnStubValue)
    if (!js.isUndefined(throwStubExceptions)) __obj.updateDynamic("throwStubExceptions")(throwStubExceptions)
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait)
    __obj.asInstanceOf[Anon_ErrorOnResultReceived[Result]]
  }
}

