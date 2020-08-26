package typings.parse.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForceSecure extends js.Object {
  var forceSecure: js.UndefOr[Boolean] = js.native
}

object ForceSecure {
  @scala.inline
  def apply(): ForceSecure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForceSecure]
  }
  @scala.inline
  implicit class ForceSecureOps[Self <: ForceSecure] (val x: Self) extends AnyVal {
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
    def setForceSecure(value: Boolean): Self = this.set("forceSecure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceSecure: Self = this.set("forceSecure", js.undefined)
  }
  
}

