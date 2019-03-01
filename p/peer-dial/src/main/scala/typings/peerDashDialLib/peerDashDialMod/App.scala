package typings
package peerDashDialLib.peerDashDialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
  var allowStop: scala.Boolean
  var name: java.lang.String
  var pid: java.lang.String
  var state: java.lang.String
  def launch(launchData: java.lang.String): scala.Unit
}

object App {
  @scala.inline
  def apply(
    allowStop: scala.Boolean,
    launch: js.Function1[java.lang.String, scala.Unit],
    name: java.lang.String,
    pid: java.lang.String,
    state: java.lang.String
  ): App = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowStop")(allowStop)
    __obj.updateDynamic("launch")(launch)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("pid")(pid)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[App]
  }
}

