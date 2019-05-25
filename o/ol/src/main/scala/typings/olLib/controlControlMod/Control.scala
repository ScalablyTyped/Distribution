package typings
package olLib.controlControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Control
  extends olLib.objectMod.default {
  var element: stdLib.HTMLElement = js.native
  var listenerKeys: js.Array[olLib.eventsMod.EventsKey] = js.native
  def getMap(): olLib.pluggableMapMod.default = js.native
  def setMap(map: olLib.pluggableMapMod.default): scala.Unit = js.native
  def setTarget(target: java.lang.String): scala.Unit = js.native
  def setTarget(target: stdLib.HTMLElement): scala.Unit = js.native
}

