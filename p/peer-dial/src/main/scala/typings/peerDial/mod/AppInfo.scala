package typings.peerDial.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppInfo extends js.Object {
  var dialVer: String = js.native
  var name: String = js.native
  var options: AppInfoOptions = js.native
  var state: String = js.native
  var xmlns: String = js.native
}

object AppInfo {
  @scala.inline
  def apply(dialVer: String, name: String, options: AppInfoOptions, state: String, xmlns: String): AppInfo = {
    val __obj = js.Dynamic.literal(dialVer = dialVer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], xmlns = xmlns.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppInfo]
  }
  @scala.inline
  implicit class AppInfoOps[Self <: AppInfo] (val x: Self) extends AnyVal {
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
    def setDialVer(value: String): Self = this.set("dialVer", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: AppInfoOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setXmlns(value: String): Self = this.set("xmlns", value.asInstanceOf[js.Any])
  }
  
}

