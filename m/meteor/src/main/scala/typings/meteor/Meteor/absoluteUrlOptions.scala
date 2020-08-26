package typings.meteor.Meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait absoluteUrlOptions extends js.Object {
  var replaceLocalhost: js.UndefOr[Boolean] = js.native
  var rootUrl: js.UndefOr[String] = js.native
  var secure: js.UndefOr[Boolean] = js.native
}

object absoluteUrlOptions {
  @scala.inline
  def apply(): absoluteUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[absoluteUrlOptions]
  }
  @scala.inline
  implicit class absoluteUrlOptionsOps[Self <: absoluteUrlOptions] (val x: Self) extends AnyVal {
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
    def setReplaceLocalhost(value: Boolean): Self = this.set("replaceLocalhost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceLocalhost: Self = this.set("replaceLocalhost", js.undefined)
    @scala.inline
    def setRootUrl(value: String): Self = this.set("rootUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootUrl: Self = this.set("rootUrl", js.undefined)
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
  }
  
}

