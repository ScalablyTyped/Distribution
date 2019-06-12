package typings
package offlineDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Offline")
@js.native
object Offline extends js.Object {
  var options: offlineDashJsLib.OfflineOptions = js.native
  var state: java.lang.String = js.native
  def check(): scala.Unit = js.native
  def off(event: java.lang.String): scala.Unit = js.native
  def off(event: java.lang.String, handler: js.Function1[/* e */ stdLib.Event, _]): scala.Unit = js.native
  @JSName("off")
  def off_checking(event: offlineDashJsLib.offlineDashJsLibStrings.checking): scala.Unit = js.native
  @JSName("off")
  def off_checking(
    event: offlineDashJsLib.offlineDashJsLibStrings.checking,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("off")
  def off_confirmeddown(event: offlineDashJsLib.offlineDashJsLibStrings.`confirmed-down`): scala.Unit = js.native
  @JSName("off")
  def off_confirmeddown(
    event: offlineDashJsLib.offlineDashJsLibStrings.`confirmed-down`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("off")
  def off_confirmedup(event: offlineDashJsLib.offlineDashJsLibStrings.`confirmed-up`): scala.Unit = js.native
  @JSName("off")
  def off_confirmedup(
    event: offlineDashJsLib.offlineDashJsLibStrings.`confirmed-up`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("off")
  def off_down(event: offlineDashJsLib.offlineDashJsLibStrings.down): scala.Unit = js.native
  @JSName("off")
  def off_down(
    event: offlineDashJsLib.offlineDashJsLibStrings.down,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("off")
  def off_reconnectconnecting(event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:connecting`): scala.Unit = js.native
  @JSName("off")
  def off_reconnectconnecting(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:connecting`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("off")
  def off_reconnectfailure(event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:failure`): scala.Unit = js.native
  @JSName("off")
  def off_reconnectfailure(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:failure`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("off")
  def off_reconnectstarted(event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:started`): scala.Unit = js.native
  @JSName("off")
  def off_reconnectstarted(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:started`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("off")
  def off_reconnectstopped(event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:stopped`): scala.Unit = js.native
  @JSName("off")
  def off_reconnectstopped(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:stopped`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("off")
  def off_reconnecttick(event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:tick`): scala.Unit = js.native
  @JSName("off")
  def off_reconnecttick(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:tick`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("off")
  def off_requestsflush(event: offlineDashJsLib.offlineDashJsLibStrings.`requests:flush`): scala.Unit = js.native
  @JSName("off")
  def off_requestsflush(
    event: offlineDashJsLib.offlineDashJsLibStrings.`requests:flush`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("off")
  def off_requestshold(event: offlineDashJsLib.offlineDashJsLibStrings.`requests:hold`): scala.Unit = js.native
  @JSName("off")
  def off_requestshold(
    event: offlineDashJsLib.offlineDashJsLibStrings.`requests:hold`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("off")
  def off_up(event: offlineDashJsLib.offlineDashJsLibStrings.up): scala.Unit = js.native
  @JSName("off")
  def off_up(event: offlineDashJsLib.offlineDashJsLibStrings.up, handler: js.Function1[/* e */ stdLib.Event, _]): scala.Unit = js.native
  def on(event: java.lang.String, handler: js.Function1[/* e */ stdLib.Event, _]): scala.Unit = js.native
  def on(event: java.lang.String, handler: js.Function1[/* e */ stdLib.Event, _], context: js.Any): scala.Unit = js.native
  @JSName("on")
  def on_checking(
    event: offlineDashJsLib.offlineDashJsLibStrings.checking,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("on")
  def on_checking(
    event: offlineDashJsLib.offlineDashJsLibStrings.checking,
    handler: js.Function1[/* e */ stdLib.Event, _],
    context: js.Any
  ): scala.Unit = js.native
  @JSName("on")
  def on_confirmeddown(
    event: offlineDashJsLib.offlineDashJsLibStrings.`confirmed-down`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("on")
  def on_confirmeddown(
    event: offlineDashJsLib.offlineDashJsLibStrings.`confirmed-down`,
    handler: js.Function1[/* e */ stdLib.Event, _],
    context: js.Any
  ): scala.Unit = js.native
  @JSName("on")
  def on_confirmedup(
    event: offlineDashJsLib.offlineDashJsLibStrings.`confirmed-up`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("on")
  def on_confirmedup(
    event: offlineDashJsLib.offlineDashJsLibStrings.`confirmed-up`,
    handler: js.Function1[/* e */ stdLib.Event, _],
    context: js.Any
  ): scala.Unit = js.native
  @JSName("on")
  def on_down(
    event: offlineDashJsLib.offlineDashJsLibStrings.down,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("on")
  def on_down(
    event: offlineDashJsLib.offlineDashJsLibStrings.down,
    handler: js.Function1[/* e */ stdLib.Event, _],
    context: js.Any
  ): scala.Unit = js.native
  @JSName("on")
  def on_reconnectconnecting(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:connecting`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("on")
  def on_reconnectconnecting(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:connecting`,
    handler: js.Function1[/* e */ stdLib.Event, _],
    context: js.Any
  ): scala.Unit = js.native
  @JSName("on")
  def on_reconnectfailure(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:failure`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("on")
  def on_reconnectfailure(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:failure`,
    handler: js.Function1[/* e */ stdLib.Event, _],
    context: js.Any
  ): scala.Unit = js.native
  @JSName("on")
  def on_reconnectstarted(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:started`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("on")
  def on_reconnectstarted(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:started`,
    handler: js.Function1[/* e */ stdLib.Event, _],
    context: js.Any
  ): scala.Unit = js.native
  @JSName("on")
  def on_reconnectstopped(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:stopped`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("on")
  def on_reconnectstopped(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:stopped`,
    handler: js.Function1[/* e */ stdLib.Event, _],
    context: js.Any
  ): scala.Unit = js.native
  @JSName("on")
  def on_reconnecttick(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:tick`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("on")
  def on_reconnecttick(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:tick`,
    handler: js.Function1[/* e */ stdLib.Event, _],
    context: js.Any
  ): scala.Unit = js.native
  @JSName("on")
  def on_requestsflush(
    event: offlineDashJsLib.offlineDashJsLibStrings.`requests:flush`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("on")
  def on_requestsflush(
    event: offlineDashJsLib.offlineDashJsLibStrings.`requests:flush`,
    handler: js.Function1[/* e */ stdLib.Event, _],
    context: js.Any
  ): scala.Unit = js.native
  @JSName("on")
  def on_requestshold(
    event: offlineDashJsLib.offlineDashJsLibStrings.`requests:hold`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("on")
  def on_requestshold(
    event: offlineDashJsLib.offlineDashJsLibStrings.`requests:hold`,
    handler: js.Function1[/* e */ stdLib.Event, _],
    context: js.Any
  ): scala.Unit = js.native
  @JSName("on")
  def on_up(event: offlineDashJsLib.offlineDashJsLibStrings.up, handler: js.Function1[/* e */ stdLib.Event, _]): scala.Unit = js.native
  @JSName("on")
  def on_up(
    event: offlineDashJsLib.offlineDashJsLibStrings.up,
    handler: js.Function1[/* e */ stdLib.Event, _],
    context: js.Any
  ): scala.Unit = js.native
}

