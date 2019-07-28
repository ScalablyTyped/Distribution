package typings.ol.observableMod

import typings.ol.eventsMod.EventsKey
import typings.ol.olStrings.change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observable
  extends typings.ol.eventsTargetMod.default {
  def changed(): Unit = js.native
  def getRevision(): Double = js.native
  def on(`type`: String, listener: js.Function1[/* p0 */ js.Any, Unit]): EventsKey | js.Array[EventsKey] = js.native
  def on(`type`: js.Array[String], listener: js.Function1[/* p0 */ js.Any, Unit]): EventsKey | js.Array[EventsKey] = js.native
  @JSName("on")
  def on_change(`type`: change, listener: js.Function1[/* evt */ typings.ol.eventsEventMod.default, Unit]): EventsKey = js.native
  def once(`type`: String, listener: js.Function1[/* p0 */ js.Any, Unit]): EventsKey | js.Array[EventsKey] = js.native
  def once(`type`: js.Array[String], listener: js.Function1[/* p0 */ js.Any, Unit]): EventsKey | js.Array[EventsKey] = js.native
  @JSName("once")
  def once_change(`type`: change, listener: js.Function1[/* evt */ typings.ol.eventsEventMod.default, Unit]): EventsKey = js.native
  def un(`type`: String, listener: js.Function1[/* p0 */ js.Any, Unit]): Unit = js.native
  def un(`type`: js.Array[String], listener: js.Function1[/* p0 */ js.Any, Unit]): Unit = js.native
  @JSName("un")
  def un_change(`type`: change, listener: js.Function1[/* evt */ typings.ol.eventsEventMod.default, Unit]): Unit = js.native
}

