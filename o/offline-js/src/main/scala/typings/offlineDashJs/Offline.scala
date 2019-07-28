package typings.offlineDashJs

import typings.offlineDashJs.offlineDashJsStrings.`confirmed-down`
import typings.offlineDashJs.offlineDashJsStrings.`confirmed-up`
import typings.offlineDashJs.offlineDashJsStrings.`reconnect:connecting`
import typings.offlineDashJs.offlineDashJsStrings.`reconnect:failure`
import typings.offlineDashJs.offlineDashJsStrings.`reconnect:started`
import typings.offlineDashJs.offlineDashJsStrings.`reconnect:stopped`
import typings.offlineDashJs.offlineDashJsStrings.`reconnect:tick`
import typings.offlineDashJs.offlineDashJsStrings.`requests:flush`
import typings.offlineDashJs.offlineDashJsStrings.`requests:hold`
import typings.offlineDashJs.offlineDashJsStrings.checking
import typings.offlineDashJs.offlineDashJsStrings.down
import typings.offlineDashJs.offlineDashJsStrings.up
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Offline")
@js.native
object Offline extends js.Object {
  var options: OfflineOptions = js.native
  var state: String = js.native
  def check(): Unit = js.native
  def off(event: String): Unit = js.native
  def off(event: String, handler: js.Function1[/* e */ Event, _]): Unit = js.native
  @JSName("off")
  def off_checking(event: checking): Unit = js.native
  @JSName("off")
  def off_checking(event: checking, handler: js.Function1[/* e */ Event, _]): Unit = js.native
  @JSName("off")
  def off_confirmeddown(event: `confirmed-down`): Unit = js.native
  @JSName("off")
  def off_confirmeddown(event: `confirmed-down`, handler: js.Function1[/* e */ Event, _]): Unit = js.native
  @JSName("off")
  def off_confirmedup(event: `confirmed-up`): Unit = js.native
  @JSName("off")
  def off_confirmedup(event: `confirmed-up`, handler: js.Function1[/* e */ Event, _]): Unit = js.native
  @JSName("off")
  def off_down(event: down): Unit = js.native
  @JSName("off")
  def off_down(event: down, handler: js.Function1[/* e */ Event, _]): Unit = js.native
  @JSName("off")
  def off_reconnectconnecting(event: `reconnect:connecting`): Unit = js.native
  @JSName("off")
  def off_reconnectconnecting(event: `reconnect:connecting`, handler: js.Function1[/* e */ Event, _]): Unit = js.native
  @JSName("off")
  def off_reconnectfailure(event: `reconnect:failure`): Unit = js.native
  @JSName("off")
  def off_reconnectfailure(event: `reconnect:failure`, handler: js.Function1[/* e */ Event, _]): Unit = js.native
  @JSName("off")
  def off_reconnectstarted(event: `reconnect:started`): Unit = js.native
  @JSName("off")
  def off_reconnectstarted(event: `reconnect:started`, handler: js.Function1[/* e */ Event, _]): Unit = js.native
  @JSName("off")
  def off_reconnectstopped(event: `reconnect:stopped`): Unit = js.native
  @JSName("off")
  def off_reconnectstopped(event: `reconnect:stopped`, handler: js.Function1[/* e */ Event, _]): Unit = js.native
  @JSName("off")
  def off_reconnecttick(event: `reconnect:tick`): Unit = js.native
  @JSName("off")
  def off_reconnecttick(event: `reconnect:tick`, handler: js.Function1[/* e */ Event, _]): Unit = js.native
  @JSName("off")
  def off_requestsflush(event: `requests:flush`): Unit = js.native
  @JSName("off")
  def off_requestsflush(event: `requests:flush`, handler: js.Function1[/* e */ Event, _]): Unit = js.native
  @JSName("off")
  def off_requestshold(event: `requests:hold`): Unit = js.native
  @JSName("off")
  def off_requestshold(event: `requests:hold`, handler: js.Function1[/* e */ Event, _]): Unit = js.native
  @JSName("off")
  def off_up(event: up): Unit = js.native
  @JSName("off")
  def off_up(event: up, handler: js.Function1[/* e */ Event, _]): Unit = js.native
  def on(event: String, handler: js.Function1[/* e */ Event, _]): Unit = js.native
  def on(event: String, handler: js.Function1[/* e */ Event, _], context: js.Any): Unit = js.native
  @JSName("on")
  def on_checking(event: checking, handler: js.Function1[/* e */ Event, _]): Unit = js.native
  @JSName("on")
  def on_checking(event: checking, handler: js.Function1[/* e */ Event, _], context: js.Any): Unit = js.native
  @JSName("on")
  def on_confirmeddown(event: `confirmed-down`, handler: js.Function1[/* e */ Event, _]): Unit = js.native
  @JSName("on")
  def on_confirmeddown(event: `confirmed-down`, handler: js.Function1[/* e */ Event, _], context: js.Any): Unit = js.native
  @JSName("on")
  def on_confirmedup(event: `confirmed-up`, handler: js.Function1[/* e */ Event, _]): Unit = js.native
  @JSName("on")
  def on_confirmedup(event: `confirmed-up`, handler: js.Function1[/* e */ Event, _], context: js.Any): Unit = js.native
  @JSName("on")
  def on_down(event: down, handler: js.Function1[/* e */ Event, _]): Unit = js.native
  @JSName("on")
  def on_down(event: down, handler: js.Function1[/* e */ Event, _], context: js.Any): Unit = js.native
  @JSName("on")
  def on_reconnectconnecting(event: `reconnect:connecting`, handler: js.Function1[/* e */ Event, _]): Unit = js.native
  @JSName("on")
  def on_reconnectconnecting(event: `reconnect:connecting`, handler: js.Function1[/* e */ Event, _], context: js.Any): Unit = js.native
  @JSName("on")
  def on_reconnectfailure(event: `reconnect:failure`, handler: js.Function1[/* e */ Event, _]): Unit = js.native
  @JSName("on")
  def on_reconnectfailure(event: `reconnect:failure`, handler: js.Function1[/* e */ Event, _], context: js.Any): Unit = js.native
  @JSName("on")
  def on_reconnectstarted(event: `reconnect:started`, handler: js.Function1[/* e */ Event, _]): Unit = js.native
  @JSName("on")
  def on_reconnectstarted(event: `reconnect:started`, handler: js.Function1[/* e */ Event, _], context: js.Any): Unit = js.native
  @JSName("on")
  def on_reconnectstopped(event: `reconnect:stopped`, handler: js.Function1[/* e */ Event, _]): Unit = js.native
  @JSName("on")
  def on_reconnectstopped(event: `reconnect:stopped`, handler: js.Function1[/* e */ Event, _], context: js.Any): Unit = js.native
  @JSName("on")
  def on_reconnecttick(event: `reconnect:tick`, handler: js.Function1[/* e */ Event, _]): Unit = js.native
  @JSName("on")
  def on_reconnecttick(event: `reconnect:tick`, handler: js.Function1[/* e */ Event, _], context: js.Any): Unit = js.native
  @JSName("on")
  def on_requestsflush(event: `requests:flush`, handler: js.Function1[/* e */ Event, _]): Unit = js.native
  @JSName("on")
  def on_requestsflush(event: `requests:flush`, handler: js.Function1[/* e */ Event, _], context: js.Any): Unit = js.native
  @JSName("on")
  def on_requestshold(event: `requests:hold`, handler: js.Function1[/* e */ Event, _]): Unit = js.native
  @JSName("on")
  def on_requestshold(event: `requests:hold`, handler: js.Function1[/* e */ Event, _], context: js.Any): Unit = js.native
  @JSName("on")
  def on_up(event: up, handler: js.Function1[/* e */ Event, _]): Unit = js.native
  @JSName("on")
  def on_up(event: up, handler: js.Function1[/* e */ Event, _], context: js.Any): Unit = js.native
}

