package typings.ol.controlControlMod

import typings.ol.eventsMod.EventsKey
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Control
  extends typings.ol.objectMod.default {
  var element: HTMLElement = js.native
  var listenerKeys: js.Array[EventsKey] = js.native
  def getMap(): typings.ol.pluggableMapMod.default = js.native
  def setMap(map: typings.ol.pluggableMapMod.default): Unit = js.native
  def setTarget(target: String): Unit = js.native
  def setTarget(target: HTMLElement): Unit = js.native
}

