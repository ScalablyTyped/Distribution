package typings
package nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var args: js.Any
  var emitter: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents
  var interrupt: scala.Null
  var mice: scala.Double
  var name: java.lang.String
  var sync: scala.Boolean
  def callback(interrupt: js.Any): js.Any
}

