package typings
package olLib.interactionInteractionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interaction
  extends olLib.objectMod.default {
  def getActive(): scala.Boolean = js.native
  def getMap(): olLib.pluggableMapMod.default = js.native
  def handleEvent(mapBrowserEvent: olLib.mapBrowserEventMod.default): scala.Boolean = js.native
  @JSName("on")
  def on_changeactive(
    `type`: olLib.olLibStrings.`change:active`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changeactive(
    `type`: olLib.olLibStrings.`change:active`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  def setActive(active: scala.Boolean): scala.Unit = js.native
  def setMap(map: olLib.pluggableMapMod.default): scala.Unit = js.native
  @JSName("un")
  def un_changeactive(
    `type`: olLib.olLibStrings.`change:active`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
}

