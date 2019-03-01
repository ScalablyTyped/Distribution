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
    addEventListener: js.Function2[java.lang.String, js.Function1[/* e */ stdLib.Event, _], scala.Unit],
    dispatchEvent: js.Function1[stdLib.Event, scala.Unit],
    eventListeners: niseLib.Anon_Abort,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* e */ stdLib.Event, _], scala.Unit]
  ): FakeUploadProgress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("dispatchEvent")(dispatchEvent)
    __obj.updateDynamic("eventListeners")(eventListeners)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.asInstanceOf[FakeUploadProgress]
  }
}

