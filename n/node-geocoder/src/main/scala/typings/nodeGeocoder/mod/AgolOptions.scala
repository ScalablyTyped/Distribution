package typings.nodeGeocoder.mod

import typings.nodeGeocoder.nodeGeocoderStrings.agol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgolOptions extends js.Object {
  var client_id: js.UndefOr[String] = js.native
  var client_secret: js.UndefOr[String] = js.native
  var provider: agol = js.native
}

object AgolOptions {
  @scala.inline
  def apply(provider: agol): AgolOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgolOptions]
  }
  @scala.inline
  implicit class AgolOptionsOps[Self <: AgolOptions] (val x: Self) extends AnyVal {
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
    def setProvider(value: agol): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient_id: Self = this.set("client_id", js.undefined)
    @scala.inline
    def setClient_secret(value: String): Self = this.set("client_secret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient_secret: Self = this.set("client_secret", js.undefined)
  }
  
}

