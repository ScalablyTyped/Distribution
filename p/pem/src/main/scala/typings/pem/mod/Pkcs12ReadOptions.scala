package typings.pem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pkcs12ReadOptions extends js.Object {
  var clientKeyPassword: js.UndefOr[String] = js.native
  var p12Password: js.UndefOr[String] = js.native
}

object Pkcs12ReadOptions {
  @scala.inline
  def apply(): Pkcs12ReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pkcs12ReadOptions]
  }
  @scala.inline
  implicit class Pkcs12ReadOptionsOps[Self <: Pkcs12ReadOptions] (val x: Self) extends AnyVal {
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
    def setClientKeyPassword(value: String): Self = this.set("clientKeyPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientKeyPassword: Self = this.set("clientKeyPassword", js.undefined)
    @scala.inline
    def setP12Password(value: String): Self = this.set("p12Password", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteP12Password: Self = this.set("p12Password", js.undefined)
  }
  
}

