package typings.nise.mod

import typings.nise.AnonAbort
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FakeUploadProgress extends js.Object {
  var eventListeners: AnonAbort
  def addEventListener(event: String, listener: js.Function1[/* e */ Event_, _]): Unit
  def dispatchEvent(event: Event_): Unit
  def removeEventListener(event: String, listener: js.Function1[/* e */ Event_, _]): Unit
}

object FakeUploadProgress {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* e */ Event_, _]) => Unit,
    dispatchEvent: Event_ => Unit,
    eventListeners: AnonAbort,
    removeEventListener: (String, js.Function1[/* e */ Event_, _]) => Unit
  ): FakeUploadProgress = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), eventListeners = eventListeners.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener))
  
    __obj.asInstanceOf[FakeUploadProgress]
  }
}

