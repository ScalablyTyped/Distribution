package typings.postmark.statsMod

import typings.postmark.anon.Tracked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackedEmailCounts extends js.Object {
  var Days: js.Array[Tracked]
  var Tracked: Double
}

object TrackedEmailCounts {
  @scala.inline
  def apply(Days: js.Array[Tracked], Tracked: Double): TrackedEmailCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Tracked = Tracked.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackedEmailCounts]
  }
}

