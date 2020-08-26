package typings.msRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceClientOptions extends js.Object {
  var filters: js.UndefOr[js.Array[_]] = js.native
  var noRetryPolicy: js.UndefOr[Boolean] = js.native
  var requestOptions: js.UndefOr[ClientRequestOptions] = js.native
}

object ServiceClientOptions {
  @scala.inline
  def apply(): ServiceClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceClientOptions]
  }
  @scala.inline
  implicit class ServiceClientOptionsOps[Self <: ServiceClientOptions] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: js.Any*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[_]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setNoRetryPolicy(value: Boolean): Self = this.set("noRetryPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoRetryPolicy: Self = this.set("noRetryPolicy", js.undefined)
    @scala.inline
    def setRequestOptions(value: ClientRequestOptions): Self = this.set("requestOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestOptions: Self = this.set("requestOptions", js.undefined)
  }
  
}

