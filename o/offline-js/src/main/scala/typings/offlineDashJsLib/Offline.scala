package typings
package offlineDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Offline")
@js.native
object Offline extends js.Object {
  var check: js.Function0[scala.Unit] = js.native
  var options: offlineDashJsLib.OfflineOptions = js.native
  var state: java.lang.String = js.native
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
  def `off_confirmed-down`(event: offlineDashJsLib.offlineDashJsLibStrings.`confirmed-down`): scala.Unit = js.native
  @JSName("off")
  def `off_confirmed-down`(
    event: offlineDashJsLib.offlineDashJsLibStrings.`confirmed-down`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("off")
  def `off_confirmed-up`(event: offlineDashJsLib.offlineDashJsLibStrings.`confirmed-up`): scala.Unit = js.native
  @JSName("off")
  def `off_confirmed-up`(
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
  def `off_reconnect:connecting`(event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:connecting`): scala.Unit = js.native
  @JSName("off")
  def `off_reconnect:connecting`(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:connecting`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("off")
  def `off_reconnect:failure`(event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:failure`): scala.Unit = js.native
  @JSName("off")
  def `off_reconnect:failure`(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:failure`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("off")
  def `off_reconnect:started`(event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:started`): scala.Unit = js.native
  @JSName("off")
  def `off_reconnect:started`(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:started`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("off")
  def `off_reconnect:stopped`(event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:stopped`): scala.Unit = js.native
  @JSName("off")
  def `off_reconnect:stopped`(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:stopped`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("off")
  def `off_reconnect:tick`(event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:tick`): scala.Unit = js.native
  @JSName("off")
  def `off_reconnect:tick`(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:tick`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("off")
  def `off_requests:flush`(event: offlineDashJsLib.offlineDashJsLibStrings.`requests:flush`): scala.Unit = js.native
  @JSName("off")
  def `off_requests:flush`(
    event: offlineDashJsLib.offlineDashJsLibStrings.`requests:flush`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("off")
  def `off_requests:hold`(event: offlineDashJsLib.offlineDashJsLibStrings.`requests:hold`): scala.Unit = js.native
  @JSName("off")
  def `off_requests:hold`(
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
  def `on_confirmed-down`(
    event: offlineDashJsLib.offlineDashJsLibStrings.`confirmed-down`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("on")
  def `on_confirmed-down`(
    event: offlineDashJsLib.offlineDashJsLibStrings.`confirmed-down`,
    handler: js.Function1[/* e */ stdLib.Event, _],
    context: js.Any
  ): scala.Unit = js.native
  @JSName("on")
  def `on_confirmed-up`(
    event: offlineDashJsLib.offlineDashJsLibStrings.`confirmed-up`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("on")
  def `on_confirmed-up`(
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
  def `on_reconnect:connecting`(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:connecting`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("on")
  def `on_reconnect:connecting`(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:connecting`,
    handler: js.Function1[/* e */ stdLib.Event, _],
    context: js.Any
  ): scala.Unit = js.native
  @JSName("on")
  def `on_reconnect:failure`(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:failure`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("on")
  def `on_reconnect:failure`(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:failure`,
    handler: js.Function1[/* e */ stdLib.Event, _],
    context: js.Any
  ): scala.Unit = js.native
  @JSName("on")
  def `on_reconnect:started`(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:started`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("on")
  def `on_reconnect:started`(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:started`,
    handler: js.Function1[/* e */ stdLib.Event, _],
    context: js.Any
  ): scala.Unit = js.native
  @JSName("on")
  def `on_reconnect:stopped`(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:stopped`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("on")
  def `on_reconnect:stopped`(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:stopped`,
    handler: js.Function1[/* e */ stdLib.Event, _],
    context: js.Any
  ): scala.Unit = js.native
  @JSName("on")
  def `on_reconnect:tick`(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:tick`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("on")
  def `on_reconnect:tick`(
    event: offlineDashJsLib.offlineDashJsLibStrings.`reconnect:tick`,
    handler: js.Function1[/* e */ stdLib.Event, _],
    context: js.Any
  ): scala.Unit = js.native
  @JSName("on")
  def `on_requests:flush`(
    event: offlineDashJsLib.offlineDashJsLibStrings.`requests:flush`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("on")
  def `on_requests:flush`(
    event: offlineDashJsLib.offlineDashJsLibStrings.`requests:flush`,
    handler: js.Function1[/* e */ stdLib.Event, _],
    context: js.Any
  ): scala.Unit = js.native
  @JSName("on")
  def `on_requests:hold`(
    event: offlineDashJsLib.offlineDashJsLibStrings.`requests:hold`,
    handler: js.Function1[/* e */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("on")
  def `on_requests:hold`(
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

