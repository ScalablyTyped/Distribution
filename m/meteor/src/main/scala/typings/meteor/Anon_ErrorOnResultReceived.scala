package typings.meteor

import typings.meteor.MeteorNs.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorOnResultReceived[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */] extends js.Object {
  var onResultReceived: js.UndefOr[
    js.Function2[/* error */ js.UndefOr[global_Error | Error], /* result */ js.UndefOr[Result], Unit]
  ] = js.undefined
  var returnStubValue: js.UndefOr[Boolean] = js.undefined
  var throwStubExceptions: js.UndefOr[Boolean] = js.undefined
  @JSName("wait")
  var wait_FAnon_ErrorOnResultReceived: js.UndefOr[Boolean] = js.undefined
}

object Anon_ErrorOnResultReceived {
  @scala.inline
  def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](
    onResultReceived: (/* error */ js.UndefOr[global_Error | Error], /* result */ js.UndefOr[Result]) => Unit = null,
    returnStubValue: js.UndefOr[Boolean] = js.undefined,
    throwStubExceptions: js.UndefOr[Boolean] = js.undefined,
    wait: js.UndefOr[Boolean] = js.undefined
  ): Anon_ErrorOnResultReceived[Result] = {
    val __obj = js.Dynamic.literal()
    if (onResultReceived != null) __obj.updateDynamic("onResultReceived")(js.Any.fromFunction2(onResultReceived))
    if (!js.isUndefined(returnStubValue)) __obj.updateDynamic("returnStubValue")(returnStubValue)
    if (!js.isUndefined(throwStubExceptions)) __obj.updateDynamic("throwStubExceptions")(throwStubExceptions)
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait)
    __obj.asInstanceOf[Anon_ErrorOnResultReceived[Result]]
  }
}

