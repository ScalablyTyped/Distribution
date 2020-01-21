package typings.nextgenEvents.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nextgen-events", "Internal")
@js.native
class Internal () extends js.Object {
  def this(from: NextGenEvents) = this()
  var contexts: StringDictionary[Context] = js.native
  var depth: Double = js.native
  var interruptible: Boolean = js.native
  var listeners: Listeners = js.native
  var maxListeners: Double = js.native
  var nice: Double = js.native
  var stateGroups: StringDictionary[js.Any] = js.native
  var states: States = js.native
  def desync(fn: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Unit = js.native
}

