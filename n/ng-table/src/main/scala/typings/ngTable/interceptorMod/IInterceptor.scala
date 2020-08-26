package typings.ngTable.interceptorMod

import typings.ngTable.ngTableParamsMod.NgTableParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInterceptor[T] extends js.Object {
  var response: js.UndefOr[js.Function2[/* data */ js.Any, /* params */ NgTableParams[T], _]] = js.native
  var responseError: js.UndefOr[js.Function2[/* reason */ js.Any, /* params */ NgTableParams[T], _]] = js.native
}

object IInterceptor {
  @scala.inline
  def apply[T](): IInterceptor[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInterceptor[T]]
  }
  @scala.inline
  implicit class IInterceptorOps[Self <: IInterceptor[_], T] (val x: Self with IInterceptor[T]) extends AnyVal {
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
    def setResponse(value: (/* data */ js.Any, /* params */ NgTableParams[T]) => _): Self = this.set("response", js.Any.fromFunction2(value))
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    @scala.inline
    def setResponseError(value: (/* reason */ js.Any, /* params */ NgTableParams[T]) => _): Self = this.set("responseError", js.Any.fromFunction2(value))
    @scala.inline
    def deleteResponseError: Self = this.set("responseError", js.undefined)
  }
  
}

