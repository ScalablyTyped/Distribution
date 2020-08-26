package typings.paypalCordovaPlugin.PayPalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseResult extends js.Object {
  var client: Client = js.native
  var response_type: String = js.native
}

object BaseResult {
  @scala.inline
  def apply(client: Client, response_type: String): BaseResult = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], response_type = response_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseResult]
  }
  @scala.inline
  implicit class BaseResultOps[Self <: BaseResult] (val x: Self) extends AnyVal {
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
    def setClient(value: Client): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse_type(value: String): Self = this.set("response_type", value.asInstanceOf[js.Any])
  }
  
}

