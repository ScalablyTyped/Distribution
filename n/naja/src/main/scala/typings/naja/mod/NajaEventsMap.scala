package typings.naja.mod

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NajaEventsMap extends js.Object {
  var abort: NajaEventListener[AbortEvent]
  var before: NajaEventListener[BeforeEvent[RequestData]]
  var complete: NajaEventListener[CompleteEvent[_]]
  var error: NajaEventListener[ErrorEvent[_]]
  var init: NajaEventListener[InitEvent]
  var interaction: NajaEventListener[InteractionEvent]
  var load: NajaEventListener[Event_]
  var start: NajaEventListener[StartEvent]
  var success: NajaEventListener[SuccessEvent[_]]
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
    load: NajaEventListener[Event_],
    start: NajaEventListener[StartEvent],
    success: NajaEventListener[SuccessEvent[_]]
  ): NajaEventsMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NajaEventsMap]
  }
}

