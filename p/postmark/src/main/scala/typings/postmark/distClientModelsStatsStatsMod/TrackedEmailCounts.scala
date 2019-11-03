package typings.postmark.distClientModelsStatsStatsMod

import typings.postmark.Anon_DateTracked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackedEmailCounts extends js.Object {
  var Days: js.Array[Anon_DateTracked]
  var Tracked: Double
}

object TrackedEmailCounts {
  @scala.inline
  def apply(Days: js.Array[Anon_DateTracked], Tracked: Double): TrackedEmailCounts = {
    val __obj = js.Dynamic.literal(Days = Days, Tracked = Tracked)
  
    __obj.asInstanceOf[TrackedEmailCounts]
  }
}

