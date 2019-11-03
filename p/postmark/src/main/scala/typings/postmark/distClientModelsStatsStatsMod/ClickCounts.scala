package typings.postmark.distClientModelsStatsStatsMod

import typings.postmark.Anon_Clicks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickCounts extends js.Object {
  var Clicks: Double
  var Days: js.Array[Anon_Clicks]
  var Unique: Double
}

object ClickCounts {
  @scala.inline
  def apply(Clicks: Double, Days: js.Array[Anon_Clicks], Unique: Double): ClickCounts = {
    val __obj = js.Dynamic.literal(Clicks = Clicks, Days = Days, Unique = Unique)
  
    __obj.asInstanceOf[ClickCounts]
  }
}

