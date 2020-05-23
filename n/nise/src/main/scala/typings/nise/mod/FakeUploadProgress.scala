package typings.nise.mod

import typings.nise.anon.Abort
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FakeUploadProgress extends js.Object {
  var eventListeners: Abort
  def addEventListener(event: String, listener: js.Function1[/* e */ Event, _]): Unit
  def dispatchEvent(event: Event): Unit
  def removeEventListener(event: String, listener: js.Function1[/* e */ Event, _]): Unit
}

object FakeUploadProgress {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* e */ Event, _]) => Unit,
    dispatchEvent: Event => Unit,
    eventListeners: Abort,
    removeEventListener: (String, js.Function1[/* e */ Event, _]) => Unit
  ): FakeUploadProgress = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), eventListeners = eventListeners.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[FakeUploadProgress]
  }
}

