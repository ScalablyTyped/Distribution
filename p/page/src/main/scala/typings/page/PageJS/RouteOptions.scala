package typings.page.PageJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteOptions extends js.Object {
  /**
    * enable case-sensitive routes
    * @type {[type]}
    */
  var sensitive: js.UndefOr[Boolean] = js.native
  /**
    * enable strict matching for trailing slashes
    * @type {[type]}
    */
  var strict: js.UndefOr[Boolean] = js.native
}

object RouteOptions {
  @scala.inline
  def apply(): RouteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteOptions]
  }
  @scala.inline
  implicit class RouteOptionsOps[Self <: RouteOptions] (val x: Self) extends AnyVal {
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
    def setSensitive(value: Boolean): Self = this.set("sensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSensitive: Self = this.set("sensitive", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
  
}

