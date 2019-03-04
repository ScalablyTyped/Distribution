package typings
package nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Internal extends js.Object {
  var contexts: org.scalablytyped.runtime.StringDictionary[Context]
  var depth: scala.Double
  var interruptible: scala.Boolean
  var listeners: Listeners
  var maxListeners: scala.Double
  var nice: scala.Double
  var stateGroups: org.scalablytyped.runtime.StringDictionary[js.Any]
  var states: States
  def desync(fn: js.Function1[/* repeated */ js.Any, scala.Unit], args: js.Any*): scala.Unit
}

object Internal {
  @scala.inline
  def apply(
    contexts: org.scalablytyped.runtime.StringDictionary[Context],
    depth: scala.Double,
    desync: js.Function2[js.Function1[/* repeated */ js.Any, scala.Unit], /* repeated */ js.Any, scala.Unit],
    interruptible: scala.Boolean,
    listeners: Listeners,
    maxListeners: scala.Double,
    nice: scala.Double,
    stateGroups: org.scalablytyped.runtime.StringDictionary[js.Any],
    states: States
  ): Internal = {
    val __obj = js.Dynamic.literal(contexts = contexts, depth = depth, desync = desync, interruptible = interruptible, listeners = listeners, maxListeners = maxListeners, nice = nice, stateGroups = stateGroups, states = states)
  
    __obj.asInstanceOf[Internal]
  }
}

