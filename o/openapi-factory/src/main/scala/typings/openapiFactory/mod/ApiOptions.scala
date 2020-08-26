package typings.openapiFactory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiOptions extends js.Object {
  var errorMiddleware: js.UndefOr[js.Function0[_]] = js.native
  var requestMiddleware: js.UndefOr[js.Function0[_]] = js.native
  var responseMiddleware: js.UndefOr[js.Function0[_]] = js.native
}

object ApiOptions {
  @scala.inline
  def apply(): ApiOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiOptions]
  }
  @scala.inline
  implicit class ApiOptionsOps[Self <: ApiOptions] (val x: Self) extends AnyVal {
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
    def setErrorMiddleware(value: () => _): Self = this.set("errorMiddleware", js.Any.fromFunction0(value))
    @scala.inline
    def deleteErrorMiddleware: Self = this.set("errorMiddleware", js.undefined)
    @scala.inline
    def setRequestMiddleware(value: () => _): Self = this.set("requestMiddleware", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRequestMiddleware: Self = this.set("requestMiddleware", js.undefined)
    @scala.inline
    def setResponseMiddleware(value: () => _): Self = this.set("responseMiddleware", js.Any.fromFunction0(value))
    @scala.inline
    def deleteResponseMiddleware: Self = this.set("responseMiddleware", js.undefined)
  }
  
}

