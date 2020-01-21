package typings.peerDial.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
  var allowStop: Boolean
  var name: String
  var pid: String
  var state: String
  def launch(launchData: String): Unit
}

object App {
  @scala.inline
  def apply(allowStop: Boolean, launch: String => Unit, name: String, pid: String, state: String): App = {
    val __obj = js.Dynamic.literal(allowStop = allowStop.asInstanceOf[js.Any], launch = js.Any.fromFunction1(launch), name = name.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[App]
  }
}

