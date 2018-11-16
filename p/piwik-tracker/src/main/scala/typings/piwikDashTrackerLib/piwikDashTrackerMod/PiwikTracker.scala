package typings
package piwikDashTrackerLib.piwikDashTrackerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PiwikTracker
  extends nodeLib.eventsMod.EventEmitter {
  def track(options: PiwikTrackOptions): scala.Unit = js.native
}

