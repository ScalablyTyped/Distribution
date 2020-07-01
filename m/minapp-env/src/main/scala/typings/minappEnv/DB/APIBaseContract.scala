package typings.minappEnv.DB

import typings.minappEnv.IAPIParam
import typings.minappEnv.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIBaseContract[PROMISE_RETURN, CALLBACK_RETURN, PARAM /* <: IAPIParam[_] */, CONTEXT] extends js.Object {
  /**
    * In case of callback-style invocation, this function will be called
    */
  def getCallbackReturn(param: PARAM, context: CONTEXT): CALLBACK_RETURN
  def getContext(param: PARAM): CONTEXT
  def getFinalParam[T /* <: PARAM */](param: PARAM, context: CONTEXT): T
  def run[T /* <: PARAM */](param: T): Promise[PROMISE_RETURN]
}

object APIBaseContract {
  @scala.inline
  def apply[PROMISE_RETURN, CALLBACK_RETURN, /* <: typings.minappEnv.IAPIParam[_] */ PARAM, CONTEXT](
    getCallbackReturn: (PARAM, CONTEXT) => CALLBACK_RETURN,
    getContext: PARAM => CONTEXT,
    getFinalParam: (PARAM, CONTEXT) => js.Any,
    run: js.Any => Promise[PROMISE_RETURN]
  ): APIBaseContract[PROMISE_RETURN, CALLBACK_RETURN, PARAM, CONTEXT] = {
    val __obj = js.Dynamic.literal(getCallbackReturn = js.Any.fromFunction2(getCallbackReturn), getContext = js.Any.fromFunction1(getContext), getFinalParam = js.Any.fromFunction2(getFinalParam), run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[APIBaseContract[PROMISE_RETURN, CALLBACK_RETURN, PARAM, CONTEXT]]
  }
}

