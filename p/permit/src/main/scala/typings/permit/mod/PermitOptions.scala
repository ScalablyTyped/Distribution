package typings.permit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermitOptions extends js.Object {
  var proxy: js.UndefOr[String] = js.native
  var realm: js.UndefOr[String] = js.native
  var scheme: js.UndefOr[String] = js.native
}

object PermitOptions {
  @scala.inline
  def apply(): PermitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermitOptions]
  }
  @scala.inline
  implicit class PermitOptionsOps[Self <: PermitOptions] (val x: Self) extends AnyVal {
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
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    @scala.inline
    def setRealm(value: String): Self = this.set("realm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRealm: Self = this.set("realm", js.undefined)
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
  }
  
}

