package typings.nodeMailjet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectOptions extends js.Object {
  val perform_api_call: js.UndefOr[Boolean] = js.native
  val proxyUrl: js.UndefOr[String] = js.native
  val timeout: js.UndefOr[Double] = js.native
  val url: js.UndefOr[String] = js.native
  val version: js.UndefOr[String] = js.native
}

object ConnectOptions {
  @scala.inline
  def apply(): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOptions]
  }
  @scala.inline
  implicit class ConnectOptionsOps[Self <: ConnectOptions] (val x: Self) extends AnyVal {
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
    def setPerform_api_call(value: Boolean): Self = this.set("perform_api_call", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerform_api_call: Self = this.set("perform_api_call", js.undefined)
    @scala.inline
    def setProxyUrl(value: String): Self = this.set("proxyUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyUrl: Self = this.set("proxyUrl", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

