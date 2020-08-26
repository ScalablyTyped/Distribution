package typings.pollyjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiNamespace extends js.Object {
  var apiNamespace: js.UndefOr[String] = js.native
  var host: js.UndefOr[String] = js.native
}

object ApiNamespace {
  @scala.inline
  def apply(): ApiNamespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiNamespace]
  }
  @scala.inline
  implicit class ApiNamespaceOps[Self <: ApiNamespace] (val x: Self) extends AnyVal {
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
    def setApiNamespace(value: String): Self = this.set("apiNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiNamespace: Self = this.set("apiNamespace", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
  }
  
}

