package typings.naja.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NajaEventsMap extends js.Object {
  var abort: NajaEventListener[AbortEvent] = js.native
  var before: NajaEventListener[BeforeEvent[RequestData]] = js.native
  var complete: NajaEventListener[CompleteEvent[_]] = js.native
  var error: NajaEventListener[ErrorEvent[_]] = js.native
  var init: NajaEventListener[InitEvent] = js.native
  var interaction: NajaEventListener[InteractionEvent] = js.native
  var load: NajaEventListener[Event] = js.native
  var start: NajaEventListener[StartEvent] = js.native
  var success: NajaEventListener[SuccessEvent[_]] = js.native
}

object NajaEventsMap {
  @scala.inline
  def apply(
    abort: NajaEventListener[AbortEvent],
    before: NajaEventListener[BeforeEvent[RequestData]],
    complete: NajaEventListener[CompleteEvent[_]],
    error: NajaEventListener[ErrorEvent[_]],
    init: NajaEventListener[InitEvent],
    interaction: NajaEventListener[InteractionEvent],
    load: NajaEventListener[Event],
    start: NajaEventListener[StartEvent],
    success: NajaEventListener[SuccessEvent[_]]
  ): NajaEventsMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[NajaEventsMap]
  }
  @scala.inline
  implicit class NajaEventsMapOps[Self <: NajaEventsMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbortFunction1(value: AbortEvent => js.Promise[Unit] | Unit): Self = this.set("abort", js.Any.fromFunction1(value))
    @scala.inline
    def setAbort(value: NajaEventListener[AbortEvent]): Self = this.set("abort", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforeFunction1(value: BeforeEvent[RequestData] => js.Promise[Unit] | Unit): Self = this.set("before", js.Any.fromFunction1(value))
    @scala.inline
    def setBefore(value: NajaEventListener[BeforeEvent[RequestData]]): Self = this.set("before", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompleteFunction1(value: CompleteEvent[_] => js.Promise[Unit] | Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def setComplete(value: NajaEventListener[CompleteEvent[_]]): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorFunction1(value: ErrorEvent[_] => js.Promise[Unit] | Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def setError(value: NajaEventListener[ErrorEvent[_]]): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitFunction1(value: InitEvent => js.Promise[Unit] | Unit): Self = this.set("init", js.Any.fromFunction1(value))
    @scala.inline
    def setInit(value: NajaEventListener[InitEvent]): Self = this.set("init", value.asInstanceOf[js.Any])
    @scala.inline
    def setInteractionFunction1(value: InteractionEvent => js.Promise[Unit] | Unit): Self = this.set("interaction", js.Any.fromFunction1(value))
    @scala.inline
    def setInteraction(value: NajaEventListener[InteractionEvent]): Self = this.set("interaction", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadFunction1(value: Event => js.Promise[Unit] | Unit): Self = this.set("load", js.Any.fromFunction1(value))
    @scala.inline
    def setLoad(value: NajaEventListener[Event]): Self = this.set("load", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartFunction1(value: StartEvent => js.Promise[Unit] | Unit): Self = this.set("start", js.Any.fromFunction1(value))
    @scala.inline
    def setStart(value: NajaEventListener[StartEvent]): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccessFunction1(value: SuccessEvent[_] => js.Promise[Unit] | Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def setSuccess(value: NajaEventListener[SuccessEvent[_]]): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}

