package typings.meteor

import typings.meteor.meteorMod.Meteor.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReturnStubValue[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */] extends js.Object {
  var onResultReceived: js.UndefOr[
    js.Function2[
      /* error */ js.UndefOr[typings.meteor.meteorMod.globalError | Error], 
      /* result */ js.UndefOr[Result], 
      Unit
    ]
  ] = js.undefined
  var returnStubValue: js.UndefOr[Boolean] = js.undefined
  var throwStubExceptions: js.UndefOr[Boolean] = js.undefined
  @JSName("wait")
  var wait_FAnonReturnStubValue: js.UndefOr[Boolean] = js.undefined
}

object AnonReturnStubValue {
  @scala.inline
  def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](
    onResultReceived: (/* error */ js.UndefOr[typings.meteor.meteorMod.globalError | Error], /* result */ js.UndefOr[Result]) => Unit = null,
    returnStubValue: js.UndefOr[Boolean] = js.undefined,
    throwStubExceptions: js.UndefOr[Boolean] = js.undefined,
    wait: js.UndefOr[Boolean] = js.undefined
  ): AnonReturnStubValue[Result] = {
    val __obj = js.Dynamic.literal()
    if (onResultReceived != null) __obj.updateDynamic("onResultReceived")(js.Any.fromFunction2(onResultReceived))
    if (!js.isUndefined(returnStubValue)) __obj.updateDynamic("returnStubValue")(returnStubValue.asInstanceOf[js.Any])
    if (!js.isUndefined(throwStubExceptions)) __obj.updateDynamic("throwStubExceptions")(throwStubExceptions.asInstanceOf[js.Any])
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReturnStubValue[Result]]
  }
}

