package typings.next.anon

import typings.node.urlMod.UrlWithParsedQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewUrl extends js.Object {
  var newUrl: String = js.native
  var parsedDestination: UrlWithParsedQuery = js.native
}

object NewUrl {
  @scala.inline
  def apply(newUrl: String, parsedDestination: UrlWithParsedQuery): NewUrl = {
    val __obj = js.Dynamic.literal(newUrl = newUrl.asInstanceOf[js.Any], parsedDestination = parsedDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewUrl]
  }
  @scala.inline
  implicit class NewUrlOps[Self <: NewUrl] (val x: Self) extends AnyVal {
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
    def setNewUrl(value: String): Self = this.set("newUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setParsedDestination(value: UrlWithParsedQuery): Self = this.set("parsedDestination", value.asInstanceOf[js.Any])
  }
  
}

