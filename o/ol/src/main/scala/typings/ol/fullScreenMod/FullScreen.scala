package typings.ol.fullScreenMod

import typings.ol.eventsMod.EventsKey
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.enterfullscreen
import typings.ol.olStrings.leavefullscreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullScreen
  extends typings.ol.controlControlMod.default {
  @JSName("on")
  def on_enterfullscreen(`type`: enterfullscreen, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_leavefullscreen(`type`: leavefullscreen, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_enterfullscreen(`type`: enterfullscreen, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_leavefullscreen(`type`: leavefullscreen, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("un")
  def un_enterfullscreen(`type`: enterfullscreen, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_leavefullscreen(`type`: leavefullscreen, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}

