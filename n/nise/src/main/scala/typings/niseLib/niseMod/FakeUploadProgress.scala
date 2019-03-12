package typings
package niseLib.niseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FakeUploadProgress extends js.Object {
  var eventListeners: niseLib.Anon_Abort
  def addEventListener(event: java.lang.String, listener: js.Function1[/* e */ stdLib.Event, _]): scala.Unit
  def dispatchEvent(event: stdLib.Event): scala.Unit
  def removeEventListener(event: java.lang.String, listener: js.Function1[/* e */ stdLib.Event, _]): scala.Unit
}

object FakeUploadProgress {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* e */ stdLib.Event, _]) => scala.Unit,
    dispatchEvent: stdLib.Event => scala.Unit,
    eventListeners: niseLib.Anon_Abort,
    removeEventListener: (java.lang.String, js.Function1[/* e */ stdLib.Event, _]) => scala.Unit
  ): FakeUploadProgress = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), eventListeners = eventListeners, removeEventListener = js.Any.fromFunction2(removeEventListener))
  
    __obj.asInstanceOf[FakeUploadProgress]
  }
}

