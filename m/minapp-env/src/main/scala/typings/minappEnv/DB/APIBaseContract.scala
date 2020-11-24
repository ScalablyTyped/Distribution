package typings.minappEnv.DB

import typings.minappEnv.IAPIParam
import typings.minappEnv.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APIBaseContract[PROMISE_RETURN, CALLBACK_RETURN, PARAM /* <: IAPIParam[_] */, CONTEXT] extends js.Object {
  
  /**
    * In case of callback-style invocation, this function will be called
    */
  def getCallbackReturn(param: PARAM, context: CONTEXT): CALLBACK_RETURN = js.native
  
  def getContext(param: PARAM): CONTEXT = js.native
  
  def getFinalParam[T /* <: PARAM */](param: PARAM, context: CONTEXT): T = js.native
  
  def run[T /* <: PARAM */](param: T): Promise[PROMISE_RETURN] = js.native
}
object APIBaseContract {
  
  @scala.inline
  def apply[PROMISE_RETURN, CALLBACK_RETURN, PARAM /* <: IAPIParam[_] */, CONTEXT](
    getCallbackReturn: (PARAM, CONTEXT) => CALLBACK_RETURN,
    getContext: PARAM => CONTEXT,
    getFinalParam: (PARAM, CONTEXT) => js.Any,
    run: js.Any => Promise[PROMISE_RETURN]
  ): APIBaseContract[PROMISE_RETURN, CALLBACK_RETURN, PARAM, CONTEXT] = {
    val __obj = js.Dynamic.literal(getCallbackReturn = js.Any.fromFunction2(getCallbackReturn), getContext = js.Any.fromFunction1(getContext), getFinalParam = js.Any.fromFunction2(getFinalParam), run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[APIBaseContract[PROMISE_RETURN, CALLBACK_RETURN, PARAM, CONTEXT]]
  }
  
  @scala.inline
  implicit class APIBaseContractOps[Self <: APIBaseContract[_, _, _, _], PROMISE_RETURN, CALLBACK_RETURN, PARAM /* <: IAPIParam[_] */, CONTEXT] (val x: Self with (APIBaseContract[PROMISE_RETURN, CALLBACK_RETURN, PARAM, CONTEXT])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetCallbackReturn(value: (PARAM, CONTEXT) => CALLBACK_RETURN): Self = this.set("getCallbackReturn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetContext(value: PARAM => CONTEXT): Self = this.set("getContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFinalParam(value: (PARAM, CONTEXT) => js.Any): Self = this.set("getFinalParam", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRun(value: js.Any => Promise[PROMISE_RETURN]): Self = this.set("run", js.Any.fromFunction1(value))
  }
}
