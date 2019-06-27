package typings
package olLib.observableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observable
  extends olLib.eventsTargetMod.default {
  def changed(): scala.Unit = js.native
  def getRevision(): scala.Double = js.native
  def on(`type`: java.lang.String, listener: js.Function1[/* p0 */ js.Any, scala.Unit]): olLib.eventsMod.EventsKey | js.Array[olLib.eventsMod.EventsKey] = js.native
  def on(`type`: js.Array[java.lang.String], listener: js.Function1[/* p0 */ js.Any, scala.Unit]): olLib.eventsMod.EventsKey | js.Array[olLib.eventsMod.EventsKey] = js.native
  @JSName("on")
  def on_change(
    `type`: olLib.olLibStrings.change,
    listener: js.Function1[/* evt */ olLib.eventsEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  def once(`type`: java.lang.String, listener: js.Function1[/* p0 */ js.Any, scala.Unit]): olLib.eventsMod.EventsKey | js.Array[olLib.eventsMod.EventsKey] = js.native
  def once(`type`: js.Array[java.lang.String], listener: js.Function1[/* p0 */ js.Any, scala.Unit]): olLib.eventsMod.EventsKey | js.Array[olLib.eventsMod.EventsKey] = js.native
  @JSName("once")
  def once_change(
    `type`: olLib.olLibStrings.change,
    listener: js.Function1[/* evt */ olLib.eventsEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  def un(`type`: java.lang.String, listener: js.Function1[/* p0 */ js.Any, scala.Unit]): scala.Unit = js.native
  def un(`type`: js.Array[java.lang.String], listener: js.Function1[/* p0 */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("un")
  def un_change(
    `type`: olLib.olLibStrings.change,
    listener: js.Function1[/* evt */ olLib.eventsEventMod.default, scala.Unit]
  ): scala.Unit = js.native
}

