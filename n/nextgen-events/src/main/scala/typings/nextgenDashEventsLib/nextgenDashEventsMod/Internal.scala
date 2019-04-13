package typings
package nextgenDashEventsLib.nextgenDashEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nextgen-events", "Internal")
@js.native
class Internal () extends js.Object {
  def this(from: NextGenEvents) = this()
  var contexts: org.scalablytyped.runtime.StringDictionary[Context] = js.native
  var depth: scala.Double = js.native
  var interruptible: scala.Boolean = js.native
  var listeners: Listeners = js.native
  var maxListeners: scala.Double = js.native
  var nice: scala.Double = js.native
  var stateGroups: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var states: States = js.native
  def desync(fn: js.Function1[/* repeated */ js.Any, scala.Unit], args: js.Any*): scala.Unit = js.native
}

