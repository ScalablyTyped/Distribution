package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pullrequest extends js.Object {
  var html: HrefString = js.native
  var pull_request: HrefString = js.native
}

object Pullrequest {
  @scala.inline
  def apply(html: HrefString, pull_request: HrefString): Pullrequest = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pullrequest]
  }
  @scala.inline
  implicit class PullrequestOps[Self <: Pullrequest] (val x: Self) extends AnyVal {
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
  }
  
}

