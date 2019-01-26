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

