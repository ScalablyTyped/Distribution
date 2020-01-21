package typings.ol

import typings.ol.eventsMod.EventsKey
import typings.ol.olStrings.change
import typings.ol.olStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/Observable", JSImport.Namespace)
@js.native
object observableMod extends js.Object {
  @js.native
  trait Observable
    extends typings.ol.targetMod.default {
    def changed(): Unit = js.native
    def getRevision(): Double = js.native
    def on(`type`: String, listener: js.Function1[/* p0 */ js.Any, Unit]): EventsKey | js.Array[EventsKey] = js.native
    def on(`type`: js.Array[String], listener: js.Function1[/* p0 */ js.Any, Unit]): EventsKey | js.Array[EventsKey] = js.native
    @JSName("on")
    def on_change(`type`: change, listener: js.Function1[/* evt */ typings.ol.eventMod.default, Unit]): EventsKey = js.native
    @JSName("on")
    def on_error(`type`: error, listener: js.Function1[/* evt */ typings.ol.eventMod.default, Unit]): EventsKey = js.native
    def once(`type`: String, listener: js.Function1[/* p0 */ js.Any, Unit]): EventsKey | js.Array[EventsKey] = js.native
    def once(`type`: js.Array[String], listener: js.Function1[/* p0 */ js.Any, Unit]): EventsKey | js.Array[EventsKey] = js.native
    @JSName("once")
    def once_change(`type`: change, listener: js.Function1[/* evt */ typings.ol.eventMod.default, Unit]): EventsKey = js.native
    @JSName("once")
    def once_error(`type`: error, listener: js.Function1[/* evt */ typings.ol.eventMod.default, Unit]): EventsKey = js.native
    def un(`type`: String, listener: js.Function1[/* p0 */ js.Any, Unit]): Unit = js.native
    def un(`type`: js.Array[String], listener: js.Function1[/* p0 */ js.Any, Unit]): Unit = js.native
    @JSName("un")
    def un_change(`type`: change, listener: js.Function1[/* evt */ typings.ol.eventMod.default, Unit]): Unit = js.native
    @JSName("un")
    def un_error(`type`: error, listener: js.Function1[/* evt */ typings.ol.eventMod.default, Unit]): Unit = js.native
  }
  
  @js.native
  class default () extends Observable
  
  def unByKey(key: js.Array[EventsKey]): Unit = js.native
  def unByKey(key: EventsKey): Unit = js.native
}

