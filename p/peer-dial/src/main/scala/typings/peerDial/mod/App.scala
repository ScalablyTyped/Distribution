package typings.peerDial.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App extends js.Object {
  var allowStop: Boolean = js.native
  var name: String = js.native
  var pid: String = js.native
  var state: String = js.native
  def launch(launchData: String): Unit = js.native
}

object App {
  @scala.inline
  def apply(allowStop: Boolean, launch: String => Unit, name: String, pid: String, state: String): App = {
    val __obj = js.Dynamic.literal(allowStop = allowStop.asInstanceOf[js.Any], launch = js.Any.fromFunction1(launch), name = name.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  @scala.inline
  implicit class AppOps[Self <: App] (val x: Self) extends AnyVal {
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
    def setAllowStop(value: Boolean): Self = this.set("allowStop", value.asInstanceOf[js.Any])
    @scala.inline
    def setLaunch(value: String => Unit): Self = this.set("launch", js.Any.fromFunction1(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPid(value: String): Self = this.set("pid", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

