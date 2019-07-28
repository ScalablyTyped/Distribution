package typings.peerDashDial.peerDashDialMod

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
    val __obj = js.Dynamic.literal(allowStop = allowStop, launch = js.Any.fromFunction1(launch), name = name, pid = pid, state = state)
  
    __obj.asInstanceOf[App]
  }
}

