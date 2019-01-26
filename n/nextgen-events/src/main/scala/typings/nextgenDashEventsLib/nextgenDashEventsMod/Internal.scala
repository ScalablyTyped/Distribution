package typings
package nextgenDashEventsLib.nextgenDashEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nextgen-events", "Internal")
@js.native
class Internal ()
  extends nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.Internal {
  def this(from: NextGenEvents) = this()
  /* CompleteClass */
  override var contexts: org.scalablytyped.runtime.StringDictionary[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.Context] = js.native
  /* CompleteClass */
  override var depth: scala.Double = js.native
  /* CompleteClass */
  override var interruptible: scala.Boolean = js.native
  /* CompleteClass */
  override var listeners: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.Listeners = js.native
  /* CompleteClass */
  override var maxListeners: scala.Double = js.native
  /* CompleteClass */
  override var nice: scala.Double = js.native
  /* CompleteClass */
  override var stateGroups: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /* CompleteClass */
  override var states: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.States = js.native
  /* CompleteClass */
  override def desync(fn: js.Function1[/* repeated */ js.Any, scala.Unit], args: js.Any*): scala.Unit = js.native
}

