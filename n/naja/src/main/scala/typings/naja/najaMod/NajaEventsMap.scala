package typings.naja.najaMod

import typings.naja.Anon_EventHandleEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NajaEventsMap extends js.Object {
  @JSName("abort")
  var abort_Original: NajaEventListener[AbortEvent] = js.native
  @JSName("before")
  var before_Original: NajaEventListener[BeforeEvent[RequestData]] = js.native
  @JSName("complete")
  var complete_Original: NajaEventListener[CompleteEvent[_]] = js.native
  @JSName("error")
  var error_Original: NajaEventListener[ErrorEvent[_]] = js.native
  @JSName("init")
  var init_Original: NajaEventListener[InitEvent] = js.native
  @JSName("interaction")
  var interaction_Original: NajaEventListener[InteractionEvent] = js.native
  @JSName("load")
  var load_Original: NajaEventListener[Event] = js.native
  @JSName("start")
  var start_Original: NajaEventListener[StartEvent] = js.native
  @JSName("success")
  var success_Original: NajaEventListener[SuccessEvent[_]] = js.native
  def abort(event: AbortEvent): Unit | Anon_EventHandleEvent[AbortEvent] = js.native
  def before(event: BeforeEvent[RequestData]): Unit | Anon_EventHandleEvent[BeforeEvent[RequestData]] = js.native
  def complete(event: CompleteEvent[_]): Unit | Anon_EventHandleEvent[CompleteEvent[_]] = js.native
  def error(event: ErrorEvent[_]): Unit | Anon_EventHandleEvent[ErrorEvent[_]] = js.native
  def init(event: InitEvent): Unit | Anon_EventHandleEvent[InitEvent] = js.native
  def interaction(event: InteractionEvent): Unit | Anon_EventHandleEvent[InteractionEvent] = js.native
  def load(event: Event): Unit | Anon_EventHandleEvent[Event] = js.native
  def start(event: StartEvent): Unit | Anon_EventHandleEvent[StartEvent] = js.native
  def success(event: SuccessEvent[_]): Unit | Anon_EventHandleEvent[SuccessEvent[_]] = js.native
}

