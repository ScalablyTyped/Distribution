package typings.meteor.anon

import typings.meteor.EJSONable
import typings.meteor.EJSONableProperty
import typings.meteor.globalError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnStubValue[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */] extends js.Object {
  var onResultReceived: js.UndefOr[
    js.Function2[
      /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error], 
      /* result */ js.UndefOr[Result], 
      Unit
    ]
  ] = js.undefined
  var returnStubValue: js.UndefOr[Boolean] = js.undefined
  var throwStubExceptions: js.UndefOr[Boolean] = js.undefined
  @JSName("wait")
  var wait_FReturnStubValue: js.UndefOr[Boolean] = js.undefined
}

object ReturnStubValue {
  @scala.inline
  def apply[/* <: typings.meteor.EJSONable | (js.Array[typings.meteor.EJSONable | typings.meteor.EJSONableProperty]) | typings.meteor.EJSONableProperty */ Result](
    onResultReceived: (/* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error], /* result */ js.UndefOr[Result]) => Unit = null,
    returnStubValue: js.UndefOr[Boolean] = js.undefined,
    throwStubExceptions: js.UndefOr[Boolean] = js.undefined,
    wait: js.UndefOr[Boolean] = js.undefined
  ): ReturnStubValue[Result] = {
    val __obj = js.Dynamic.literal()
    if (onResultReceived != null) __obj.updateDynamic("onResultReceived")(js.Any.fromFunction2(onResultReceived))
    if (!js.isUndefined(returnStubValue)) __obj.updateDynamic("returnStubValue")(returnStubValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(throwStubExceptions)) __obj.updateDynamic("throwStubExceptions")(throwStubExceptions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnStubValue[Result]]
  }
}

