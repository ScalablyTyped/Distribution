package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Html extends js.Object {
  var html: HrefString = js.native
  var pull_request: HrefString = js.native
  var self: HrefString = js.native
}

object Html {
  @scala.inline
  def apply(html: HrefString, pull_request: HrefString, self: HrefString): Html = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[Html]
  }
  @scala.inline
  implicit class HtmlOps[Self <: Html] (val x: Self) extends AnyVal {
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
    def setHtml(value: HrefString): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def setPull_request(value: HrefString): Self = this.set("pull_request", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelf(value: HrefString): Self = this.set("self", value.asInstanceOf[js.Any])
  }
  
}

