package typings.ol.interactionInteractionMod

import typings.ol.eventsMod.EventsKey
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.`change:active`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interaction
  extends typings.ol.objectMod.default {
  def getActive(): Boolean = js.native
  def getMap(): typings.ol.pluggableMapMod.default = js.native
  def handleEvent(mapBrowserEvent: typings.ol.mapBrowserEventMod.default): Boolean = js.native
  @JSName("on")
  def on_changeactive(`type`: `change:active`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeactive(`type`: `change:active`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  def setActive(active: Boolean): Unit = js.native
  def setMap(map: typings.ol.pluggableMapMod.default): Unit = js.native
  @JSName("un")
  def un_changeactive(`type`: `change:active`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}

