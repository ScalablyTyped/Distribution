package typings.openfin.windowOptionMod

import typings.openfin.anon.CrossOriginInjection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Api extends js.Object {
  var iframe: js.UndefOr[CrossOriginInjection] = js.native
}

object Api {
  @scala.inline
  def apply(): Api = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Api]
  }
  @scala.inline
  implicit class ApiOps[Self <: Api] (val x: Self) extends AnyVal {
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
    def setIframe(value: CrossOriginInjection): Self = this.set("iframe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIframe: Self = this.set("iframe", js.undefined)
  }
  
}

