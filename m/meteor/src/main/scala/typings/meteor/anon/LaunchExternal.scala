package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchExternal extends js.Object {
  var launchExternal: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object LaunchExternal {
  @scala.inline
  def apply(): LaunchExternal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchExternal]
  }
  @scala.inline
  implicit class LaunchExternalOps[Self <: LaunchExternal] (val x: Self) extends AnyVal {
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
    def setLaunchExternal(value: Boolean): Self = this.set("launchExternal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchExternal: Self = this.set("launchExternal", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

