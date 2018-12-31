package typings
package niseLib.niseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FakeUploadProgress extends js.Object {
  var eventListeners: niseLib.Anon_Progress
  def addEventListener(event: java.lang.String, listener: js.Function1[/* e */ stdLib.Event, _]): scala.Unit
  def dispatchEvent(event: stdLib.Event): scala.Unit
  def removeEventListener(event: java.lang.String, listener: js.Function1[/* e */ stdLib.Event, _]): scala.Unit
}

